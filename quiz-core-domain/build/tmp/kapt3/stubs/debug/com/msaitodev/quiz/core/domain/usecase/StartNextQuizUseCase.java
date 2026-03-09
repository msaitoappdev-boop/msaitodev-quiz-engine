package com.msaitodev.quiz.core.domain.usecase;

/**
 * 次のクイズセットを開始できるかどうかを判断し、その結果を返すユースケース。
 * 学習進捗（StudyQuota）と広告獲得状況（RewardedHelper）の両方を参照して最終判断を行う。
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH\u0086B\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase;", "", "quotaRepo", "Lcom/msaitodev/quiz/core/domain/repository/StudyQuotaRepository;", "rewardedHelper", "Lcom/msaitodev/core/ads/RewardedHelper;", "premiumRepo", "Lcom/msaitodev/quiz/core/domain/repository/PremiumRepository;", "remoteConfigRepo", "Lcom/msaitodev/quiz/core/domain/repository/RemoteConfigRepository;", "(Lcom/msaitodev/quiz/core/domain/repository/StudyQuotaRepository;Lcom/msaitodev/core/ads/RewardedHelper;Lcom/msaitodev/quiz/core/domain/repository/PremiumRepository;Lcom/msaitodev/quiz/core/domain/repository/RemoteConfigRepository;)V", "invoke", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "quiz-core-domain_debug"})
public final class StartNextQuizUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.StudyQuotaRepository quotaRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.core.ads.RewardedHelper rewardedHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.PremiumRepository premiumRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.msaitodev.quiz.core.domain.repository.RemoteConfigRepository remoteConfigRepo = null;
    
    @javax.inject.Inject()
    public StartNextQuizUseCase(@org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.StudyQuotaRepository quotaRepo, @org.jetbrains.annotations.NotNull()
    com.msaitodev.core.ads.RewardedHelper rewardedHelper, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.PremiumRepository premiumRepo, @org.jetbrains.annotations.NotNull()
    com.msaitodev.quiz.core.domain.repository.RemoteConfigRepository remoteConfigRepo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result;", "", "CanStart", "QuotaExceeded", "QuotaExceededAndRewardUsed", "ShowRewardOffer", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result$CanStart;", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result$QuotaExceeded;", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result$QuotaExceededAndRewardUsed;", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result$ShowRewardOffer;", "quiz-core-domain_debug"})
    public static abstract interface Result {
        
        /**
         * クイズを開始できる
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result$CanStart;", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result;", "()V", "quiz-core-domain_debug"})
        public static final class CanStart implements com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result.CanStart INSTANCE = null;
            
            private CanStart() {
                super();
            }
        }
        
        /**
         * 上限に達している（プレミアムユーザー）
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result$QuotaExceeded;", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result;", "()V", "quiz-core-domain_debug"})
        public static final class QuotaExceeded implements com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result.QuotaExceeded INSTANCE = null;
            
            private QuotaExceeded() {
                super();
            }
        }
        
        /**
         * 上限に達しており、かつ本日のリワードも使用済み
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result$QuotaExceededAndRewardUsed;", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result;", "()V", "quiz-core-domain_debug"})
        public static final class QuotaExceededAndRewardUsed implements com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result.QuotaExceededAndRewardUsed INSTANCE = null;
            
            private QuotaExceededAndRewardUsed() {
                super();
            }
        }
        
        /**
         * 上限に達しており、リワード広告のオファーを出すべき
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result$ShowRewardOffer;", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase$Result;", "()V", "quiz-core-domain_debug"})
        public static final class ShowRewardOffer implements com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase.Result.ShowRewardOffer INSTANCE = null;
            
            private ShowRewardOffer() {
                super();
            }
        }
    }
}