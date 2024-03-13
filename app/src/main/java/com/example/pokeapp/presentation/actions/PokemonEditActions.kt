package com.example.pokeapp.presentation.actions

sealed interface PokemonEditActions {
    data class OnIdChanged(val value: Int) : PokemonEditActions
    data class OnNameChanged(val value: String) : PokemonEditActions
}