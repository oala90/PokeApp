package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GameIndice(
    val game_index: Int,
    val version: com.example.pokeapp.data.model.dto.Version
)