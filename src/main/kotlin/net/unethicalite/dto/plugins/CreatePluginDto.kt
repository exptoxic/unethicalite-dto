package net.unethicalite.dto.plugins

data class CreatePluginDto(
    val fileUrl: String,
    val fileName: String,
    val fileSize: Int,
    val name: String,
    val mainClass: String,
    val description: String,
    val imageUrl: String?,
    val planId: Long
)
