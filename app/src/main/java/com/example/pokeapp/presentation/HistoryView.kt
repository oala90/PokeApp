package com.example.pokeapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pokeapp.domain.modelentities.pokeapientities.PokeAPIEntity

@Composable
fun HistoryView(
    pokemonListDB: List<PokeAPIEntity>,
    isSelectedItem: PokeAPIEntity?,
    onIsSelectedChanged: (PokeAPIEntity) -> Unit,
    deletePokemon: (Int?) -> Unit,
    updatePokemon: (Int?) -> Unit,
    goBackEvent: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if(pokemonListDB.isEmpty()) {
            Text(
                text = "No Pokemons on DB",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .background(
                        color = MaterialTheme.colorScheme.surface,
                        shape = MaterialTheme.shapes.small
                    ),
                fontSize = 16.sp
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 16.dp)
                .height(200.dp) // Set a fixed height
        ) {
            LazyColumn(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .background(Color.White)
            ) {
                items(pokemonListDB) { pokemon ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp, horizontal = 16.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .clickable {
                                onIsSelectedChanged(pokemon)
                                println(isSelectedItem)
                            }
                    ) {
                        Text(
                            text = "id: ${pokemon.id} ::-----:: Name: ${pokemon.name}",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier
                                .background(
                                    color = MaterialTheme.colorScheme.surface,
                                    shape = MaterialTheme.shapes.small
                                ),
                            fontSize = 16.sp
                        )
                    }
                    Spacer(
                        modifier = Modifier
                            .height(4.dp)
                    )
                }
            }
        }

        Row {
            Button(
                onClick = {
                    goBackEvent()
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "Go Back")
            }

            Button(
                onClick = {
                    updatePokemon(isSelectedItem?.id)
                },
                modifier = Modifier.padding(8.dp),
                enabled = isSelectedItem != null
            ) {
                Text(text = "Update")
            }
        }

        Button(
            onClick = {
                deletePokemon(isSelectedItem?.id)
            },
            modifier = Modifier.padding(8.dp),
            enabled = isSelectedItem != null
        ) {
            Text(text = "Delete")
        }
    }
}

@Preview
@Composable
fun HistoryViewPreview() {
    HistoryView(
        emptyList(),
        null,
        {},
        {},
        {},
        {}
    )
}