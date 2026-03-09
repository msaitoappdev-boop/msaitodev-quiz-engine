package com.msaitodev.quiz.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/ClearScoresUseCaseTest;", "", "()V", "invoke calls repository clear", "", "Lkotlinx/coroutines/test/TestResult;", "FakeScoreRepository", "quiz-core-domain_debugUnitTest"})
public final class ClearScoresUseCaseTest {
    
    public ClearScoresUseCaseTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u0011H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/ClearScoresUseCaseTest$FakeScoreRepository;", "Lcom/msaitodev/quiz/core/domain/repository/ScoreRepository;", "()V", "clearCalledCount", "", "getClearCalledCount", "()I", "setClearCalledCount", "(I)V", "add", "", "entry", "Lcom/msaitodev/quiz/core/domain/model/ScoreEntry;", "(Lcom/msaitodev/quiz/core/domain/model/ScoreEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "history", "Lkotlinx/coroutines/flow/Flow;", "", "quiz-core-domain_debugUnitTest"})
    static final class FakeScoreRepository implements com.msaitodev.quiz.core.domain.repository.ScoreRepository {
        private int clearCalledCount = 0;
        
        public FakeScoreRepository() {
            super();
        }
        
        public final int getClearCalledCount() {
            return 0;
        }
        
        public final void setClearCalledCount(int p0) {
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
    }
}