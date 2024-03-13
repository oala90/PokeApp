package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class OfficialArtwork(
    val front_default: String?,
    val front_shiny: String?
)