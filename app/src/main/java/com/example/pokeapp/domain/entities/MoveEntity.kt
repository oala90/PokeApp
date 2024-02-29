package com.example.pokeapp.domain.entities

data class MoveEntity(
    val move: MoveXEntity,
    val version_group_details: List<VersionGroupDetailEntity>
)