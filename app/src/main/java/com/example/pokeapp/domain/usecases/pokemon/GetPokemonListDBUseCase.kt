package com.example.pokeapp.domain.usecases.pokemon

import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity
import com.example.pokeapp.domain.repositories.PokemonRepository
import com.example.pokeapp.domain.usecases.base.UseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetPokemonListDBUseCase @Inject constructor(
    private val repository: PokemonRepository,
    background: CoroutineDispatcher
): UseCase<List<PokeAPIEntity>, Unit>(background) {
    override suspend fun run(input: Unit?): List<PokeAPIEntity> {
        return repository.getPokemonListDB()
    }
}