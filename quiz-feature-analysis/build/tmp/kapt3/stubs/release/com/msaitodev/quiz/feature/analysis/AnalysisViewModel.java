package com.msaitodev.quiz.feature.analysis;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/msaitodev/quiz/feature/analysis/AnalysisViewModel;", "Landroidx/lifecycle/ViewModel;", "getLearningAnalysis", "Lcom/msaitodev/quiz/core/domain/usecase/GetLearningAnalysisUseCase;", "settingsProvider", "Lcom/msaitodev/feature/settings/SettingsProvider;", "(Lcom/msaitodev/quiz/core/domain/usecase/GetLearningAnalysisUseCase;Lcom/msaitodev/feature/settings/SettingsProvider;)V", "_currentPeriod", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/msaitodev/quiz/core/domain/model/TrendPeriod;", "_event", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/msaitodev/quiz/feature/analysis/AnalysisEvent;", "event", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/msaitodev/quiz/feature/analysis/AnalysisUiState;", "getUiState$annotations", "()V", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onCategoryClicked", "", "categoryId", "", "onDateClicked", "dateKey", "onPeriodSelected", "period", "quiz-feature-analysis_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AnalysisViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.usecase.GetLearningAnalysisUseCase getLearningAnalysis = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.feature.settings.SettingsProvider settingsProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.msaitodev.quiz.core.domain.model.TrendPeriod> _currentPeriod = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.msaitodev.quiz.feature.analysis.AnalysisEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.msaitodev.quiz.feature.analysis.AnalysisEvent> event = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.msaitodev.quiz.feature.analysis.AnalysisUiState> uiState = null;
    
    @javax.inject.Inject()
    public AnalysisViewModel(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.usecase.GetLearningAnalysisUseCase getLearningAnalysis, @org.jetbrains.annotations.NotNull()
    com.msaitodev.feature.settings.SettingsProvider settingsProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.msaitodev.quiz.feature.analysis.AnalysisEvent> getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.msaitodev.quiz.feature.analysis.AnalysisUiState> getUiState() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated()
    public static void getUiState$annotations() {
    }
    
    public final void onPeriodSelected(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.model.TrendPeriod period) {
    }
    
    public final void onCategoryClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId) {
    }
    
    public final void onDateClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String dateKey) {
    }
}