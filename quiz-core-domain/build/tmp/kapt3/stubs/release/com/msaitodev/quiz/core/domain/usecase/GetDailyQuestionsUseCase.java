package com.msaitodev.quiz.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0086B\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/GetDailyQuestionsUseCase;", "", "repo", "Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;", "selector", "Lcom/msaitodev/quiz/core/domain/ui/DailyQuestionSelector;", "(Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;Lcom/msaitodev/quiz/core/domain/ui/DailyQuestionSelector;)V", "invoke", "", "Lcom/msaitodev/quiz/core/domain/model/Question;", "count", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quiz-core-domain_release"})
public final class GetDailyQuestionsUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.QuestionRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.ui.DailyQuestionSelector selector = null;
    
    public GetDailyQuestionsUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.QuestionRepository repo, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.ui.DailyQuestionSelector selector) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.msaitodev.quiz.core.domain.model.Question>> $completion) {
        return null;
    }
}