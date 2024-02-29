package com.example.pokeapp.domain.entities

data class HeldItemEntity(
    val item: ItemEntity,
    val version_details: List<VersionDetailEntity>
)