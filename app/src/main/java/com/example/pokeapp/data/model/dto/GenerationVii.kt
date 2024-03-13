package com.example.pokeapp.data.model.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationVii(
    val icons: com.example.pokeapp.data.model.dto.Icons,
    @SerialName("ultra-sun-ultra-moon")
//    @Json(name = "ultra-sun-ultra-moon")
    val ultraSunUltraMoon: com.example.pokeapp.data.model.dto.UltraSunUltraMoon
)