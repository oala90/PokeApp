package com.example.pokeapp.data.repositories

import com.example.pokeapp.data.dto.Pokemon
import com.example.pokeapp.data.mapper.toEntity
import com.example.pokeapp.domain.entities.PokemonEntity
import com.example.pokeapp.domain.repositories.PokemonRepository
import javax.inject.Inject

internal class PokemonRepositoryImpl @Inject constructor(
    private val pokemonRemoteDataSource: PokemonRemoteDataSource
): PokemonRepository {
    override suspend fun getPokemonByName(name: String): PokemonEntity {
        return pokemonRemoteDataSource.getPokemonByName(name).toEntity()
    }
}

internal interface PokemonRemoteDataSource {
    suspend fun getPokemonByName(name: String): Pokemon
}