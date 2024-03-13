package com.example.pokeapp.data.model.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Versions(
    @SerialName("generation-i")
//    @Json(name = "generation-i")
    val generationI: com.example.pokeapp.data.model.dto.GenerationI,
    @SerialName("generation-ii")
//    @Json(name = "generation-ii")
    val generationIi: com.example.pokeapp.data.model.dto.GenerationIi,
    @SerialName("generation-iii")
//    @Json(name = "generation-iii")
    val generationIii: com.example.pokeapp.data.model.dto.GenerationIii,
    @SerialName("generation-iv")
//    @Json(name = "generation-iv")
    val generationIv: com.example.pokeapp.data.model.dto.GenerationIv,
    @SerialName("generation-v")
//    @Json(name = "generation-v")
    val generationV: com.example.pokeapp.data.model.dto.GenerationV,
    @SerialName("generation-vi")
//    @Json(name = "generation-vi")
    val generationVi: com.example.pokeapp.data.model.dto.GenerationVi,
    @SerialName("generation-vii")
//    @Json(name = "generation-vii")
    val generationVii: com.example.pokeapp.data.model.dto.GenerationVii,
    @SerialName("generation-viii")
//    @Json(name = "generation-viii")
    val generationViii: com.example.pokeapp.data.model.dto.GenerationViii
)