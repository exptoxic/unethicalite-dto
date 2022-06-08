package net.unethicalite.dto.regions

data class RequirementDto(
    val type: String,
    val level: Int?,
    val skill: String?,
    val quest: String?,
    val questState: List<String>?,
    val itemId: Int?,
    val quantity: Int?,
    val varbit: Int?,
    val varbitValue: Int?
)