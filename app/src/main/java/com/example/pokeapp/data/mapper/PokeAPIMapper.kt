package com.example.pokeapp.data.mapper

import com.example.pokeapp.data.model.dtopokeapi.PokeAPI
import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity

fun PokeAPI.toEntity() = PokeAPIEntity(
    id = id,
    name = name
)

fun PokeAPIEntity.toDto() = PokeAPI(
    id = id,
    name = name
)

fun List<PokeAPI>.toEntityList(): List<PokeAPIEntity> {
    return this.map { it.toEntity() }
}