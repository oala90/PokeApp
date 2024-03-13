package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Move(
    val move: com.example.pokeapp.data.model.dto.MoveX,
    val version_group_details: List<com.example.pokeapp.data.model.dto.VersionGroupDetail>
)