package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class PastType(
    val generation: com.example.pokeapp.data.model.dto.Generation,
    val types: List<com.example.pokeapp.data.model.dto.TypeXX>
)