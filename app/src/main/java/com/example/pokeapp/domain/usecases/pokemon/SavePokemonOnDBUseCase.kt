package com.example.pokeapp.domain.usecases.pokemon

import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity
import com.example.pokeapp.domain.repositories.PokemonRepository
import com.example.pokeapp.domain.usecases.base.UseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class SavePokemonOnDBUseCase @Inject constructor(
    private val repository: PokemonRepository,
    background: CoroutineDispatcher
): UseCase<Unit, PokeAPIEntity>(background) {
    override suspend fun run(input: PokeAPIEntity?) {
        requireNotNull(input){"No null pokemon objects"}
        repository.savePokemonOnDB(input)
    }
}