package com.msaitodev.quiz.core.domain.usecase;

/**
 * 弱点特訓のための問題を抽出するユースケース。
 * 過去の正誤統計に基づき、誤答率の高い問題を優先的に取得する。
 * 弱点データがない場合は、通常のランダム出題にフォールバックする。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/GetWeaknessQuestionsUseCase;", "", "questionRepo", "Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;", "wrongAnswerRepo", "Lcom/msaitodev/quiz/core/domain/repository/WrongAnswerRepository;", "(Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;Lcom/msaitodev/quiz/core/domain/repository/WrongAnswerRepository;)V", "execute", "", "Lcom/msaitodev/quiz/core/domain/model/Question;", "count", "", "categoryFilter", "", "excludingIds", "", "(ILjava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quiz-core-domain_release"})
public final class GetWeaknessQuestionsUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository wrongAnswerRepo = null;
    
    @javax.inject.Inject()
    public GetWeaknessQuestionsUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepo, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository wrongAnswerRepo) {
        super();
    }
    
    /**
     * @param count 抽出する問題数
     * @param categoryFilter 特定のカテゴリに絞る場合
     * @param excludingIds すでに出題済みの問題ID
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(int count, @org.jetbrains.annotations.Nullable()
    java.lang.String categoryFilter, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> excludingIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.msaitodev.quiz.core.domain.model.Question>> $completion) {
        return null;
    }
}