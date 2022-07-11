package net.unethicalite.dto.github

class PluginReleaseDto(
    val date: String,
    val sha512sum: String,
    val version: String,
    val url: String,
    val requires: String
)