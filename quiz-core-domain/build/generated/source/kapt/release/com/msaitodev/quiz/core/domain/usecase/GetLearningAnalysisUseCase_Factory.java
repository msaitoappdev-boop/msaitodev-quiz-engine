package com.msaitodev.quiz.core.domain.usecase;

import com.msaitodev.core.common.config.AppAssetConfig;
import com.msaitodev.quiz.core.domain.repository.CategoryNameProvider;
import com.msaitodev.quiz.core.domain.repository.QuestionRepository;
import com.msaitodev.quiz.core.domain.repository.ScoreRepository;
import com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class GetLearningAnalysisUseCase_Factory implements Factory<GetLearningAnalysisUseCase> {
  private final Provider<QuestionRepository> questionRepoProvider;

  private final Provider<WrongAnswerRepository> wrongAnswerRepoProvider;

  private final Provider<ScoreRepository> scoreRepoProvider;

  private final Provider<CategoryNameProvider> categoryNameProvider;

  private final Provider<AppAssetConfig> appAssetConfigProvider;

  public GetLearningAnalysisUseCase_Factory(Provider<QuestionRepository> questionRepoProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepoProvider,
      Provider<ScoreRepository> scoreRepoProvider,
      Provider<CategoryNameProvider> categoryNameProvider,
      Provider<AppAssetConfig> appAssetConfigProvider) {
    this.questionRepoProvider = questionRepoProvider;
    this.wrongAnswerRepoProvider = wrongAnswerRepoProvider;
    this.scoreRepoProvider = scoreRepoProvider;
    this.categoryNameProvider = categoryNameProvider;
    this.appAssetConfigProvider = appAssetConfigProvider;
  }

  @Override
  public GetLearningAnalysisUseCase get() {
    return newInstance(questionRepoProvider.get(), wrongAnswerRepoProvider.get(), scoreRepoProvider.get(), categoryNameProvider.get(), appAssetConfigProvider.get());
  }

  public static GetLearningAnalysisUseCase_Factory create(
      Provider<QuestionRepository> questionRepoProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepoProvider,
      Provider<ScoreRepository> scoreRepoProvider,
      Provider<CategoryNameProvider> categoryNameProvider,
      Provider<AppAssetConfig> appAssetConfigProvider) {
    return new GetLearningAnalysisUseCase_Factory(questionRepoProvider, wrongAnswerRepoProvider, scoreRepoProvider, categoryNameProvider, appAssetConfigProvider);
  }

  public static GetLearningAnalysisUseCase newInstance(QuestionRepository questionRepo,
      WrongAnswerRepository wrongAnswerRepo, ScoreRepository scoreRepo,
      CategoryNameProvider categoryNameProvider, AppAssetConfig appAssetConfig) {
    return new GetLearningAnalysisUseCase(questionRepo, wrongAnswerRepo, scoreRepo, categoryNameProvider, appAssetConfig);
  }
}
