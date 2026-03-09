package com.msaitodev.quiz.core.data.di;

import com.msaitodev.quiz.core.data.local.db.AppDatabase;
import com.msaitodev.quiz.core.data.local.db.ScoreDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ScoreDbModule_ProvideScoreDaoFactory implements Factory<ScoreDao> {
  private final Provider<AppDatabase> dbProvider;

  public ScoreDbModule_ProvideScoreDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ScoreDao get() {
    return provideScoreDao(dbProvider.get());
  }

  public static ScoreDbModule_ProvideScoreDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new ScoreDbModule_ProvideScoreDaoFactory(dbProvider);
  }

  public static ScoreDao provideScoreDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(ScoreDbModule.INSTANCE.provideScoreDao(db));
  }
}
