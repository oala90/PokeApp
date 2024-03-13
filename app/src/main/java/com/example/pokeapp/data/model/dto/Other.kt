package com.example.pokeapp.data.model.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Other(
    val dream_world: com.example.pokeapp.data.model.dto.DreamWorld,
    val home: com.example.pokeapp.data.model.dto.Home,
    @SerialName("official-artwork")
//    @Json(name = "official-artwork")
    val officialArtwork: com.example.pokeapp.data.model.dto.OfficialArtwork,
    val showdown: com.example.pokeapp.data.model.dto.Showdown
)