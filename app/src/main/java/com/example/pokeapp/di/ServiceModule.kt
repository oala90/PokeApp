package com.example.pokeapp.di

import com.example.pokeapp.data.remote.api.PokemonService
import com.example.pokeapp.data.remote.api.PokemonServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {

    @Binds
    internal abstract fun bindPokemonService(pokemonServiceImpl: PokemonServiceImpl): PokemonService
}