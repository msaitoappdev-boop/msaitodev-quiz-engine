package com.msaitodev.quiz.core.data.repository

import com.msaitodev.core.common.billing.BillingManager
import com.msaitodev.core.common.billing.PremiumPlan
import com.msaitodev.quiz.core.domain.repository.PremiumRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PremiumRepositoryImpl @Inject constructor(
    private val billing: BillingManager
) : PremiumRepository {

    override val premiumPlan: StateFlow<PremiumPlan> = billing.premiumPlan

    override suspend fun refreshFromBilling() {
        billing.refreshEntitlements()
    }

    override suspend fun setPremiumForDebug(plan: PremiumPlan) {
        billing.setPremiumForDebug(plan)
    }
}
