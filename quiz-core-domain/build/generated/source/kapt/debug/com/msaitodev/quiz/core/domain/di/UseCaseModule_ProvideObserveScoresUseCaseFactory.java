package com.msaitodev.quiz.core.domain.di;

import com.msaitodev.quiz.core.domain.repository.ScoreRepository;
import com.msaitodev.quiz.core.domain.usecase.ObserveScoresUseCase;
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
public final class UseCaseModule_ProvideObserveScoresUseCaseFactory implements Factory<ObserveScoresUseCase> {
  private final Provider<ScoreRepository> scoreRepositoryProvider;

  public UseCaseModule_ProvideObserveScoresUseCaseFactory(
      Provider<ScoreRepository> scoreRepositoryProvider) {
    this.scoreRepositoryProvider = scoreRepositoryProvider;
  }

  @Override
  public ObserveScoresUseCase get() {
    return provideObserveScoresUseCase(scoreRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideObserveScoresUseCaseFactory create(
      Provider<ScoreRepository> scoreRepositoryProvider) {
    return new UseCaseModule_ProvideObserveScoresUseCaseFactory(scoreRepositoryProvider);
  }

  public static ObserveScoresUseCase provideObserveScoresUseCase(ScoreRepository scoreRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideObserveScoresUseCase(scoreRepository));
  }
}
