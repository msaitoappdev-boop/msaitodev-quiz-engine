package com.msaitodev.quiz.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0007J\b\u0010\n\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/GetNextQuestionsUseCaseTest;", "", "()V", "questionRepository", "Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;", "useCase", "Lcom/msaitodev/quiz/core/domain/usecase/GetNextQuestionsUseCase;", "invoke - filters out seen questions and returns specified count", "", "Lkotlinx/coroutines/test/TestResult;", "setup", "quiz-core-domain_debugUnitTest"})
public final class GetNextQuestionsUseCaseTest {
    private com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepository;
    private com.msaitodev.quiz.core.domain.usecase.GetNextQuestionsUseCase useCase;
    
    public GetNextQuestionsUseCaseTest() {
        super();
    }
    
    @org.junit.Before()
    public final void setup() {
    }
}