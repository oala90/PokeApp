package com.example.pokeapp.domain.entities

import kotlinx.serialization.SerialName

data class GenerationIiiEntity(
    val emerald: EmeraldEntity,
//    @SerialName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreenEntity,
//    @SerialName("ruby-sapphire")
    val rubySapphire: RubySapphireEntity
)