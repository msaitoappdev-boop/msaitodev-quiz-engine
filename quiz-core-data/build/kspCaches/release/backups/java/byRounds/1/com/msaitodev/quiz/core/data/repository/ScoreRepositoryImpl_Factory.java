package com.msaitodev.quiz.core.data.repository;

import com.msaitodev.quiz.core.data.local.db.ScoreDao;
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
public final class ScoreRepositoryImpl_Factory implements Factory<ScoreRepositoryImpl> {
  private final Provider<ScoreDao> daoProvider;

  private final Provider<SyncRepository> syncRepositoryProvider;

  public ScoreRepositoryImpl_Factory(Provider<ScoreDao> daoProvider,
      Provider<SyncRepository> syncRepositoryProvider) {
    this.daoProvider = daoProvider;
    this.syncRepositoryProvider = syncRepositoryProvider;
  }

  @Override
  public ScoreRepositoryImpl get() {
    return newInstance(daoProvider.get(), syncRepositoryProvider);
  }

  public static ScoreRepositoryImpl_Factory create(Provider<ScoreDao> daoProvider,
      Provider<SyncRepository> syncRepositoryProvider) {
    return new ScoreRepositoryImpl_Factory(daoProvider, syncRepositoryProvider);
  }

  public static ScoreRepositoryImpl newInstance(ScoreDao dao,
      Provider<SyncRepository> syncRepositoryProvider) {
    return new ScoreRepositoryImpl(dao, syncRepositoryProvider);
  }
}
