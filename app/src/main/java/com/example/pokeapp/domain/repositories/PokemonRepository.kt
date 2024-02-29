package com.example.pokeapp.domain.repositories

import com.example.pokeapp.domain.entities.PokemonEntity


interface PokemonRepository {

    suspend fun getPokemonByName(name: String): PokemonEntity
}