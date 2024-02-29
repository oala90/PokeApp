package com.example.pokeapp.domain.entities

import kotlinx.serialization.SerialName

data class GenerationIvEntity(
//    @SerialName("diamond-pearl")
    val diamondPearl: DiamondPearlEntity,
//    @SerialName("heartgold-soulsilver")
    val heartgoldSoulSilver: HeartgoldSoulsilverEntity,
    val platinum: PlatinumEntity
)