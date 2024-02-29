package com.example.pokeapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokeapp.domain.entities.PokemonEntity
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonDetailsByNameUseCase
import com.example.pokeapp.presentation.actions.PokemonActions
import com.example.pokeapp.presentation.form.PokemonForm
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonDetailsByNameUseCase: GetPokemonDetailsByNameUseCase
): ViewModel() {

    private val _pokemonObject = MutableStateFlow<PokemonEntity?>(null)
    val pokemonObject = _pokemonObject.asStateFlow()

    private val _pokemonForm = MutableStateFlow(PokemonForm())
    val pokemonForm = _pokemonForm.asStateFlow()

    fun getPokemonByName(name: String) = viewModelScope.launch(Dispatchers.Main) {
        getPokemonDetailsByNameUseCase(name).fold(
            { entity ->
                _pokemonObject.value = entity
            },
            {
                _pokemonObject.value = null
            }
        )
    }

    fun onFieldChange(action: PokemonActions) {
        when (action) {
            is PokemonActions.OnNameChanged -> {
                _pokemonForm.update {
                    it.copy(name = action.value)
                }
            }
        }
    }
}