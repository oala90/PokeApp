package com.example.pokeapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokeapp.domain.entities.PokemonEntity
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonDetailsByNameUseCase
import com.example.pokeapp.presentation.actions.PokemonActions
import com.example.pokeapp.presentation.form.PokemonForm
import com.example.pokeapp.presentation.validation.StateValidation
import com.example.pokeapp.presentation.validation.StateValidation.*
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

    private val _pokemonNameButtonValidation = MutableStateFlow(false)
    val pokemonNameButtonValidation = _pokemonNameButtonValidation.asStateFlow()

    private val _pokemonNameValidationState = MutableStateFlow<StateValidation>(Idle)
    val pokemonNameValidationState = _pokemonNameValidationState.asStateFlow()

    private val _isPokemonNameSearchClicked = MutableStateFlow(false)
    val isPokemonNameSearchClicked = _isPokemonNameSearchClicked.asStateFlow()

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage = _errorMessage.asStateFlow()

    private val _errorMessageFlag  = MutableStateFlow(false)
    val errorMessageFlag = _errorMessageFlag.asStateFlow()

    private val _isCircularLoadingState = MutableStateFlow(false)
    val isCircularLoadingState = _isCircularLoadingState.asStateFlow()

    fun clickedPokemonNameSearchButton(flag: Boolean) {
        _isPokemonNameSearchClicked.value = flag
    }

    fun validatePokemonName(pokemonName: String) {
        _pokemonNameValidationState.value = when {
            pokemonName.isEmpty() -> Invalid("Pokemon Name cannot be empty")
            pokemonName.matches(Regex("^(?:[1-9]|[1-5][0-9]|6[0-4][0-9]|649)\$")) -> Valid
            pokemonName.matches(Regex("^[a-z]+\$?\$")) -> Valid
            else -> Invalid("Pokemon name or ID is invalid")
        }
        searchPokemonButtonEnableState()
    }

    fun resetValidationStates() {
        validatePokemonName("")
    }

    private fun searchPokemonButtonEnableState() {
        _pokemonNameButtonValidation.value = _pokemonNameValidationState.value is Valid
    }

    fun setErrorMessageFlag() {
        _errorMessageFlag.value = false
    }

    fun getPokemonByName(name: String) = viewModelScope.launch(Dispatchers.Main) {
            _isCircularLoadingState.value = true
            getPokemonDetailsByNameUseCase(name).fold(
                { pokemonDetails ->
                    _isCircularLoadingState.value = false
                    _pokemonObject.value = pokemonDetails
                },
                { error ->
                    _pokemonObject.value = null
                    _isCircularLoadingState.value = false
                    _errorMessageFlag.value = true
                    _errorMessage.value = "An unexpected error occurred: $error"
                }
            )
    }

    fun onClearPokemonObj() {
        _pokemonObject.value = null
    }

    fun resetPokemonResultState() {
        _isCircularLoadingState.value = false
        _errorMessage.value = null
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