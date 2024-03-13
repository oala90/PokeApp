package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Ability(
    val ability: com.example.pokeapp.data.model.dto.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)