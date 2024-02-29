package com.example.pokeapp.data.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)