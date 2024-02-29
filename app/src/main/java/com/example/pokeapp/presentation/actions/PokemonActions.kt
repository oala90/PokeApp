package com.example.pokeapp.presentation.actions

sealed interface PokemonActions {
    data class OnNameChanged(val value: String) : PokemonActions
}