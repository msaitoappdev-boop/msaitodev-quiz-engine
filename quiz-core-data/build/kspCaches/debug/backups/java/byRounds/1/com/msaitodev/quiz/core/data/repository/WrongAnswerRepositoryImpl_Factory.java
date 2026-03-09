package com.msaitodev.quiz.core.data.repository;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.msaitodev.quiz.core.domain.repository.SyncRepository;
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
public final class WrongAnswerRepositoryImpl_Factory implements Factory<WrongAnswerRepositoryImpl> {
  private final Provider<DataStore<Preferences>> storeProvider;

  private final Provider<SyncRepository> syncRepositoryProvider;

  public WrongAnswerRepositoryImpl_Factory(Provider<DataStore<Preferences>> storeProvider,
      Provider<SyncRepository> syncRepositoryProvider) {
    this.storeProvider = storeProvider;
    this.syncRepositoryProvider = syncRepositoryProvider;
  }

  @Override
  public WrongAnswerRepositoryImpl get() {
    return newInstance(storeProvider.get(), syncRepositoryProvider);
  }

  public static WrongAnswerRepositoryImpl_Factory create(
      Provider<DataStore<Preferences>> storeProvider,
      Provider<SyncRepository> syncRepositoryProvider) {
    return new WrongAnswerRepositoryImpl_Factory(storeProvider, syncRepositoryProvider);
  }

  public static WrongAnswerRepositoryImpl newInstance(DataStore<Preferences> store,
      Provider<SyncRepository> syncRepositoryProvider) {
    return new WrongAnswerRepositoryImpl(store, syncRepositoryProvider);
  }
}
