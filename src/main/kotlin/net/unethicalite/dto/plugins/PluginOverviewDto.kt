package net.unethicalite.dto.plugins

import net.unethicalite.dto.plans.PlanOverviewDto
import java.util.Date

data class PluginOverviewDto(
    val id: Long,
    val name: String,
    val version: String,
    val description: String,
    val imageUrl: String?,
    val plan: PlanOverviewDto,
    val author: PluginDeveloperOverviewDto,
    val uploadDate: Date,
    val updateDate: Date
)