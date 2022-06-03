package net.unethicalite.dto.plans

data class CreatePlanDto(
    val name: String,
    val description: String,
    val imageUrl: String? = null,
    val subscriptionPeriod: String,
    val price: Int
)
