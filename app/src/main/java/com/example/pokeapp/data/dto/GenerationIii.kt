package com.example.pokeapp.data.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationIii(
    val emerald: Emerald,
    @SerialName("firered-leafgreen")
//    @Json(name="firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreen,
    @SerialName("ruby-sapphire")
//    @Json(name="ruby-sapphire")
    val rubySapphire: RubySapphire
)