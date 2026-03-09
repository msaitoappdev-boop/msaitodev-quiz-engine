package com.msaitodev.quiz.core.domain.di;

import com.msaitodev.core.common.config.AppAssetConfig;
import com.msaitodev.quiz.core.domain.repository.CategoryNameProvider;
import com.msaitodev.quiz.core.domain.repository.QuestionRepository;
import com.msaitodev.quiz.core.domain.repository.ScoreRepository;
import com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository;
import com.msaitodev.quiz.core.domain.usecase.GetLearningAnalysisUseCase;
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
public final class UseCaseModule_ProvideGetLearningAnalysisUseCaseFactory implements Factory<GetLearningAnalysisUseCase> {
  private final Provider<QuestionRepository> questionRepositoryProvider;

  private final Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider;

  private final Provider<ScoreRepository> scoreRepositoryProvider;

  private final Provider<CategoryNameProvider> categoryNameProvider;

  private final Provider<AppAssetConfig> appAssetConfigProvider;

  public UseCaseModule_ProvideGetLearningAnalysisUseCaseFactory(
      Provider<QuestionRepository> questionRepositoryProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider,
      Provider<ScoreRepository> scoreRepositoryProvider,
      Provider<CategoryNameProvider> categoryNameProvider,
      Provider<AppAssetConfig> appAssetConfigProvider) {
    this.questionRepositoryProvider = questionRepositoryProvider;
    this.wrongAnswerRepositoryProvider = wrongAnswerRepositoryProvider;
    this.scoreRepositoryProvider = scoreRepositoryProvider;
    this.categoryNameProvider = categoryNameProvider;
    this.appAssetConfigProvider = appAssetConfigProvider;
  }

  @Override
  public GetLearningAnalysisUseCase get() {
    return provideGetLearningAnalysisUseCase(questionRepositoryProvider.get(), wrongAnswerRepositoryProvider.get(), scoreRepositoryProvider.get(), categoryNameProvider.get(), appAssetConfigProvider.get());
  }

  public static UseCaseModule_ProvideGetLearningAnalysisUseCaseFactory create(
      Provider<QuestionRepository> questionRepositoryProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider,
      Provider<ScoreRepository> scoreRepositoryProvider,
      Provider<CategoryNameProvider> categoryNameProvider,
      Provider<AppAssetConfig> appAssetConfigProvider) {
    return new UseCaseModule_ProvideGetLearningAnalysisUseCaseFactory(questionRepositoryProvider, wrongAnswerRepositoryProvider, scoreRepositoryProvider, categoryNameProvider, appAssetConfigProvider);
  }

  public static GetLearningAnalysisUseCase provideGetLearningAnalysisUseCase(
      QuestionRepository questionRepository, WrongAnswerRepository wrongAnswerRepository,
      ScoreRepository scoreRepository, CategoryNameProvider categoryNameProvider,
      AppAssetConfig appAssetConfig) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetLearningAnalysisUseCase(questionRepository, wrongAnswerRepository, scoreRepository, categoryNameProvider, appAssetConfig));
  }
}
