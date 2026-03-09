package com.msaitodev.quiz.core.data.repository;

import com.msaitodev.quiz.core.domain.repository.ScoreRepository;
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
public final class StudyQuotaRepositoryImpl_Factory implements Factory<StudyQuotaRepositoryImpl> {
  private final Provider<ScoreRepository> scoreRepositoryProvider;

  public StudyQuotaRepositoryImpl_Factory(Provider<ScoreRepository> scoreRepositoryProvider) {
    this.scoreRepositoryProvider = scoreRepositoryProvider;
  }

  @Override
  public StudyQuotaRepositoryImpl get() {
    return newInstance(scoreRepositoryProvider.get());
  }

  public static StudyQuotaRepositoryImpl_Factory create(
      Provider<ScoreRepository> scoreRepositoryProvider) {
    return new StudyQuotaRepositoryImpl_Factory(scoreRepositoryProvider);
  }

  public static StudyQuotaRepositoryImpl newInstance(ScoreRepository scoreRepository) {
    return new StudyQuotaRepositoryImpl(scoreRepository);
  }
}
