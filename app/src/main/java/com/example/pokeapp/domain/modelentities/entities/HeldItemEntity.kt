package com.example.pokeapp.domain.modelentities.entities

data class HeldItemEntity(
    val item: com.example.pokeapp.domain.modelentities.entities.ItemEntity,
    val version_details: List<com.example.pokeapp.domain.modelentities.entities.VersionDetailEntity>
)