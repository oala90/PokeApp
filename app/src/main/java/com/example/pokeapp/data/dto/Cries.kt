package com.example.pokeapp.data.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Cries(
    val latest: String,
    val legacy: String
)