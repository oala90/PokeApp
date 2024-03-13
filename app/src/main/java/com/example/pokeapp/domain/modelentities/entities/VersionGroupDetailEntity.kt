package com.example.pokeapp.domain.modelentities.entities

data class VersionGroupDetailEntity(
    val level_learned_at: Int,
    val move_learn_method: com.example.pokeapp.domain.modelentities.entities.MoveLearnMethodEntity,
    val version_group: com.example.pokeapp.domain.modelentities.entities.VersionGroupEntity
)