package com.example.pokeapp.domain.entities

import kotlinx.serialization.SerialName

data class VersionsEntity(
//    @SerialName("generation-i")
    val generationI: GenerationIEntity,
//    @SerialName("generation-ii")
    val generationIi: GenerationIiEntity,
//    @SerialName("generation-iii")
    val generationIii: GenerationIiiEntity,
//    @SerialName("generation-iv")
    val generationIv: GenerationIvEntity,
//    @SerialName("generation-v")
    val generationV: GenerationVEntity,
//    @SerialName("generation-vi")
    val generationVi: GenerationViEntity,
//    @SerialName("generation-vii")
    val generationVii: GenerationViiEntity,
//    @SerialName("generation-viii")
    val generationViii: GenerationViiiEntity
)