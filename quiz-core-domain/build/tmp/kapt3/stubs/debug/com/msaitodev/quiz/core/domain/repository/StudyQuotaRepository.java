package com.msaitodev.quiz.core.domain.repository;

/**
 * 学習ノルマ（Quota）を管理するリポジトリ。
 * 1日の完了セット数などの「学習進捗」のみを責務とする。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/msaitodev/quiz/core/domain/repository/StudyQuotaRepository;", "", "markSetFinished", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/msaitodev/quiz/core/domain/model/QuotaState;", "freeDailySetsProvider", "Lkotlin/Function0;", "", "quiz-core-domain_debug"})
public abstract interface StudyQuotaRepository {
    
    /**
     * 学習ノルマの状態を監視する
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.msaitodev.quiz.core.domain.model.QuotaState> observe(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Integer> freeDailySetsProvider);
    
    /**
     * クイズセットが完了したことを記録する
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markSetFinished(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}