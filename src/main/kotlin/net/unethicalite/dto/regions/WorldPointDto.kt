package net.unethicalite.dto.regions

import javax.validation.constraints.Max
import javax.validation.constraints.Min

data class WorldPointDto(
    @field:Min(1000)
    @field:Max(5000)
    val x: Int,
    @field:Min(1000)
    @field:Max(12000)
    val y: Int,
    @field:Min(0)
    @field:Max(3)
    val plane: Int
)