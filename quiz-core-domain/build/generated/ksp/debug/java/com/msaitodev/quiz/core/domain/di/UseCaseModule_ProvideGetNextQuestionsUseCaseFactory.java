package com.msaitodev.quiz.core.domain.di;

import com.msaitodev.quiz.core.domain.repository.QuestionRepository;
import com.msaitodev.quiz.core.domain.usecase.GetNextQuestionsUseCase;
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
public final class UseCaseModule_ProvideGetNextQuestionsUseCaseFactory implements Factory<GetNextQuestionsUseCase> {
  private final Provider<QuestionRepository> questionRepositoryProvider;

  public UseCaseModule_ProvideGetNextQuestionsUseCaseFactory(
      Provider<QuestionRepository> questionRepositoryProvider) {
    this.questionRepositoryProvider = questionRepositoryProvider;
  }

  @Override
  public GetNextQuestionsUseCase get() {
    return provideGetNextQuestionsUseCase(questionRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetNextQuestionsUseCaseFactory create(
      Provider<QuestionRepository> questionRepositoryProvider) {
    return new UseCaseModule_ProvideGetNextQuestionsUseCaseFactory(questionRepositoryProvider);
  }

  public static GetNextQuestionsUseCase provideGetNextQuestionsUseCase(
      QuestionRepository questionRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetNextQuestionsUseCase(questionRepository));
  }
}
