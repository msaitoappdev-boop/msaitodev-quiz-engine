package com.msaitodev.quiz.core.domain.usecase;

import com.msaitodev.quiz.core.domain.repository.QuestionRepository;
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
public final class GetNextQuestionsUseCase_Factory implements Factory<GetNextQuestionsUseCase> {
  private final Provider<QuestionRepository> repoProvider;

  public GetNextQuestionsUseCase_Factory(Provider<QuestionRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public GetNextQuestionsUseCase get() {
    return newInstance(repoProvider.get());
  }

  public static GetNextQuestionsUseCase_Factory create(Provider<QuestionRepository> repoProvider) {
    return new GetNextQuestionsUseCase_Factory(repoProvider);
  }

  public static GetNextQuestionsUseCase newInstance(QuestionRepository repo) {
    return new GetNextQuestionsUseCase(repo);
  }
}
