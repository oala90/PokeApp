package com.example.pokeapp.domain.modelentities.entities

data class PastTypeEntity(
    val generation: com.example.pokeapp.domain.modelentities.entities.GenerationEntity,
    val types: List<com.example.pokeapp.domain.modelentities.entities.TypeXXEntity>
)