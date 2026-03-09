package com.msaitodev.quiz.core.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/msaitodev/quiz/core/domain/repository/QuestionRepository;", "", "getRandomUnseenQuestions", "", "Lcom/msaitodev/quiz/core/domain/model/Question;", "count", "", "excludingIds", "", "", "(ILjava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quiz-core-domain_release"})
public abstract interface QuestionRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.msaitodev.quiz.core.domain.model.Question>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRandomUnseenQuestions(int count, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> excludingIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.msaitodev.quiz.core.domain.model.Question>> $completion);
}