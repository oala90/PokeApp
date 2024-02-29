package com.example.pokeapp.domain.entities

import kotlinx.serialization.SerialName

data class OtherEntity(
    val dream_world: DreamWorldEntity,
    val home: HomeEntity,
//    @SerialName("official-artwork")
    val officialArtwork: OfficialArtworkEntity,
    val showdown: ShowdownEntity
)