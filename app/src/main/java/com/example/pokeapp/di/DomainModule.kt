package com.example.pokeapp.di

import com.example.pokeapp.domain.repositories.PokemonRepository
import com.example.pokeapp.domain.usecases.pokemon.DeletePokemonOnDBUseCase
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonByIdOnDBUseCase
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonDetailsByNameUseCase
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonListDBUseCase
import com.example.pokeapp.domain.usecases.pokemon.SavePokemonOnDBUseCase
import com.example.pokeapp.domain.usecases.pokemon.UpdatePokemonOnDBUseCase
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

    @Singleton
    @Provides
    fun provideGetPokemonByIdOnDBUseCase(
        repository: PokemonRepository,
        background: CoroutineDispatcher
    ) = GetPokemonByIdOnDBUseCase(repository, background)

    @Singleton
    @Provides
    fun provideGetPokemonListDBUseCase(
        repository: PokemonRepository,
        background: CoroutineDispatcher
    ) = GetPokemonListDBUseCase(repository, background)

    @Singleton
    @Provides
    fun provideDeletePokemonOnDBUseCase(
        repository: PokemonRepository,
        background: CoroutineDispatcher
    ) = DeletePokemonOnDBUseCase(repository, background)

    @Singleton
    @Provides
    fun provideSavePokemonOnDBUseCase(
        repository: PokemonRepository,
        background: CoroutineDispatcher
    ) = SavePokemonOnDBUseCase(repository, background)

    @Singleton
    @Provides
    fun provideUpdatePokemonOnDBUseCase(
        repository: PokemonRepository,
        background: CoroutineDispatcher
    ) = UpdatePokemonOnDBUseCase(repository, background)
}