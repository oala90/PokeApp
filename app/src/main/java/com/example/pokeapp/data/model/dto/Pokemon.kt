package com.example.pokeapp.data.model.dto

import kotlinx.serialization.Polymorphic
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class Pokemon(
    val abilities: List<Ability>,
    val base_experience: Int,
    val cries: Cries,
    val forms: List<com.example.pokeapp.data.model.dto.Form>,
    val game_indices: List<com.example.pokeapp.data.model.dto.GameIndice>,
    val height: Int,
    val held_items: List<com.example.pokeapp.data.model.dto.HeldItem>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.example.pokeapp.data.model.dto.Move>,
    val name: String,
    val order: Int,
//    @Contextual
    val past_abilities: List<@Polymorphic Any>,
    val past_types: List<com.example.pokeapp.data.model.dto.PastType>,
    val species: com.example.pokeapp.data.model.dto.Species,
    val sprites: com.example.pokeapp.data.model.dto.Sprites,
    val stats: List<com.example.pokeapp.data.model.dto.Stat>,
    val types: List<com.example.pokeapp.data.model.dto.Type>,
    val weight: Int
)