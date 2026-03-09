package com.msaitodev.quiz.core.domain.usecase;

/**
 * 学習状況を多角的に分析し、サマリを提供するユースケース。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ&\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0016\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010H\u0002J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J.\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/GetLearningAnalysisUseCase;", "", "questionRepo", "Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;", "wrongAnswerRepo", "Lcom/msaitodev/quiz/core/domain/repository/WrongAnswerRepository;", "scoreRepo", "Lcom/msaitodev/quiz/core/domain/repository/ScoreRepository;", "categoryNameProvider", "Lcom/msaitodev/quiz/core/domain/repository/CategoryNameProvider;", "appAssetConfig", "Lcom/msaitodev/core/common/config/AppAssetConfig;", "(Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;Lcom/msaitodev/quiz/core/domain/repository/WrongAnswerRepository;Lcom/msaitodev/quiz/core/domain/repository/ScoreRepository;Lcom/msaitodev/quiz/core/domain/repository/CategoryNameProvider;Lcom/msaitodev/core/common/config/AppAssetConfig;)V", "calculatePredictedScore", "", "summaries", "", "Lcom/msaitodev/quiz/core/domain/model/LearningAnalysis$CategorySummary;", "progress", "", "totalQuestions", "calculateStreak", "studiedDays", "", "calculateTrend", "Lcom/msaitodev/quiz/core/domain/model/LearningAnalysis$DailyScore;", "history", "Lcom/msaitodev/quiz/core/domain/model/ScoreEntry;", "period", "Lcom/msaitodev/quiz/core/domain/model/TrendPeriod;", "generateComment", "", "predictedScore", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/msaitodev/quiz/core/domain/model/LearningAnalysis;", "quiz-core-domain_debug"})
public final class GetLearningAnalysisUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository wrongAnswerRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.ScoreRepository scoreRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.CategoryNameProvider categoryNameProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.core.common.config.AppAssetConfig appAssetConfig = null;
    
    @javax.inject.Inject()
    public GetLearningAnalysisUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepo, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository wrongAnswerRepo, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.ScoreRepository scoreRepo, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.CategoryNameProvider categoryNameProvider, @org.jetbrains.annotations.NotNull()
    com.msaitodev.core.common.config.AppAssetConfig appAssetConfig) {
        super();
    }
    
    /**
     * 指定された期間に基づいた分析結果を取得する。
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.msaitodev.quiz.core.domain.model.LearningAnalysis> invoke(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.model.TrendPeriod period) {
        return null;
    }
    
    private final int calculatePredictedScore(java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.CategorySummary> summaries, float progress, int totalQuestions) {
        return 0;
    }
    
    private final int calculateStreak(java.util.List<java.lang.Long> studiedDays) {
        return 0;
    }
    
    private final java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.DailyScore> calculateTrend(java.util.List<com.msaitodev.quiz.core.domain.model.ScoreEntry> history, com.msaitodev.quiz.core.domain.model.TrendPeriod period) {
        return null;
    }
    
    private final java.lang.String generateComment(float progress, java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.CategorySummary> summaries, int predictedScore, int totalQuestions) {
        return null;
    }
}