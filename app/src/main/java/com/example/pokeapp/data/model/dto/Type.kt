package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Type(
    val slot: Int,
    val type: com.example.pokeapp.data.model.dto.TypeX
)