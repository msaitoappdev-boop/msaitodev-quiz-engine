package com.msaitodev.quiz.core.data.repository;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
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
public final class RewardQuotaRepositoryImpl_Factory implements Factory<RewardQuotaRepositoryImpl> {
  private final Provider<DataStore<Preferences>> dataStoreProvider;

  public RewardQuotaRepositoryImpl_Factory(Provider<DataStore<Preferences>> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public RewardQuotaRepositoryImpl get() {
    return newInstance(dataStoreProvider.get());
  }

  public static RewardQuotaRepositoryImpl_Factory create(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    return new RewardQuotaRepositoryImpl_Factory(dataStoreProvider);
  }

  public static RewardQuotaRepositoryImpl newInstance(DataStore<Preferences> dataStore) {
    return new RewardQuotaRepositoryImpl(dataStore);
  }
}
