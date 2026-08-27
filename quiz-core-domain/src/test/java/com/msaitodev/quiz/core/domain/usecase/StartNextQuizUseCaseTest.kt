package com.msaitodev.quiz.core.domain.usecase

import com.google.common.truth.Truth.assertThat
import com.msaitodev.core.ads.RewardedHelper
import com.msaitodev.core.common.billing.PremiumPlan
import com.msaitodev.quiz.core.domain.config.RemoteConfigKeys
import com.msaitodev.quiz.core.domain.model.QuotaState
import com.msaitodev.quiz.core.domain.repository.PremiumRepository
import com.msaitodev.quiz.core.domain.repository.RemoteConfigRepository
import com.msaitodev.quiz.core.domain.repository.StudyQuotaRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class StartNextQuizUseCaseTest {

    private lateinit var quotaRepo: StudyQuotaRepository
    private lateinit var rewardedHelper: RewardedHelper
    private lateinit var premiumRepo: PremiumRepository
    private lateinit var remoteConfigRepo: RemoteConfigRepository
    private lateinit var useCase: StartNextQuizUseCase

    @Before
    fun setup() {
        quotaRepo = mock()
        rewardedHelper = mock()
        premiumRepo = mock()
        remoteConfigRepo = mock()
        useCase = StartNextQuizUseCase(quotaRepo, rewardedHelper, premiumRepo, remoteConfigRepo)
    }

    @Test
    fun `invoke returns CanStart when quota is available`() = runTest {
        // GIVEN
        whenever(premiumRepo.premiumPlan).thenReturn(MutableStateFlow(PremiumPlan.NONE))
        whenever(remoteConfigRepo.getLong(any())).thenReturn(5L)
        whenever(quotaRepo.observe(any())).thenReturn(flowOf(QuotaState("today", 0, 5)))
        whenever(rewardedHelper.canShowToday).thenReturn(flowOf(true))

        // WHEN
        val result = useCase()

        // THEN
        assertThat(result).isEqualTo(StartNextQuizUseCase.Result.CanStart)
    }

    @Test
    fun `invoke returns ShowRewardOffer when quota exceeded for free user and reward available`() = runTest {
        // GIVEN
        whenever(premiumRepo.premiumPlan).thenReturn(MutableStateFlow(PremiumPlan.NONE))
        whenever(remoteConfigRepo.getLong(any())).thenReturn(5L)
        whenever(quotaRepo.observe(any())).thenReturn(flowOf(QuotaState("today", 5, 5)))
        whenever(rewardedHelper.canShowToday).thenReturn(flowOf(true))

        // WHEN
        val result = useCase()

        // THEN
        assertThat(result).isEqualTo(StartNextQuizUseCase.Result.ShowRewardOffer)
    }

    @Test
    fun `invoke returns QuotaExceededAndRewardUsed when reward also unavailable`() = runTest {
        // GIVEN
        whenever(premiumRepo.premiumPlan).thenReturn(MutableStateFlow(PremiumPlan.NONE))
        whenever(remoteConfigRepo.getLong(any())).thenReturn(5L)
        whenever(quotaRepo.observe(any())).thenReturn(flowOf(QuotaState("today", 5, 5)))
        whenever(rewardedHelper.canShowToday).thenReturn(flowOf(false))

        // WHEN
        val result = useCase()

        // THEN
        assertThat(result).isEqualTo(StartNextQuizUseCase.Result.QuotaExceededAndRewardUsed)
    }

    @Test
    fun `invoke returns QuotaExceeded for premium user when limit reached`() = runTest {
        // GIVEN
        whenever(premiumRepo.premiumPlan).thenReturn(MutableStateFlow(PremiumPlan.MONTHLY))
        whenever(remoteConfigRepo.getLong(any())).thenReturn(10L)
        whenever(quotaRepo.observe(any())).thenReturn(flowOf(QuotaState("today", 10, 10)))
        // Reward should not be considered for premium
        whenever(rewardedHelper.canShowToday).thenReturn(flowOf(true))

        // WHEN
        val result = useCase()

        // THEN
        assertThat(result).isEqualTo(StartNextQuizUseCase.Result.QuotaExceeded)
    }

    @Test
    fun `invoke returns CanStart for lifetime user even if count is high`() = runTest {
        // GIVEN
        whenever(premiumRepo.premiumPlan).thenReturn(MutableStateFlow(PremiumPlan.LIFETIME))
        // Int.MAX_VALUE limit is used for lifetime
        whenever(quotaRepo.observe(any())).thenReturn(flowOf(QuotaState("today", 100, Int.MAX_VALUE)))

        // WHEN
        val result = useCase()

        // THEN
        assertThat(result).isEqualTo(StartNextQuizUseCase.Result.CanStart)
    }
}
