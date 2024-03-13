package com.example.pokeapp.domain.modelentities.entities

data class StatEntity(
    val base_stat: Int,
    val effort: Int,
    val stat: com.example.pokeapp.domain.modelentities.entities.StatXEntity
)