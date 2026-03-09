package com.msaitodev.quiz.core.data.repository;

import android.content.Context;
import com.msaitodev.core.common.config.AppAssetConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class QuestionRepositoryImpl_Factory implements Factory<QuestionRepositoryImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<AppAssetConfig> configProvider;

  public QuestionRepositoryImpl_Factory(Provider<Context> contextProvider,
      Provider<AppAssetConfig> configProvider) {
    this.contextProvider = contextProvider;
    this.configProvider = configProvider;
  }

  @Override
  public QuestionRepositoryImpl get() {
    return newInstance(contextProvider.get(), configProvider.get());
  }

  public static QuestionRepositoryImpl_Factory create(Provider<Context> contextProvider,
      Provider<AppAssetConfig> configProvider) {
    return new QuestionRepositoryImpl_Factory(contextProvider, configProvider);
  }

  public static QuestionRepositoryImpl newInstance(Context context, AppAssetConfig config) {
    return new QuestionRepositoryImpl(context, config);
  }
}
