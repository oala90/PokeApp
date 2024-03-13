package com.example.pokeapp.domain.usecases.pokemon

import com.example.pokeapp.domain.modelentities.entities.PokemonEntity
import com.example.pokeapp.domain.repositories.PokemonRepository
import com.example.pokeapp.domain.usecases.base.UseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetPokemonDetailsByNameUseCase @Inject constructor(
    private val repository: PokemonRepository,
    background: CoroutineDispatcher
): UseCase<PokemonEntity, String>(background) {
    override suspend fun run(input: String?): PokemonEntity {
        requireNotNull(input) { "Pokemon name must not be null" }
        return repository.getPokemonByName(name = input)
    }
}