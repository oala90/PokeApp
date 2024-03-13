package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: com.example.pokeapp.data.model.dto.StatX
)