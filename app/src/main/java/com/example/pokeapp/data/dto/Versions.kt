package com.example.pokeapp.data.dto

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Versions(
    @SerialName("generation-i")
//    @Json(name = "generation-i")
    val generationI: GenerationI,
    @SerialName("generation-ii")
//    @Json(name = "generation-ii")
    val generationIi: GenerationIi,
    @SerialName("generation-iii")
//    @Json(name = "generation-iii")
    val generationIii: GenerationIii,
    @SerialName("generation-iv")
//    @Json(name = "generation-iv")
    val generationIv: GenerationIv,
    @SerialName("generation-v")
//    @Json(name = "generation-v")
    val generationV: GenerationV,
    @SerialName("generation-vi")
//    @Json(name = "generation-vi")
    val generationVi: GenerationVi,
    @SerialName("generation-vii")
//    @Json(name = "generation-vii")
    val generationVii: GenerationVii,
    @SerialName("generation-viii")
//    @Json(name = "generation-viii")
    val generationViii: GenerationViii
)