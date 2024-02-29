package com.example.pokeapp.domain.entities

data class AbilityEntity(
    val ability: AbilityXEntity,
    val is_hidden: Boolean,
    val slot: Int
)