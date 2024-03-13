package com.example.pokeapp.domain.modelentities.entities

data class PokemonEntity(
    val abilities: List<com.example.pokeapp.domain.modelentities.entities.AbilityEntity>,
    val base_experience: Int,
    val cries: com.example.pokeapp.domain.modelentities.entities.CriesEntity,
    val forms: List<com.example.pokeapp.domain.modelentities.entities.FormEntity>,
    val game_indices: List<com.example.pokeapp.domain.modelentities.entities.GameIndiceEntity>,
    val height: Int,
    val held_items: List<com.example.pokeapp.domain.modelentities.entities.HeldItemEntity>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.example.pokeapp.domain.modelentities.entities.MoveEntity>,
    val name: String,
    val order: Int,
    val past_abilities: List<Any>,
    val past_types: List<com.example.pokeapp.domain.modelentities.entities.PastTypeEntity>,
    val species: com.example.pokeapp.domain.modelentities.entities.SpeciesEntity,
    val sprites: com.example.pokeapp.domain.modelentities.entities.SpritesEntity,
    val stats: List<com.example.pokeapp.domain.modelentities.entities.StatEntity>,
    val types: List<com.example.pokeapp.domain.modelentities.entities.TypeEntity>,
    val weight: Int
)