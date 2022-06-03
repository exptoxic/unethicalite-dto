package net.unethicalite.dto.plans

import java.time.Instant

class SubscriptionDto(
    val planName: String,
    val planId: Long?,
    val expires: Instant
)