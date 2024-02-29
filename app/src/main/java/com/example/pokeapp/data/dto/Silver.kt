package com.example.pokeapp.data.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Silver(
    val back_default: String,
    val back_shiny: String,
    val front_default: String,
    val front_shiny: String,
    val front_transparent: String
)