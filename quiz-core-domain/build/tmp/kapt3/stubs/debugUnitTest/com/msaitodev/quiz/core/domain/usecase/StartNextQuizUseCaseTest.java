package com.msaitodev.quiz.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0007J\f\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0007J\f\u0010\u0011\u001a\u00060\u000ej\u0002`\u000fH\u0007J\f\u0010\u0012\u001a\u00060\u000ej\u0002`\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCaseTest;", "", "()V", "premiumRepo", "Lcom/msaitodev/quiz/core/domain/repository/PremiumRepository;", "quotaRepo", "Lcom/msaitodev/quiz/core/domain/repository/StudyQuotaRepository;", "remoteConfigRepo", "Lcom/msaitodev/quiz/core/domain/repository/RemoteConfigRepository;", "rewardedHelper", "Lcom/msaitodev/core/ads/RewardedHelper;", "useCase", "Lcom/msaitodev/quiz/core/domain/usecase/StartNextQuizUseCase;", "invoke returns CanStart when quota is available", "", "Lkotlinx/coroutines/test/TestResult;", "invoke returns QuotaExceeded for premium user when limit reached", "invoke returns QuotaExceededAndRewardUsed when reward also unavailable", "invoke returns ShowRewardOffer when quota exceeded for free user and reward available", "setup", "quiz-core-domain_debugUnitTest"})
public final class StartNextQuizUseCaseTest {
    private com.msaitodev.quiz.core.domain.repository.StudyQuotaRepository quotaRepo;
    private com.msaitodev.core.ads.RewardedHelper rewardedHelper;
    private com.msaitodev.quiz.core.domain.repository.PremiumRepository premiumRepo;
    private com.msaitodev.quiz.core.domain.repository.RemoteConfigRepository remoteConfigRepo;
    private com.msaitodev.quiz.core.domain.usecase.StartNextQuizUseCase useCase;
    
    public StartNextQuizUseCaseTest() {
        super();
    }
    
    @org.junit.Before()
    public final void setup() {
    }
}