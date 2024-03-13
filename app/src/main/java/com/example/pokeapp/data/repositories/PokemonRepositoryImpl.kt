package com.example.pokeapp.data.repositories

import com.example.pokeapp.data.mapper.toDto
import com.example.pokeapp.data.model.dto.Pokemon
import com.example.pokeapp.data.mapper.toEntity
import com.example.pokeapp.data.mapper.toEntityList
import com.example.pokeapp.data.model.dtopokeapi.PokeAPI
import com.example.pokeapp.domain.modelentities.entities.PokemonEntity
import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity
import com.example.pokeapp.domain.repositories.PokemonRepository
import javax.inject.Inject

internal class PokemonRepositoryImpl @Inject constructor(
    private val pokemonRemoteDataSource: PokemonRemoteDataSource
): PokemonRepository {
    override suspend fun getPokemonByName(name: String): PokemonEntity {
        return pokemonRemoteDataSource.getPokemonByName(name).toEntity()
    }

    override suspend fun getPokemonListDB(): List<PokeAPIEntity> {
        return pokemonRemoteDataSource.getPokemonListDB().toEntityList()
    }

    override suspend fun getPokemonDetailsOnDB(id: Int): PokeAPIEntity {
        return pokemonRemoteDataSource.getPokemonDetailsOnDB(id).toEntity()
    }

    override suspend fun savePokemonOnDB(pokeObj: PokeAPIEntity) {
        pokemonRemoteDataSource.savePokemonOnDB(pokeObj.toDto())
    }

    override suspend fun updatePokemonOnDB(id: Int, pokeObj: PokeAPIEntity) {
        pokemonRemoteDataSource.updatePokemonOnDB(id, pokeObj.toDto())
    }

    override suspend fun deletePokemonOnDB(id: Int) {
        pokemonRemoteDataSource.deletePokemonOnDB(id)
    }
}

internal interface PokemonRemoteDataSource {
    suspend fun getPokemonByName(name: String): Pokemon
    suspend fun getPokemonListDB(): List<PokeAPI>
    suspend fun getPokemonDetailsOnDB(id: Int): PokeAPI
    suspend fun savePokemonOnDB(pokeObj: PokeAPI)
    suspend fun updatePokemonOnDB(id: Int, pokeObj: PokeAPI)
    suspend fun deletePokemonOnDB(id: Int)
}