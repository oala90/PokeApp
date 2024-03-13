package com.example.pokeapp.domain.repositories

import com.example.pokeapp.data.model.dtopokeapi.PokeAPI
import com.example.pokeapp.domain.modelentities.entities.PokemonEntity
import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity


interface PokemonRepository {

    suspend fun getPokemonByName(name: String): PokemonEntity
    suspend fun getPokemonListDB(): List<PokeAPIEntity>
    suspend fun getPokemonDetailsOnDB(id: Int): PokeAPIEntity
    suspend fun savePokemonOnDB(pokeObj: PokeAPIEntity)
    suspend fun updatePokemonOnDB(id: Int, pokeObj: PokeAPIEntity)
    suspend fun deletePokemonOnDB(id: Int)
}