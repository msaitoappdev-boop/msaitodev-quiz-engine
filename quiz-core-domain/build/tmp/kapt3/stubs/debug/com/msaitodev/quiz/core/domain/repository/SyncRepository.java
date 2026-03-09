package com.msaitodev.quiz.core.domain.repository;

/**
 * 学習進捗や統計情報のクラウド同期を担うリポジトリ。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/msaitodev/quiz/core/domain/repository/SyncRepository;", "", "downloadFromCloud", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadToCloud", "quiz-core-domain_debug"})
public abstract interface SyncRepository {
    
    /**
     * ローカルの最新データをクラウドにアップロード（クイズ終了時）
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadToCloud(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    /**
     * クラウドの最新データをローカルにダウンロードして統合（アプリ起動時）
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object downloadFromCloud(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}