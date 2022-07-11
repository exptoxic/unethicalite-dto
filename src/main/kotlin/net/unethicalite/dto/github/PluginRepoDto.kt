package net.unethicalite.dto.github

data class PluginRepoDto(
    val repoId: Long,
    val repoUrl: String,
    val ownerId: String,
    val messageId: String?,
    val plugins: List<PluginBootstrapDto>
)