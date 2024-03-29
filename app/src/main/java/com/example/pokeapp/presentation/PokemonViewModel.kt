package com.example.pokeapp.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity
import com.example.pokeapp.domain.usecases.pokemon.DeletePokemonOnDBUseCase
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonByIdOnDBUseCase
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonDetailsByNameUseCase
import com.example.pokeapp.domain.usecases.pokemon.GetPokemonListDBUseCase
import com.example.pokeapp.domain.usecases.pokemon.SavePokemonOnDBUseCase
import com.example.pokeapp.domain.usecases.pokemon.UpdatePokemonOnDBUseCase
import com.example.pokeapp.presentation.actions.PokemonActions
import com.example.pokeapp.presentation.actions.PokemonEditActions
import com.example.pokeapp.presentation.form.PokemonEditForm
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
    private val getPokemonDetailsByNameUseCase: GetPokemonDetailsByNameUseCase,
    private val getPokemonListDBUseCase: GetPokemonListDBUseCase,
    private val savePokemonOnDBUseCase: SavePokemonOnDBUseCase,
    private val deletePokemonOnDBUseCase: DeletePokemonOnDBUseCase,
    private val getPokemonByIdOnDBUseCase: GetPokemonByIdOnDBUseCase,
    private val updatePokemonOnDBUseCase: UpdatePokemonOnDBUseCase
): ViewModel() {

    private val _pokemonObject = MutableStateFlow<com.example.pokeapp.domain.modelentities.entities.PokemonEntity?>(null)
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

    private val _pokemonListDB = MutableStateFlow<List<PokeAPIEntity>>(emptyList())
    val pokemonListDB = _pokemonListDB.asStateFlow()

    private val _isSelectedForm = MutableStateFlow<PokeAPIEntity?>(null)
    val isSelectedForm = _isSelectedForm.asStateFlow()

    private val _editFormText = MutableStateFlow(PokemonEditForm())
    val editFormText = _editFormText.asStateFlow()

    fun clickedPokemonNameSearchButton(flag: Boolean) {
        _isPokemonNameSearchClicked.value = flag
    }

    fun validatePokemonName(pokemonName: String) {
        _pokemonNameValidationState.value = when {
            pokemonName.isEmpty() -> Invalid("Pokemon Name cannot be empty")
            pokemonName.matches(Regex("^(?:[1-9]|[1-5][0-9]|[6-9][0-9]|[1-5][0-9]{2}|6[0-4][0-9]|65[0-9]|649)\$")) -> Valid
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
            getPokemonDetailsByNameUseCase(name).subscribe(
                { pokemonDetails ->
                    _isCircularLoadingState.value = false
                    _pokemonObject.value = pokemonDetails

                    savePokemonOnDBUseCase(
                        PokeAPIEntity(
                            pokemonObject.value!!.id,
                            pokemonObject.value!!.name
                        )
                    ).fold(
                        {
                           Log.d("Successful Pokemon API call", it.toString())
                        },
                        {
                            Log.d("Failed Pokemon API call", it.message.toString())
                        }
                    )
                }
            ) { error ->
                _pokemonObject.value = null
                _isCircularLoadingState.value = false
                _errorMessageFlag.value = true
                _errorMessage.value = "An unexpected error occurred: $error"
            }
    }

    fun getPokemonListDB() = viewModelScope.launch(Dispatchers.Main) {
        getPokemonListDBUseCase().fold(
            {
                _pokemonListDB.value = it
                println(pokemonListDB.value)
            },
            {
                println(it.message)
            }
        )
    }

    fun deletePokemonOnDb(id: Int?) = viewModelScope.launch(Dispatchers.Main) {
        deletePokemonOnDBUseCase(id).fold(
            {
                Log.d("Success Pokemon API call","Pokemon entity was deleted")
                getPokemonListDB()
            },
            {
                Log.d("Failed Pokemon API call", it.message.toString())
            }
        )
    }

    fun getPokemonByIdOnDB(id: Int?) = viewModelScope.launch(Dispatchers.Main) {
        getPokemonByIdOnDBUseCase(id).fold(
            { entity ->
//                _pokemonObjectOnDB.value = entity
                setEditPokeForm(entity)
            },
            {
                Log.d("Failed Pokemon API call",it.message.toString())
            }
        )
    }

    fun updatePokemonOnDB(id: Int, name: String) = viewModelScope.launch(Dispatchers.Main) {
        val newPokeObj = PokeAPIEntity(
            id = id,
            name = name
        )

        updatePokemonOnDBUseCase(id, newPokeObj).fold(
            {
                Log.d("Success Pokemon API call ----->","Pokemon entity was updated")
            },
            {
                Log.d("Failed Pokemon API call -----> ", it.message.toString())
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

    fun isSelectedFun(pokeObj: PokeAPIEntity) {
        _isSelectedForm.value = pokeObj
    }

    fun setPokemonTextField() {
        _pokemonForm.value.name = ""
    }

    fun setIsSelectedFun() {
        _isSelectedForm.value = null
    }

    private fun setEditPokeForm(pokeEntity: PokeAPIEntity) {
        _editFormText.value = PokemonEditForm(
            editId = pokeEntity.id,
            editName = pokeEntity.name
        )
    }

    fun onFieldEditFormChange(action: PokemonEditActions) {
        when (action) {
            is PokemonEditActions.OnIdChanged -> {
                _editFormText.update {
                    it.copy(editId = action.value)
                }
            }
            is PokemonEditActions.OnNameChanged -> {
                _editFormText.update {
                    it.copy(editName = action.value)
                }
            }
        }
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