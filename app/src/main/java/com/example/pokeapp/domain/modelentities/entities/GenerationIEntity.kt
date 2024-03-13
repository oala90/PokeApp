package com.example.pokeapp.domain.modelentities.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class GenerationIEntity(
//    @SerialName("red-blue")
    val redBlue: com.example.pokeapp.domain.modelentities.entities.RedBlueEntity,
    val yellow: com.example.pokeapp.domain.modelentities.entities.YellowEntity
)