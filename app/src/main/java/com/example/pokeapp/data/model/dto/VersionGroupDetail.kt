package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.example.pokeapp.data.model.dto.MoveLearnMethod,
    val version_group: com.example.pokeapp.data.model.dto.VersionGroup
)