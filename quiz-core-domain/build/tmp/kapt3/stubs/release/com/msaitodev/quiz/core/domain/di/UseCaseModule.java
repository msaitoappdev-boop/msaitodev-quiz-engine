package com.msaitodev.quiz.core.domain.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/msaitodev/quiz/core/domain/di/UseCaseModule;", "", "()V", "provideClearScoresUseCase", "Lcom/msaitodev/quiz/core/domain/usecase/ClearScoresUseCase;", "scoreRepository", "Lcom/msaitodev/quiz/core/domain/repository/ScoreRepository;", "provideGetDailyQuestionsUseCase", "Lcom/msaitodev/quiz/core/domain/usecase/GetDailyQuestionsUseCase;", "questionRepository", "Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;", "provideGetLearningAnalysisUseCase", "Lcom/msaitodev/quiz/core/domain/usecase/GetLearningAnalysisUseCase;", "wrongAnswerRepository", "Lcom/msaitodev/quiz/core/domain/repository/WrongAnswerRepository;", "categoryNameProvider", "Lcom/msaitodev/quiz/core/domain/repository/CategoryNameProvider;", "appAssetConfig", "Lcom/msaitodev/core/common/config/AppAssetConfig;", "provideGetNextQuestionsUseCase", "Lcom/msaitodev/quiz/core/domain/usecase/GetNextQuestionsUseCase;", "provideGetWeaknessQuestionsUseCase", "Lcom/msaitodev/quiz/core/domain/usecase/GetWeaknessQuestionsUseCase;", "provideObserveScoresUseCase", "Lcom/msaitodev/quiz/core/domain/usecase/ObserveScoresUseCase;", "provideSaveScoreUseCase", "Lcom/msaitodev/quiz/core/domain/usecase/SaveScoreUseCase;", "quiz-core-domain_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.msaitodev.quiz.core.domain.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.msaitodev.quiz.core.domain.usecase.ObserveScoresUseCase provideObserveScoresUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.ScoreRepository scoreRepository) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.msaitodev.quiz.core.domain.usecase.ClearScoresUseCase provideClearScoresUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.ScoreRepository scoreRepository) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.msaitodev.quiz.core.domain.usecase.GetDailyQuestionsUseCase provideGetDailyQuestionsUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepository) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.msaitodev.quiz.core.domain.usecase.GetNextQuestionsUseCase provideGetNextQuestionsUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepository) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.msaitodev.quiz.core.domain.usecase.SaveScoreUseCase provideSaveScoreUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.ScoreRepository scoreRepository) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.msaitodev.quiz.core.domain.usecase.GetWeaknessQuestionsUseCase provideGetWeaknessQuestionsUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepository, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository wrongAnswerRepository) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.msaitodev.quiz.core.domain.usecase.GetLearningAnalysisUseCase provideGetLearningAnalysisUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepository, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository wrongAnswerRepository, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.ScoreRepository scoreRepository, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.CategoryNameProvider categoryNameProvider, @org.jetbrains.annotations.NotNull()
    com.msaitodev.core.common.config.AppAssetConfig appAssetConfig) {
        return null;
    }
}