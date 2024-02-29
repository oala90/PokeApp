package com.example.pokeapp.data.remote.api

import com.example.pokeapp.data.dto.Pokemon
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.URLProtocol
import io.ktor.http.encodedPath
import javax.inject.Inject

class PokemonServiceImpl @Inject constructor(
    private val httpClient: HttpClient
): PokemonService {
    override suspend fun getPokemonByName(name: String): Pokemon {
        return httpClient.get {
            url {
                protocol = URLProtocol.HTTPS
                host = "pokeapi.co"
                encodedPath = "/api/v2/pokemon/$name/"
            }
        }.body()
    }
}