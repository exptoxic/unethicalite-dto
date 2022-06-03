package net.unethicalite.dto.users

import net.unethicalite.dto.plans.SubscriptionDto
import java.time.Instant

data class UserDto(
    val balance: Int,
    val apiKey: String,
    val registrationDate: Instant,
    val subscriptions: List<SubscriptionDto>,
)