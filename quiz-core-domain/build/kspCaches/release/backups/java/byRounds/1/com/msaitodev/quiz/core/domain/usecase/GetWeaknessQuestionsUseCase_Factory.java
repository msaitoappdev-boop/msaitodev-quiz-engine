package com.msaitodev.quiz.core.domain.usecase;

import com.msaitodev.quiz.core.domain.repository.QuestionRepository;
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
public final class GetWeaknessQuestionsUseCase_Factory implements Factory<GetWeaknessQuestionsUseCase> {
  private final Provider<QuestionRepository> questionRepoProvider;

  private final Provider<WrongAnswerRepository> wrongAnswerRepoProvider;

  public GetWeaknessQuestionsUseCase_Factory(Provider<QuestionRepository> questionRepoProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepoProvider) {
    this.questionRepoProvider = questionRepoProvider;
    this.wrongAnswerRepoProvider = wrongAnswerRepoProvider;
  }

  @Override
  public GetWeaknessQuestionsUseCase get() {
    return newInstance(questionRepoProvider.get(), wrongAnswerRepoProvider.get());
  }

  public static GetWeaknessQuestionsUseCase_Factory create(
      Provider<QuestionRepository> questionRepoProvider,
      Provider<WrongAnswerRepository> wrongAnswerRepoProvider) {
    return new GetWeaknessQuestionsUseCase_Factory(questionRepoProvider, wrongAnswerRepoProvider);
  }

  public static GetWeaknessQuestionsUseCase newInstance(QuestionRepository questionRepo,
      WrongAnswerRepository wrongAnswerRepo) {
    return new GetWeaknessQuestionsUseCase(questionRepo, wrongAnswerRepo);
  }
}
