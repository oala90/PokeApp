package com.example.pokeapp.domain.modelentities.entities

import kotlinx.serialization.SerialName

data class OtherEntity(
    val dream_world: com.example.pokeapp.domain.modelentities.entities.DreamWorldEntity,
    val home: com.example.pokeapp.domain.modelentities.entities.HomeEntity,
//    @SerialName("official-artwork")
    val officialArtwork: com.example.pokeapp.domain.modelentities.entities.OfficialArtworkEntity,
    val showdown: com.example.pokeapp.domain.modelentities.entities.ShowdownEntity
)