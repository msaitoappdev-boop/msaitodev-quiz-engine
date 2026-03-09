package com.msaitodev.quiz.core.domain.model;

/**
 * 学習分析の集計期間。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/msaitodev/quiz/core/domain/model/TrendPeriod;", "", "(Ljava/lang/String;I)V", "DAILY", "WEEKLY", "MONTHLY", "quiz-core-domain_debug"})
public enum TrendPeriod {
    /*public static final*/ DAILY /* = new DAILY() */,
    /*public static final*/ WEEKLY /* = new WEEKLY() */,
    /*public static final*/ MONTHLY /* = new MONTHLY() */;
    
    TrendPeriod() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.msaitodev.quiz.core.domain.model.TrendPeriod> getEntries() {
        return null;
    }
}