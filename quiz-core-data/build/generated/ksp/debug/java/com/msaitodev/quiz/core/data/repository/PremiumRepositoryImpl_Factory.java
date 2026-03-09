package com.msaitodev.quiz.core.data.repository;

import com.msaitodev.core.common.billing.BillingManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class PremiumRepositoryImpl_Factory implements Factory<PremiumRepositoryImpl> {
  private final Provider<BillingManager> billingProvider;

  public PremiumRepositoryImpl_Factory(Provider<BillingManager> billingProvider) {
    this.billingProvider = billingProvider;
  }

  @Override
  public PremiumRepositoryImpl get() {
    return newInstance(billingProvider.get());
  }

  public static PremiumRepositoryImpl_Factory create(Provider<BillingManager> billingProvider) {
    return new PremiumRepositoryImpl_Factory(billingProvider);
  }

  public static PremiumRepositoryImpl newInstance(BillingManager billing) {
    return new PremiumRepositoryImpl(billing);
  }
}
