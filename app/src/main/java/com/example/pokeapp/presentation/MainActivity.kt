package com.example.pokeapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pokeapp.presentation.actions.PokemonActions
import com.example.pokeapp.presentation.ui.theme.PokeAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val myViewModel: PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokeAppTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "PokemonSearchView",
                    ) {
                        composable("PokemonSearchView") {
                           LaunchedEffect(Unit) {
                               myViewModel.resetValidationStates()
                               myViewModel.resetPokemonResultState()

                           }

                            val pokemonObj by myViewModel.pokemonObject.collectAsState()
                            val pokemonForm by myViewModel.pokemonForm.collectAsState()
                            val pokemonValidationState by myViewModel.pokemonNameValidationState.collectAsState()
                            val pokemonNameSearchClicked by myViewModel.isPokemonNameSearchClicked.collectAsState()
                            val pokemonIsButtonEnabled by myViewModel.pokemonNameButtonValidation.collectAsState()
                            val pokemonErrorMessageState by myViewModel.errorMessage.collectAsState()
                            val pokemonIsLoadingState by myViewModel.isCircularLoadingState.collectAsState()
                            val pokemonErrorMessageFlag by myViewModel.errorMessageFlag.collectAsState()

                            PokemonSearchView(
                                pokemonObjEnt = pokemonObj,
                                currentPokemonName = pokemonForm.name,
                                onChangedPokemonName = myViewModel::onFieldChange,
                                pokemonNameValidation = pokemonValidationState,
                                onPokemonNameValidation = {
                                    myViewModel.validatePokemonName(it)
                                },
                                clickedPokemonNameSearchButton = pokemonNameSearchClicked,
                                isClickedPokemonNameSearchButton = {
                                    myViewModel.clickedPokemonNameSearchButton(it)
                                },
                                isButtonEnabled = pokemonIsButtonEnabled,
                                searchPokemonButton = {
                                    myViewModel.getPokemonByName(pokemonForm.name)
                                },
                                onClearButtonClick = {
                                    myViewModel.onFieldChange(PokemonActions.OnNameChanged(""))
                                    myViewModel.onClearPokemonObj()
                                },
                                clearValidations = {
                                    myViewModel.resetValidationStates()
                                },
                                errorMessageState = pokemonErrorMessageState,
                                errorMessageFlag = pokemonErrorMessageFlag,
                                isLoadingState = pokemonIsLoadingState,
                                onResetErrorMessageFlag = {
                                    myViewModel.setErrorMessageFlag()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
