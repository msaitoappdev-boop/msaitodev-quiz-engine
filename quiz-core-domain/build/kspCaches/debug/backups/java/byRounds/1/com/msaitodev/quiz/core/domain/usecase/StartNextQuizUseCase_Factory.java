package com.msaitodev.quiz.core.domain.usecase;

import com.msaitodev.core.ads.RewardedHelper;
import com.msaitodev.quiz.core.domain.repository.PremiumRepository;
import com.msaitodev.quiz.core.domain.repository.RemoteConfigRepository;
import com.msaitodev.quiz.core.domain.repository.StudyQuotaRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class StartNextQuizUseCase_Factory implements Factory<StartNextQuizUseCase> {
  private final Provider<StudyQuotaRepository> quotaRepoProvider;

  private final Provider<RewardedHelper> rewardedHelperProvider;

  private final Provider<PremiumRepository> premiumRepoProvider;

  private final Provider<RemoteConfigRepository> remoteConfigRepoProvider;

  public StartNextQuizUseCase_Factory(Provider<StudyQuotaRepository> quotaRepoProvider,
      Provider<RewardedHelper> rewardedHelperProvider,
      Provider<PremiumRepository> premiumRepoProvider,
      Provider<RemoteConfigRepository> remoteConfigRepoProvider) {
    this.quotaRepoProvider = quotaRepoProvider;
    this.rewardedHelperProvider = rewardedHelperProvider;
    this.premiumRepoProvider = premiumRepoProvider;
    this.remoteConfigRepoProvider = remoteConfigRepoProvider;
  }

  @Override
  public StartNextQuizUseCase get() {
    return newInstance(quotaRepoProvider.get(), rewardedHelperProvider.get(), premiumRepoProvider.get(), remoteConfigRepoProvider.get());
  }

  public static StartNextQuizUseCase_Factory create(
      Provider<StudyQuotaRepository> quotaRepoProvider,
      Provider<RewardedHelper> rewardedHelperProvider,
      Provider<PremiumRepository> premiumRepoProvider,
      Provider<RemoteConfigRepository> remoteConfigRepoProvider) {
    return new StartNextQuizUseCase_Factory(quotaRepoProvider, rewardedHelperProvider, premiumRepoProvider, remoteConfigRepoProvider);
  }

  public static StartNextQuizUseCase newInstance(StudyQuotaRepository quotaRepo,
      RewardedHelper rewardedHelper, PremiumRepository premiumRepo,
      RemoteConfigRepository remoteConfigRepo) {
    return new StartNextQuizUseCase(quotaRepo, rewardedHelper, premiumRepo, remoteConfigRepo);
  }
}
