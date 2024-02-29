package com.example.pokeapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pokeapp.domain.entities.PokemonEntity
import com.example.pokeapp.presentation.ui.theme.PokeAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.serialization.json.JsonNull.content

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val myViewModel: PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokeAppTheme {
                // A surface container using the 'background' color from the theme
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
                            val pokemonObj by myViewModel.pokemonObject.collectAsState()
                            val pokemonForm by myViewModel.pokemonForm.collectAsState()

                            PokemonSearchView(
                                pokemonObjEnt = pokemonObj,
                                currentPokemonName = pokemonForm.name,
                                onChangedPokemonName = myViewModel::onFieldChange,
                                searchPokemonButton = {
                                    myViewModel.getPokemonByName(pokemonForm.name)
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
