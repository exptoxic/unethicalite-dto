package net.unethicalite.dto.github

data class PluginBootstrapDto(
    val projectUrl: String,
    val provider: String,
    val name: String,
    val description: String,
    val id: String,
    val releases: List<PluginReleaseDto>
)