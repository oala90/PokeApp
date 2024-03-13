package com.example.pokeapp.data.model.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationVi(
    @SerialName("omegaruby-alphasapphire")
//    @Json(name = "omegaruby-alphasapphire")
    val omegarubyAlphasapphire: com.example.pokeapp.data.model.dto.OmegarubyAlphasapphire,
    @SerialName("x-y")
//    @Json(name = "x-y")
    val xY: com.example.pokeapp.data.model.dto.XY
)