package com.example.pokeapp.domain.modelentities.entities

data class AbilityEntity(
    val ability: com.example.pokeapp.domain.modelentities.entities.AbilityXEntity,
    val is_hidden: Boolean,
    val slot: Int
)