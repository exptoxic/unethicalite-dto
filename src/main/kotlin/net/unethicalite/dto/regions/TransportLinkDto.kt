package net.unethicalite.dto.regions

data class TransportLinkDto(
    val source: String,
    val destination: String,
    val action: String,
    val objName: String,
    val objId: Int,
) {
    override fun toString(): String {
        return "$source $destination $action $objName $objId"
    }
}