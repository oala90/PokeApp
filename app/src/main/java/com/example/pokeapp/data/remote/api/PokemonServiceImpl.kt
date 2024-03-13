package com.example.pokeapp.data.remote.api

import com.example.pokeapp.data.model.dto.Pokemon
import com.example.pokeapp.data.model.dtopokeapi.PokeAPI
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.URLProtocol
import io.ktor.http.contentType
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

    override suspend fun getPokemonListDB(): List<PokeAPI> {
        return httpClient.get {
            url {
                protocol = URLProtocol.HTTP
                host = "10.0.2.2"
                port = 8080
                encodedPath = "/pokemon/"
            }
        }.body()
    }

    override suspend fun getPokemonDetailsOnDB(id: Int): PokeAPI {
        return httpClient.get {
            url {
                protocol = URLProtocol.HTTP
                host = "10.0.2.2"
                port = 8080
                encodedPath = "/pokemon/$id/"
            }
        }.body()
    }

    override suspend fun savePokemonOnDB(pokeObj: PokeAPI) {
        httpClient.post {
            url {
                protocol = URLProtocol.HTTP
                host = "10.0.2.2"
                port = 8080
                encodedPath = "/pokemon/"
            }
            contentType(ContentType.Application.Json)
            setBody(pokeObj)
        }
    }

    override suspend fun updatePokemonOnDB(id: Int, pokeObj: PokeAPI) {
        httpClient.put {
            url {
                protocol = URLProtocol.HTTP
                host = "10.0.2.2"
                port = 8080
                encodedPath = "/pokemon/$id/"
            }
            contentType(ContentType.Application.Json)
            setBody(pokeObj)
        }
    }

    override suspend fun deletePokemonOnDB(id: Int) {
        httpClient.delete {
            url {
                protocol = URLProtocol.HTTP
                host = "10.0.2.2"
                port = 8080
                encodedPath = "/pokemon/$id/"
            }
        }
    }
}