package com.msaitodev.quiz.core.domain.di;

import com.msaitodev.quiz.core.domain.repository.QuestionRepository;
import com.msaitodev.quiz.core.domain.repository.WrongAnswerRepository;
import com.msaitodev.quiz.core.domain.usecase.GetWeaknessQuestionsUseCase;
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
public final class UseCaseModule_ProvideGetWeaknessQuestionsUseCaseFactory implements Factory<GetWeaknessQuestionsUseCase> {
  private final Provider<QuestionRepository> questionRepositoryProvider;

  private final Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider;

  public UseCaseModule_ProvideGetWeaknessQuestionsUseCaseFactory(
      Provider<QuestionRepository> questionRepositoryProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider) {
    this.questionRepositoryProvider = questionRepositoryProvider;
    this.wrongAnswerRepositoryProvider = wrongAnswerRepositoryProvider;
  }

  @Override
  public GetWeaknessQuestionsUseCase get() {
    return provideGetWeaknessQuestionsUseCase(questionRepositoryProvider.get(), wrongAnswerRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetWeaknessQuestionsUseCaseFactory create(
      Provider<QuestionRepository> questionRepositoryProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepositoryProvider) {
    return new UseCaseModule_ProvideGetWeaknessQuestionsUseCaseFactory(questionRepositoryProvider, wrongAnswerRepositoryProvider);
  }

  public static GetWeaknessQuestionsUseCase provideGetWeaknessQuestionsUseCase(
      QuestionRepository questionRepository, WrongAnswerRepository wrongAnswerRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetWeaknessQuestionsUseCase(questionRepository, wrongAnswerRepository));
  }
}
