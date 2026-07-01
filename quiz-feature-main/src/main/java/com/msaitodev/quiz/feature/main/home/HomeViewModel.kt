package com.msaitodev.quiz.feature.main.home

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.msaitodev.core.ads.RewardedHelper
import com.msaitodev.core.common.config.AppAssetConfig
import com.msaitodev.core.notifications.ReminderRepository
import com.msaitodev.feature.settings.SettingsProvider
import com.msaitodev.quiz.core.domain.config.RemoteConfigKeys
import com.msaitodev.quiz.core.domain.model.LearningAnalysis
import com.msaitodev.quiz.core.domain.model.QuotaState
import com.msaitodev.quiz.core.domain.model.TrendPeriod
import com.msaitodev.quiz.core.domain.repository.PremiumRepository
import com.msaitodev.quiz.core.domain.repository.RemoteConfigRepository
import com.msaitodev.quiz.core.domain.repository.StudyQuotaRepository
import com.msaitodev.quiz.core.domain.usecase.GetLearningAnalysisUseCase
import com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.concurrent.TimeUnit
import javax.inject.Inject

// HomeViewModelが発行する「イベント」を定義。
sealed interface HomeEvent {
    object RequestNavigateToQuiz : HomeEvent
    object RequestNavigateToAnalysis : HomeEvent
    object RequestShowRewardedAdOffer : HomeEvent
    object RequestShowPaywall : HomeEvent
    object RequestNavigateToSettings : HomeEvent
    object QuotaExceeded : HomeEvent
    object RewardLimitReached : HomeEvent
    object RewardGranted : HomeEvent
    object RewardGrantFailed : HomeEvent
    data class ShowMessage(val message: String) : HomeEvent
}

@HiltViewModel
class HomeViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val quotaRepo: StudyQuotaRepository,
    private val rewardedHelper: RewardedHelper,
    private val settingsProvider: SettingsProvider,
    premiumRepo: PremiumRepository,
    private val remoteConfigRepo: RemoteConfigRepository,
    private val startNextQuiz: StartNextQuizUseCase,
    private val reminderRepo: ReminderRepository,
    private val getLearningAnalysis: GetLearningAnalysisUseCase,
    private val appAssetConfig: AppAssetConfig
) : ViewModel() {

    private val isPremium: StateFlow<Boolean> = premiumRepo.isPremium

    // ユーザーがそのセッションで誘導を閉じたかどうかを管理
    private val _isReminderInvitationDismissed = MutableStateFlow(false)

    // 追加: RemoteConfig から取得した情報を管理する StateFlow
    private val _appSpecificInfo = MutableStateFlow<Map<String, Any>>(emptyMap())

    // 学習分析データを取得するための Flow
    private val analysisFlow: StateFlow<LearningAnalysis?> = getLearningAnalysis(TrendPeriod.DAILY)
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    init {
        viewModelScope.launch {
            // Remote Config を最新化
            remoteConfigRepo.fetch()
            updateAppSpecificInfo()
        }
    }

    private fun updateAppSpecificInfo() {
        val packageName = context.packageName
        val info = mutableMapOf<String, Any>()

        // 次回試験日の取得と整形
        // キー名を exam_date_[パッケージ名の_変換] に変更
        val examDateKey = "exam_date_${packageName.replace('.', '_')}"
        val rawDate = remoteConfigRepo.getString(examDateKey)
        if (rawDate.length == 8) {
            try {
                // YYYYMMDD をパース
                val sdf = SimpleDateFormat("yyyyMMdd", Locale.US)
                val date = sdf.parse(rawDate)
                if (date != null) {
                    // 1. フォーマット済み日付
                    val formatted = SimpleDateFormat("yyyy年MM月dd日（E）", Locale.JAPANESE).format(date)
                    info["exam_date"] = formatted

                    // 2. 残り日数の計算
                    val today = Calendar.getInstance().apply {
                        set(Calendar.HOUR_OF_DAY, 0)
                        set(Calendar.MINUTE, 0)
                        set(Calendar.SECOND, 0)
                        set(Calendar.MILLISECOND, 0)
                    }.timeInMillis
                    val examTime = date.time
                    val diff = examTime - today
                    val days = TimeUnit.MILLISECONDS.toDays(diff).toInt()
                    if (days >= 0) {
                        info["remaining_days"] = days
                    }
                }
            } catch (e: Exception) {
                // 解析失敗時は表示しない
            }
        }

        _appSpecificInfo.value = info
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private val quotaFlow: StateFlow<QuotaState?> = isPremium.flatMapLatest { isPremiumValue ->
        val limitKey = if (isPremiumValue) RemoteConfigKeys.PREMIUM_DAILY_SETS else RemoteConfigKeys.FREE_DAILY_SETS
        val limit = remoteConfigRepo.getLong(limitKey).toInt()
        quotaRepo.observe { limit }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    enum class PredictedScoreStatus {
        NOT_ATTEMPTED,
        BELOW_PASSING,
        PASSING
    }

    data class HomeUiState(
        val canStart: Boolean = false,
        val isLoading: Boolean = false,
        val isPremium: Boolean = false,
        val showReminderInvitation: Boolean = false,
        val examDateText: String? = null,
        val remainingDays: Int? = null,
        val streakDays: Int = 0,
        val scoreStatus: PredictedScoreStatus = PredictedScoreStatus.NOT_ATTEMPTED
    )

    // Flowを結合してUiStateを作成
    // combine の多引数制限と型推論の問題を避けるため、入れ子にして結合
    val uiState: StateFlow<HomeUiState> = combine(
        combine(quotaFlow, isPremium, reminderRepo.isReminderEnabled) { q, p, r -> Triple(q, p, r) },
        combine(_isReminderInvitationDismissed, _appSpecificInfo, analysisFlow) { d, i, a -> Triple(d, i, a) }
    ) { t1, t2 ->
        val (quota, isPremiumValue, isReminderEnabled) = t1
        val (isDismissed, appInfo, analysis) = t2

        if (quota == null) {
            HomeUiState(isLoading = true)
        } else {
            // 推定スコアのステータス判定
            val status = when {
                analysis == null || analysis.totalProgress == 0f -> PredictedScoreStatus.NOT_ATTEMPTED
                analysis.predictedScore >= (analysis.totalExamQuestions * appAssetConfig.passingScoreThreshold) -> PredictedScoreStatus.PASSING
                else -> PredictedScoreStatus.BELOW_PASSING
            }

            HomeUiState(
                canStart = quota.canStart,
                isPremium = isPremiumValue,
                showReminderInvitation = !isReminderEnabled && !isDismissed,
                examDateText = appInfo["exam_date"] as? String,
                remainingDays = appInfo["remaining_days"] as? Int,
                streakDays = analysis?.currentStreak ?: 0,
                scoreStatus = status
            )
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), HomeUiState(isLoading = true))

    private val _event = MutableSharedFlow<HomeEvent>()
    val event: SharedFlow<HomeEvent> = _event.asSharedFlow()

    fun onStartQuizClicked(canRequestAds: Boolean) {
        viewModelScope.launch {
            when (startNextQuiz()) {
                StartNextQuizUseCase.Result.CanStart -> {
                    _event.emit(HomeEvent.RequestNavigateToQuiz)
                }
                StartNextQuizUseCase.Result.ShowRewardOffer -> {
                    if (canRequestAds) {
                        _event.emit(HomeEvent.RequestShowRewardedAdOffer)
                    } else {
                        _event.emit(HomeEvent.QuotaExceeded)
                    }
                }
                StartNextQuizUseCase.Result.QuotaExceeded -> {
                    _event.emit(HomeEvent.QuotaExceeded)
                }
                StartNextQuizUseCase.Result.QuotaExceededAndRewardUsed -> {
                    _event.emit(HomeEvent.RewardLimitReached)
                }
            }
        }
    }

    /**
     * 学習分析ボタンがクリックされた時の処理。
     */
    fun onAnalysisClicked() {
        viewModelScope.launch {
            if (uiState.value.isPremium) {
                _event.emit(HomeEvent.RequestNavigateToAnalysis)
            } else {
                _event.emit(HomeEvent.RequestShowPaywall)
            }
        }
    }

    fun onStartWeaknessTrainingClicked() {
        viewModelScope.launch {
            if (!uiState.value.isPremium) {
                _event.emit(HomeEvent.RequestShowPaywall)
                return@launch
            }

            settingsProvider.updateWeaknessMode(true)
            _event.emit(HomeEvent.RequestNavigateToSettings)
        }
    }

    fun onRewardGranted() {
        viewModelScope.launch {
            _event.emit(HomeEvent.RewardGranted)
            _event.emit(HomeEvent.RequestNavigateToQuiz)
        }
    }

    fun onReminderInvitationDismissed() {
        _isReminderInvitationDismissed.value = true
    }

    fun onReminderInvitationClicked() {
        viewModelScope.launch {
            _event.emit(HomeEvent.RequestNavigateToSettings)
        }
    }
}
