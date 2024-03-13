package com.example.pokeapp.domain.usecases.pokemon

import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity
import com.example.pokeapp.domain.repositories.PokemonRepository
import com.example.pokeapp.domain.usecases.base.UseCaseTwo
import kotlinx.coroutines.CoroutineDispatcher

class UpdatePokemonOnDBUseCase(
    private val repository: PokemonRepository,
    background: CoroutineDispatcher
): UseCaseTwo<Unit, Int, PokeAPIEntity>(background) {
    override suspend fun run(input1: Int?, input2: PokeAPIEntity?) {
        requireNotNull(input1) {}
        requireNotNull(input2) {}
        repository.updatePokemonOnDB(input1, input2)
    }
}