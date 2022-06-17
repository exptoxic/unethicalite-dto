package net.unethicalite.dto.regions

data class TransportLinkDto(
    val source: WorldPointDto,
    val destination: WorldPointDto,
    val action: String,
    val objectId: Int,
    val objectName: String,
    val description: String?,
    val requirement: List<RequirementDto>
) {
    override fun toString(): String {
        return "$source $destination $action $objectId $objectName"
    }
}