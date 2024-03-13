package com.example.pokeapp.domain.modelentities.entities

data class MoveEntity(
    val move: com.example.pokeapp.domain.modelentities.entities.MoveXEntity,
    val version_group_details: List<com.example.pokeapp.domain.modelentities.entities.VersionGroupDetailEntity>
)