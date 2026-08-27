package com.msaitodev.quiz.core.domain.repository

import com.msaitodev.core.common.billing.PremiumPlan
import kotlinx.coroutines.flow.StateFlow

interface PremiumRepository {
    val premiumPlan: StateFlow<PremiumPlan>
    suspend fun refreshFromBilling()
    suspend fun setPremiumForDebug(plan: PremiumPlan)
}
