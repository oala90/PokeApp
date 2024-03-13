package com.example.pokeapp.data.remote.source

import com.example.pokeapp.data.model.dto.Pokemon
import com.example.pokeapp.data.model.dtopokeapi.PokeAPI
import com.example.pokeapp.data.remote.api.PokemonService
import com.example.pokeapp.data.repositories.PokemonRemoteDataSource
import javax.inject.Inject

internal class PokemonRemoteDataSourceImpl @Inject constructor(
    private val pokemonService: PokemonService
): PokemonRemoteDataSource {
    override suspend fun getPokemonByName(name: String): Pokemon {
        return pokemonService.getPokemonByName(name)
    }

    override suspend fun getPokemonListDB(): List<PokeAPI> {
        return pokemonService.getPokemonListDB()
    }

    override suspend fun getPokemonDetailsOnDB(id: Int): PokeAPI {
        return pokemonService.getPokemonDetailsOnDB(id)
    }

    override suspend fun savePokemonOnDB(pokeObj: PokeAPI) {
        pokemonService.savePokemonOnDB(pokeObj)
    }

    override suspend fun updatePokemonOnDB(id: Int, pokeObj: PokeAPI) {
        pokemonService.updatePokemonOnDB(id, pokeObj)
    }

    override suspend fun deletePokemonOnDB(id: Int) {
        pokemonService.deletePokemonOnDB(id)
    }
}