package com.example.pokeapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.pokeapp.domain.entities.PokemonEntity
import com.example.pokeapp.presentation.actions.PokemonActions

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PokemonSearchView(
    pokemonObjEnt: PokemonEntity?,
    currentPokemonName: String,
    onChangedPokemonName: (PokemonActions.OnNameChanged) -> Unit,
    searchPokemonButton: () -> Unit
) {
    Column {
        Text(
            text = "${pokemonObjEnt?.name}"
        )

        GlideImage(
            model = pokemonObjEnt?.sprites?.front_default,
            contentDescription = null,
            modifier = Modifier.size(50.dp)
        )

        TextField(
            value = currentPokemonName,
            onValueChange = {
                onChangedPokemonName(PokemonActions.OnNameChanged(it))
            },
            label = {
                Text(text = "Pokemon Name")
            }
        )

        Button(
            onClick = {
                searchPokemonButton()
                println(pokemonObjEnt?.id)
            }
        ) {
            Text(text = "Buscar")
        }

        Button(onClick = {  }) {
            Text(text = "Limpiar")
        }
    }
}

@Preview
@Composable
fun PokemonSearchViewPreview() {
    PokemonSearchView(
        null,
        "",
        {},
        {}
    )
}