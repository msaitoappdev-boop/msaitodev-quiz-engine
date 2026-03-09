package com.msaitodev.quiz.core.domain.repository;

/**
 * 間違えた問題の統計情報を管理するリポジトリ。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000e\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a6@\u00a2\u0006\u0002\u0010\u0013R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/msaitodev/quiz/core/domain/repository/WrongAnswerRepository;", "", "allStats", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/msaitodev/quiz/core/domain/model/QuestionStats;", "getAllStats", "()Lkotlinx/coroutines/flow/Flow;", "clearAllStats", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStats", "questionId", "", "recordCorrect", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordIncorrect", "syncStats", "stats", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quiz-core-domain_release"})
public abstract interface WrongAnswerRepository {
    
    /**
     * 全ての統計情報を取得
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.msaitodev.quiz.core.domain.model.QuestionStats>> getAllStats();
    
    /**
     * 特定の問題の統計情報を取得
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.msaitodev.quiz.core.domain.model.QuestionStats> getStats(@org.jetbrains.annotations.NotNull()
    java.lang.String questionId);
    
    /**
     * 正解を記録
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recordCorrect(@org.jetbrains.annotations.NotNull()
    java.lang.String questionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * 不正解を記録
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recordIncorrect(@org.jetbrains.annotations.NotNull()
    java.lang.String questionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * 全ての統計情報を削除
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAllStats(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * クラウドデータとの同期（一括反映）
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object syncStats(@org.jetbrains.annotations.NotNull()
    java.util.List<com.msaitodev.quiz.core.domain.model.QuestionStats> stats, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}