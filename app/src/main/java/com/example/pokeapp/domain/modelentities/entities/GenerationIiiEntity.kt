package com.example.pokeapp.domain.modelentities.entities

import kotlinx.serialization.SerialName

data class GenerationIiiEntity(
    val emerald: com.example.pokeapp.domain.modelentities.entities.EmeraldEntity,
//    @SerialName("firered-leafgreen")
    val fireredLeafgreen: com.example.pokeapp.domain.modelentities.entities.FireredLeafgreenEntity,
//    @SerialName("ruby-sapphire")
    val rubySapphire: com.example.pokeapp.domain.modelentities.entities.RubySapphireEntity
)