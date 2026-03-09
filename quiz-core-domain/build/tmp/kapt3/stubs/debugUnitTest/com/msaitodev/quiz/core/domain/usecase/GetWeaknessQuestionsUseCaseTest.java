package com.msaitodev.quiz.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0007J\f\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0007J\f\u0010\u0010\u001a\u00060\rj\u0002`\u000eH\u0007J\f\u0010\u0011\u001a\u00060\rj\u0002`\u000eH\u0007J\b\u0010\u0012\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/GetWeaknessQuestionsUseCaseTest;", "", "()V", "questionRepo", "Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;", "questions", "", "Lcom/msaitodev/quiz/core/domain/model/Question;", "useCase", "Lcom/msaitodev/quiz/core/domain/usecase/GetWeaknessQuestionsUseCase;", "wrongAnswerRepo", "Lcom/msaitodev/quiz/core/domain/repository/WrongAnswerRepository;", "execute excludes questions with no incorrect answers", "", "Lkotlinx/coroutines/test/TestResult;", "execute filters by category", "execute returns questions sorted by error rate descending", "execute tie-breaks with timestamp descending", "setup", "quiz-core-domain_debugUnitTest"})
public final class GetWeaknessQuestionsUseCaseTest {
    private com.msaitodev.quiz.core.domain.repository.QuestionRepository questionRepo;
    private com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository wrongAnswerRepo;
    private com.msaitodev.quiz.core.domain.usecase.GetWeaknessQuestionsUseCase useCase;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.msaitodev.quiz.core.domain.model.Question> questions = null;
    
    public GetWeaknessQuestionsUseCaseTest() {
        super();
    }
    
    @org.junit.Before()
    public final void setup() {
    }
}