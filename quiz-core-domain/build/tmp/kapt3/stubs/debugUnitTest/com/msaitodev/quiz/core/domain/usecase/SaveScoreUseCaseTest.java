package com.msaitodev.quiz.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/SaveScoreUseCaseTest;", "", "()V", "invoke calls repository add with correct entry", "", "Lkotlinx/coroutines/test/TestResult;", "FakeScoreRepository", "quiz-core-domain_debugUnitTest"})
public final class SaveScoreUseCaseTest {
    
    public SaveScoreUseCaseTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/SaveScoreUseCaseTest$FakeScoreRepository;", "Lcom/msaitodev/quiz/core/domain/repository/ScoreRepository;", "()V", "savedEntry", "Lcom/msaitodev/quiz/core/domain/model/ScoreEntry;", "add", "", "entry", "(Lcom/msaitodev/quiz/core/domain/model/ScoreEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedEntry", "history", "Lkotlinx/coroutines/flow/Flow;", "", "quiz-core-domain_debugUnitTest"})
    static final class FakeScoreRepository implements com.msaitodev.quiz.core.domain.repository.ScoreRepository {
        @org.jetbrains.annotations.Nullable()
        private com.msaitodev.quiz.core.domain.model.ScoreEntry savedEntry;
        
        public FakeScoreRepository() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.coroutines.flow.Flow<java.util.List<com.msaitodev.quiz.core.domain.model.ScoreEntry>> history() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object add(@org.jetbrains.annotations.NotNull()
        com.msaitodev.quiz.core.domain.model.ScoreEntry entry, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object clear(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.msaitodev.quiz.core.domain.model.ScoreEntry getSavedEntry() {
            return null;
        }
    }
}