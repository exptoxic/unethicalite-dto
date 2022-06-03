package net.unethicalite.dto.regions

/**
 * Tiles that are registered in our CollisionMap.
 */
data class MappedTileDto(
    val x: Int?,
    val y: Int?,
    val z: Int?,
    val north: Boolean?,
    val east: Boolean?
)