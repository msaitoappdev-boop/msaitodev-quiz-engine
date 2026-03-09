package com.msaitodev.quiz.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086B\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/GetNextQuestionsUseCase;", "", "repo", "Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;", "(Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;)V", "invoke", "", "Lcom/msaitodev/quiz/core/domain/model/Question;", "count", "", "excludingIds", "", "", "(ILjava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quiz-core-domain_release"})
public final class GetNextQuestionsUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.QuestionRepository repo = null;
    
    @javax.inject.Inject()
    public GetNextQuestionsUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.QuestionRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int count, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> excludingIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.msaitodev.quiz.core.domain.model.Question>> $completion) {
        return null;
    }
}