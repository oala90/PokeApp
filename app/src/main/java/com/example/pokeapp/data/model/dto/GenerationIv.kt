package com.example.pokeapp.data.model.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class GenerationIv(
    @SerialName("diamond-pearl")
//    @Json(name = "diamond-pearl")
    val diamondPearl: com.example.pokeapp.data.model.dto.DiamondPearl,
    @SerialName("heartgold-soulsilver")
//    @Json(name = "heartgold-soulsilver")
    val heartgoldSoulsilver: com.example.pokeapp.data.model.dto.HeartgoldSoulsilver,
    val platinum: com.example.pokeapp.data.model.dto.Platinum
)