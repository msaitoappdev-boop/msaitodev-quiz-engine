package com.msaitodev.quiz.feature.analysis;

import com.msaitodev.feature.settings.SettingsProvider;
import com.msaitodev.quiz.core.domain.usecase.GetLearningAnalysisUseCase;
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
public final class AnalysisViewModel_Factory implements Factory<AnalysisViewModel> {
  private final Provider<GetLearningAnalysisUseCase> getLearningAnalysisProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AnalysisViewModel_Factory(Provider<GetLearningAnalysisUseCase> getLearningAnalysisProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.getLearningAnalysisProvider = getLearningAnalysisProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public AnalysisViewModel get() {
    return newInstance(getLearningAnalysisProvider.get(), settingsProvider.get());
  }

  public static AnalysisViewModel_Factory create(
      Provider<GetLearningAnalysisUseCase> getLearningAnalysisProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new AnalysisViewModel_Factory(getLearningAnalysisProvider, settingsProvider);
  }

  public static AnalysisViewModel newInstance(GetLearningAnalysisUseCase getLearningAnalysis,
      SettingsProvider settingsProvider) {
    return new AnalysisViewModel(getLearningAnalysis, settingsProvider);
  }
}
