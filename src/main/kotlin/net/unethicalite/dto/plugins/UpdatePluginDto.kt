package net.unethicalite.dto.plugins

data class UpdatePluginDto(
    val id: Long,
    val fileUrl: String?,
    val fileName: String?,
    val fileSize: Int?,
    val name: String?,
    val mainClass: String?,
    val description: String?,
    val imageUrl: String?,
    val version: String?,
    val author: Long?,
    val planId: Long?
)
