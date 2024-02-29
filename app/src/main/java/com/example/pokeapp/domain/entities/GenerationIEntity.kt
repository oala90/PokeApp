package com.example.pokeapp.domain.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class GenerationIEntity(
//    @SerialName("red-blue")
    val redBlue: RedBlueEntity,
    val yellow: YellowEntity
)