package com.msaitodev.quiz.core.domain.di;

import com.msaitodev.quiz.core.domain.repository.ScoreRepository;
import com.msaitodev.quiz.core.domain.usecase.SaveScoreUseCase;
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
public final class UseCaseModule_ProvideSaveScoreUseCaseFactory implements Factory<SaveScoreUseCase> {
  private final Provider<ScoreRepository> scoreRepositoryProvider;

  public UseCaseModule_ProvideSaveScoreUseCaseFactory(
      Provider<ScoreRepository> scoreRepositoryProvider) {
    this.scoreRepositoryProvider = scoreRepositoryProvider;
  }

  @Override
  public SaveScoreUseCase get() {
    return provideSaveScoreUseCase(scoreRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideSaveScoreUseCaseFactory create(
      Provider<ScoreRepository> scoreRepositoryProvider) {
    return new UseCaseModule_ProvideSaveScoreUseCaseFactory(scoreRepositoryProvider);
  }

  public static SaveScoreUseCase provideSaveScoreUseCase(ScoreRepository scoreRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideSaveScoreUseCase(scoreRepository));
  }
}
