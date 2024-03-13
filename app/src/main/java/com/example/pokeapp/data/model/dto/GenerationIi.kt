package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationIi(
    val crystal: com.example.pokeapp.data.model.dto.Crystal,
    val gold: com.example.pokeapp.data.model.dto.Gold,
    val silver: com.example.pokeapp.data.model.dto.Silver
)