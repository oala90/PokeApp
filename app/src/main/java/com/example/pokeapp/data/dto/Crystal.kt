package com.example.pokeapp.data.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Crystal(
    val back_default: String?,
    val back_shiny: String?,
    val back_shiny_transparent: String?,
    val back_transparent: String?,
    val front_default: String?,
    val front_shiny: String?,
    val front_shiny_transparent: String?,
    val front_transparent: String?
)