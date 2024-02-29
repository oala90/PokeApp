package com.example.pokeapp.di

import com.example.pokeapp.data.remote.source.PokemonRemoteDataSourceImpl
import com.example.pokeapp.data.repositories.PokemonRemoteDataSource
import com.example.pokeapp.data.repositories.PokemonRepositoryImpl
import com.example.pokeapp.domain.repositories.PokemonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    internal abstract fun bindRemoteDataSource(
        pokemonRemoteDataSourceImpl: PokemonRemoteDataSourceImpl
    ): PokemonRemoteDataSource

    @Binds
    internal abstract fun bindPokemonRepository(
        repositoryImpl: PokemonRepositoryImpl
    ): PokemonRepository
}