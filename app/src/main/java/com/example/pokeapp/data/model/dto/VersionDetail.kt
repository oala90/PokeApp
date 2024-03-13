package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class VersionDetail(
    val rarity: Int,
    val version: com.example.pokeapp.data.model.dto.Version
)