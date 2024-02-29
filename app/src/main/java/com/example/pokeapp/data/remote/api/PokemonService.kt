package com.example.pokeapp.data.remote.api

import com.example.pokeapp.data.dto.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {
    suspend fun getPokemonByName(name: String): Pokemon

//    @GET("pokemon/{name}/")
//    suspend fun getPokemonByName(@Path("name") name: String): Pokemon
}