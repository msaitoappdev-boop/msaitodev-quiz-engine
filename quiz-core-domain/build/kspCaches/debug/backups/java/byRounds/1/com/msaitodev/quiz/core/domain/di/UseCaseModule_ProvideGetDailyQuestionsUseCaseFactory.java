package com.msaitodev.quiz.core.domain.di;

import com.msaitodev.quiz.core.domain.repository.QuestionRepository;
import com.msaitodev.quiz.core.domain.usecase.GetDailyQuestionsUseCase;
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
public final class UseCaseModule_ProvideGetDailyQuestionsUseCaseFactory implements Factory<GetDailyQuestionsUseCase> {
  private final Provider<QuestionRepository> questionRepositoryProvider;

  public UseCaseModule_ProvideGetDailyQuestionsUseCaseFactory(
      Provider<QuestionRepository> questionRepositoryProvider) {
    this.questionRepositoryProvider = questionRepositoryProvider;
  }

  @Override
  public GetDailyQuestionsUseCase get() {
    return provideGetDailyQuestionsUseCase(questionRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetDailyQuestionsUseCaseFactory create(
      Provider<QuestionRepository> questionRepositoryProvider) {
    return new UseCaseModule_ProvideGetDailyQuestionsUseCaseFactory(questionRepositoryProvider);
  }

  public static GetDailyQuestionsUseCase provideGetDailyQuestionsUseCase(
      QuestionRepository questionRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetDailyQuestionsUseCase(questionRepository));
  }
}
