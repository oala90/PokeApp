package com.example.pokeapp.data.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationI(
    @SerialName("red-blue")
//    @Json(name="red-blue")
    val redBlue: RedBlue,
    val yellow: Yellow
)