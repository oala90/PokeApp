package com.example.pokeapp.data.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationVii(
    val icons: Icons,
    @SerialName("ultra-sun-ultra-moon")
//    @Json(name = "ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoon
)