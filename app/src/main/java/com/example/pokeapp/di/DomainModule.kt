package com.example.pokeapp.di

import com.example.pokeapp.domain.repositories.PokemonRepository
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonDetailsByNameUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Singleton
    @Provides
    fun provideGetPokemonDetailsByNameUseCase(
        repository: PokemonRepository,
        background: CoroutineDispatcher
    ) = GetPokemonDetailsByNameUseCase(repository, background)
}