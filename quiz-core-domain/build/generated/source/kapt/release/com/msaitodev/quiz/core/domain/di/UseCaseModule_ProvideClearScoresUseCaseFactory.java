package com.msaitodev.quiz.core.domain.di;

import com.msaitodev.quiz.core.domain.repository.ScoreRepository;
import com.msaitodev.quiz.core.domain.usecase.ClearScoresUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class UseCaseModule_ProvideClearScoresUseCaseFactory implements Factory<ClearScoresUseCase> {
  private final Provider<ScoreRepository> scoreRepositoryProvider;

  public UseCaseModule_ProvideClearScoresUseCaseFactory(
      Provider<ScoreRepository> scoreRepositoryProvider) {
    this.scoreRepositoryProvider = scoreRepositoryProvider;
  }

  @Override
  public ClearScoresUseCase get() {
    return provideClearScoresUseCase(scoreRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideClearScoresUseCaseFactory create(
      Provider<ScoreRepository> scoreRepositoryProvider) {
    return new UseCaseModule_ProvideClearScoresUseCaseFactory(scoreRepositoryProvider);
  }

  public static ClearScoresUseCase provideClearScoresUseCase(ScoreRepository scoreRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideClearScoresUseCase(scoreRepository));
  }
}
