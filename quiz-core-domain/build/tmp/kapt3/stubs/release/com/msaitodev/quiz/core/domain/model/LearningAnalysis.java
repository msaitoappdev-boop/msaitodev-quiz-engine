package com.msaitodev.quiz.core.domain.model;

/**
 * 学習分析の結果を保持するドメインモデル。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002./BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u000eH\u00c6\u0003J\t\u0010&\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000eH\u00c6\u0003Jk\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u000eH\u00d6\u0001J\t\u0010-\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001b\u00a8\u00060"}, d2 = {"Lcom/msaitodev/quiz/core/domain/model/LearningAnalysis;", "", "totalProgress", "", "categorySummaries", "", "Lcom/msaitodev/quiz/core/domain/model/LearningAnalysis$CategorySummary;", "dailyTrend", "Lcom/msaitodev/quiz/core/domain/model/LearningAnalysis$DailyScore;", "overallComment", "", "studiedDays", "", "currentStreak", "", "predictedScore", "totalExamQuestions", "(FLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;III)V", "getCategorySummaries", "()Ljava/util/List;", "getCurrentStreak", "()I", "getDailyTrend", "getOverallComment", "()Ljava/lang/String;", "predictedAccuracyRate", "getPredictedAccuracyRate", "()F", "getPredictedScore", "getStudiedDays", "getTotalExamQuestions", "getTotalProgress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "CategorySummary", "DailyScore", "quiz-core-domain_release"})
public final class LearningAnalysis {
    private final float totalProgress = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.CategorySummary> categorySummaries = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.DailyScore> dailyTrend = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String overallComment = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Long> studiedDays = null;
    private final int currentStreak = 0;
    private final int predictedScore = 0;
    private final int totalExamQuestions = 0;
    
    /**
     * 推定正解率を計算する (0.0 - 1.0)
     */
    private final float predictedAccuracyRate = 0.0F;
    
    public LearningAnalysis(float totalProgress, @org.jetbrains.annotations.NotNull()
    java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.CategorySummary> categorySummaries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.DailyScore> dailyTrend, @org.jetbrains.annotations.NotNull()
    java.lang.String overallComment, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> studiedDays, int currentStreak, int predictedScore, int totalExamQuestions) {
        super();
    }
    
    public final float getTotalProgress() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.CategorySummary> getCategorySummaries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.DailyScore> getDailyTrend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverallComment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getStudiedDays() {
        return null;
    }
    
    public final int getCurrentStreak() {
        return 0;
    }
    
    public final int getPredictedScore() {
        return 0;
    }
    
    public final int getTotalExamQuestions() {
        return 0;
    }
    
    /**
     * 推定正解率を計算する (0.0 - 1.0)
     */
    public final float getPredictedAccuracyRate() {
        return 0.0F;
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.CategorySummary> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.DailyScore> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.msaitodev.quiz.core.domain.model.LearningAnalysis copy(float totalProgress, @org.jetbrains.annotations.NotNull()
    java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.CategorySummary> categorySummaries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.msaitodev.quiz.core.domain.model.LearningAnalysis.DailyScore> dailyTrend, @org.jetbrains.annotations.NotNull()
    java.lang.String overallComment, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> studiedDays, int currentStreak, int predictedScore, int totalExamQuestions) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/msaitodev/quiz/core/domain/model/LearningAnalysis$CategorySummary;", "", "categoryId", "", "categoryName", "accuracyRate", "", "solvedCount", "", "totalInOffset", "(Ljava/lang/String;Ljava/lang/String;FII)V", "getAccuracyRate", "()F", "getCategoryId", "()Ljava/lang/String;", "getCategoryName", "getSolvedCount", "()I", "getTotalInOffset", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "quiz-core-domain_release"})
    public static final class CategorySummary {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String categoryId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String categoryName = null;
        private final float accuracyRate = 0.0F;
        private final int solvedCount = 0;
        private final int totalInOffset = 0;
        
        public CategorySummary(@org.jetbrains.annotations.NotNull()
        java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
        java.lang.String categoryName, float accuracyRate, int solvedCount, int totalInOffset) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategoryId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategoryName() {
            return null;
        }
        
        public final float getAccuracyRate() {
            return 0.0F;
        }
        
        public final int getSolvedCount() {
            return 0;
        }
        
        public final int getTotalInOffset() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.msaitodev.quiz.core.domain.model.LearningAnalysis.CategorySummary copy(@org.jetbrains.annotations.NotNull()
        java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
        java.lang.String categoryName, float accuracyRate, int solvedCount, int totalInOffset) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/msaitodev/quiz/core/domain/model/LearningAnalysis$DailyScore;", "", "dateLabel", "", "dateKey", "averageAccuracy", "", "(Ljava/lang/String;Ljava/lang/String;F)V", "getAverageAccuracy", "()F", "getDateKey", "()Ljava/lang/String;", "getDateLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "quiz-core-domain_release"})
    public static final class DailyScore {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String dateLabel = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String dateKey = null;
        private final float averageAccuracy = 0.0F;
        
        public DailyScore(@org.jetbrains.annotations.NotNull()
        java.lang.String dateLabel, @org.jetbrains.annotations.NotNull()
        java.lang.String dateKey, float averageAccuracy) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDateLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDateKey() {
            return null;
        }
        
        public final float getAverageAccuracy() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.msaitodev.quiz.core.domain.model.LearningAnalysis.DailyScore copy(@org.jetbrains.annotations.NotNull()
        java.lang.String dateLabel, @org.jetbrains.annotations.NotNull()
        java.lang.String dateKey, float averageAccuracy) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}