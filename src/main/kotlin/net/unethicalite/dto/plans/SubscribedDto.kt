package net.unethicalite.dto.plans

import java.time.Instant

data class SubscribedDto(
    val finalBalance: Int,
    val expirationDate: Instant
)