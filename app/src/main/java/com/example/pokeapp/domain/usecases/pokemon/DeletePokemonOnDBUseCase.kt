package com.example.pokeapp.domain.usecases.pokemon

import com.example.pokeapp.domain.repositories.PokemonRepository
import com.example.pokeapp.domain.usecases.base.UseCase
import kotlinx.coroutines.CoroutineDispatcher

class DeletePokemonOnDBUseCase(
    private val repository: PokemonRepository,
    background: CoroutineDispatcher
): UseCase<Unit, Int>(background) {
    override suspend fun run(input: Int?) {
        requireNotNull(input) {"Id must not be null"}
        repository.deletePokemonOnDB(input)
    }
}