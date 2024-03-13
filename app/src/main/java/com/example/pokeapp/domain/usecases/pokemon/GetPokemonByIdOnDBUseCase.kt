package com.example.pokeapp.domain.usecases.pokemon

import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity
import com.example.pokeapp.domain.repositories.PokemonRepository
import com.example.pokeapp.domain.usecases.base.UseCase
import kotlinx.coroutines.CoroutineDispatcher

class GetPokemonByIdOnDBUseCase(
    private val repository: PokemonRepository,
    background: CoroutineDispatcher
): UseCase<PokeAPIEntity, Int>(background) {
    override suspend fun run(input: Int?): PokeAPIEntity {
        requireNotNull(input) {"Id must not be null"}
        return repository.getPokemonDetailsOnDB(input)
    }
}