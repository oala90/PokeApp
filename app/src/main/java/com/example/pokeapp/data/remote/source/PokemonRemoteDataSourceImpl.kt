package com.example.pokeapp.data.remote.source

import com.example.pokeapp.data.dto.Pokemon
import com.example.pokeapp.data.remote.api.PokemonService
import com.example.pokeapp.data.repositories.PokemonRemoteDataSource
import javax.inject.Inject

internal class PokemonRemoteDataSourceImpl @Inject constructor(
    private val pokemonService: PokemonService
): PokemonRemoteDataSource {
    override suspend fun getPokemonByName(name: String): Pokemon {
        return pokemonService.getPokemonByName(name)
    }
}