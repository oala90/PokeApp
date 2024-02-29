package com.example.pokeapp.data.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)