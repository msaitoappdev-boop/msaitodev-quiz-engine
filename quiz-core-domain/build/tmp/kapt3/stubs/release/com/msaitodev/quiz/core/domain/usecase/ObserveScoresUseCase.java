package com.msaitodev.quiz.core.domain.usecase;

/**
 * 学習履歴を監視するユースケース。
 * @param dateKey フィルタリングする日付 (yyyyMMdd)。null の場合は全期間。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/ObserveScoresUseCase;", "", "repo", "Lcom/msaitodev/quiz/core/domain/repository/ScoreRepository;", "(Lcom/msaitodev/quiz/core/domain/repository/ScoreRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/msaitodev/quiz/core/domain/model/ScoreEntry;", "dateKey", "", "quiz-core-domain_release"})
public final class ObserveScoresUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.ScoreRepository repo = null;
    
    public ObserveScoresUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.ScoreRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.msaitodev.quiz.core.domain.model.ScoreEntry>> invoke(@org.jetbrains.annotations.Nullable()
    java.lang.String dateKey) {
        return null;
    }
}