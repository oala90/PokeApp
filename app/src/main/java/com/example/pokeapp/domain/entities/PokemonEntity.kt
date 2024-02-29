package com.example.pokeapp.domain.entities

data class PokemonEntity(
    val abilities: List<AbilityEntity>,
    val base_experience: Int,
    val cries: CriesEntity,
    val forms: List<FormEntity>,
    val game_indices: List<GameIndiceEntity>,
    val height: Int,
    val held_items: List<HeldItemEntity>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<MoveEntity>,
    val name: String,
    val order: Int,
    val past_abilities: List<Any>,
    val past_types: List<PastTypeEntity>,
    val species: SpeciesEntity,
    val sprites: SpritesEntity,
    val stats: List<StatEntity>,
    val types: List<TypeEntity>,
    val weight: Int
)