package com.example.pokeapp.domain.modelentities.entities

import kotlinx.serialization.SerialName

data class GenerationIvEntity(
//    @SerialName("diamond-pearl")
    val diamondPearl: com.example.pokeapp.domain.modelentities.entities.DiamondPearlEntity,
//    @SerialName("heartgold-soulsilver")
    val heartgoldSoulSilver: com.example.pokeapp.domain.modelentities.entities.HeartgoldSoulsilverEntity,
    val platinum: com.example.pokeapp.domain.modelentities.entities.PlatinumEntity
)