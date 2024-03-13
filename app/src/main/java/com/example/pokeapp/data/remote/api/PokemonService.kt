package com.example.pokeapp.data.remote.api

import com.example.pokeapp.data.model.dto.Pokemon
import com.example.pokeapp.data.model.dtopokeapi.PokeAPI

interface PokemonService {
    suspend fun getPokemonByName(name: String): Pokemon
    suspend fun getPokemonListDB(): List<PokeAPI>
    suspend fun getPokemonDetailsOnDB(id: Int): PokeAPI
    suspend fun savePokemonOnDB(pokeObj: PokeAPI)
    suspend fun updatePokemonOnDB(id: Int, pokeObj: PokeAPI)
    suspend fun deletePokemonOnDB(id: Int)

//    @GET("pokemon/{name}/")
//    suspend fun getPokemonByName(@Path("name") name: String): Pokemon
}