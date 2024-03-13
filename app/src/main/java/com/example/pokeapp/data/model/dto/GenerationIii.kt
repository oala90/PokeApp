package com.example.pokeapp.data.model.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationIii(
    val emerald: com.example.pokeapp.data.model.dto.Emerald,
    @SerialName("firered-leafgreen")
//    @Json(name="firered-leafgreen")
    val fireredLeafgreen: com.example.pokeapp.data.model.dto.FireredLeafgreen,
    @SerialName("ruby-sapphire")
//    @Json(name="ruby-sapphire")
    val rubySapphire: com.example.pokeapp.data.model.dto.RubySapphire
)