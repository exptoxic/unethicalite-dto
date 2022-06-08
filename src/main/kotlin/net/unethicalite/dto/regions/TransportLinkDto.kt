package net.unethicalite.dto.regions

data class TransportLinkDto(
    val source: WorldPointDto,
    val destination: WorldPointDto,
    val action: String,
    val objectId: String,
    val objectName: Int,
    val requirements: List<RequirementDto>
) {
    override fun toString(): String {
        return "$source $destination $action $objectId $objectName"
    }
}