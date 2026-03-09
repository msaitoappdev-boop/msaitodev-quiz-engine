package com.msaitodev.quiz.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/ObserveScoresUseCaseTest;", "", "()V", "invoke returns flow from repository", "", "Lkotlinx/coroutines/test/TestResult;", "FakeScoreRepository", "quiz-core-domain_debugUnitTest"})
public final class ObserveScoresUseCaseTest {
    
    public ObserveScoresUseCaseTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/ObserveScoresUseCaseTest$FakeScoreRepository;", "Lcom/msaitodev/quiz/core/domain/repository/ScoreRepository;", "historyFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/msaitodev/quiz/core/domain/model/ScoreEntry;", "(Lkotlinx/coroutines/flow/Flow;)V", "add", "", "entry", "(Lcom/msaitodev/quiz/core/domain/model/ScoreEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "history", "quiz-core-domain_debugUnitTest"})
    static final class FakeScoreRepository implements com.msaitodev.quiz.core.domain.repository.ScoreRepository {
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.coroutines.flow.Flow<java.util.List<com.msaitodev.quiz.core.domain.model.ScoreEntry>> historyFlow = null;
        
        public FakeScoreRepository(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.flow.Flow<? extends java.util.List<com.msaitodev.quiz.core.domain.model.ScoreEntry>> historyFlow) {
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
    }
}