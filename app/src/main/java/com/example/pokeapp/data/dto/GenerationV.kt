package com.example.pokeapp.data.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationV(
    @SerialName("black-white")
//    @Json(name = "black-white")
    val blackWhite: BlackWhite
)