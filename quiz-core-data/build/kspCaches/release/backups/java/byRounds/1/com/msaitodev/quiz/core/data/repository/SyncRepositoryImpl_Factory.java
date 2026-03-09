package com.msaitodev.quiz.core.data.repository;

import com.msaitodev.core.cloudsync.CloudSyncClient;
import com.msaitodev.quiz.core.domain.repository.PremiumRepository;
import com.msaitodev.quiz.core.domain.repository.ScoreRepository;
import com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class SyncRepositoryImpl_Factory implements Factory<SyncRepositoryImpl> {
  private final Provider<CloudSyncClient> cloudSyncClientProvider;

  private final Provider<PremiumRepository> premiumRepositoryProvider;

  private final Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider;

  private final Provider<ScoreRepository> scoreRepositoryProvider;

  public SyncRepositoryImpl_Factory(Provider<CloudSyncClient> cloudSyncClientProvider,
      Provider<PremiumRepository> premiumRepositoryProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider,
      Provider<ScoreRepository> scoreRepositoryProvider) {
    this.cloudSyncClientProvider = cloudSyncClientProvider;
    this.premiumRepositoryProvider = premiumRepositoryProvider;
    this.wrongAnswerRepositoryProvider = wrongAnswerRepositoryProvider;
    this.scoreRepositoryProvider = scoreRepositoryProvider;
  }

  @Override
  public SyncRepositoryImpl get() {
    return newInstance(cloudSyncClientProvider.get(), premiumRepositoryProvider.get(), wrongAnswerRepositoryProvider.get(), scoreRepositoryProvider.get());
  }

  public static SyncRepositoryImpl_Factory create(Provider<CloudSyncClient> cloudSyncClientProvider,
      Provider<PremiumRepository> premiumRepositoryProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider,
      Provider<ScoreRepository> scoreRepositoryProvider) {
    return new SyncRepositoryImpl_Factory(cloudSyncClientProvider, premiumRepositoryProvider, wrongAnswerRepositoryProvider, scoreRepositoryProvider);
  }

  public static SyncRepositoryImpl newInstance(CloudSyncClient cloudSyncClient,
      PremiumRepository premiumRepository, WrongAnswerRepository wrongAnswerRepository,
      ScoreRepository scoreRepository) {
    return new SyncRepositoryImpl(cloudSyncClient, premiumRepository, wrongAnswerRepository, scoreRepository);
  }
}
