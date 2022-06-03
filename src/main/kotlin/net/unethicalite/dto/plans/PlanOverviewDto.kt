package net.unethicalite.dto.plans

import net.unethicalite.dto.plugins.PluginDeveloperOverviewDto

data class PlanOverviewDto(
    val id: Long,
    val name: String,
    val description: String,
    val imageUrl: String?,
    val subscriptionPeriod: String,
    val price: Int,
    val owner: PluginDeveloperOverviewDto
)