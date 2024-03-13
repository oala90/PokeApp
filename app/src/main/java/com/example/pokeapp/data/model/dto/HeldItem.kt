package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class HeldItem(
    val item: com.example.pokeapp.data.model.dto.Item,
    val version_details: List<com.example.pokeapp.data.model.dto.VersionDetail>
)