package com.msaitodev.quiz.core.data.repository;

import com.msaitodev.core.cloudsync.CloudConfigClient;
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
public final class RemoteConfigRepositoryImpl_Factory implements Factory<RemoteConfigRepositoryImpl> {
  private final Provider<CloudConfigClient> cloudConfigClientProvider;

  public RemoteConfigRepositoryImpl_Factory(Provider<CloudConfigClient> cloudConfigClientProvider) {
    this.cloudConfigClientProvider = cloudConfigClientProvider;
  }

  @Override
  public RemoteConfigRepositoryImpl get() {
    return newInstance(cloudConfigClientProvider.get());
  }

  public static RemoteConfigRepositoryImpl_Factory create(
      Provider<CloudConfigClient> cloudConfigClientProvider) {
    return new RemoteConfigRepositoryImpl_Factory(cloudConfigClientProvider);
  }

  public static RemoteConfigRepositoryImpl newInstance(CloudConfigClient cloudConfigClient) {
    return new RemoteConfigRepositoryImpl(cloudConfigClient);
  }
}
