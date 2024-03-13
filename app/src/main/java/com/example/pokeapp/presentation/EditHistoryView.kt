package com.example.pokeapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokeapp.presentation.actions.PokemonEditActions
import com.example.pokeapp.presentation.visualtransformation.DigitLimitTransformation

@Composable
fun EditHistoryView(
    editIdValue: Int,
    onEditIdChange: (PokemonEditActions.OnIdChanged) -> Unit,
    editNameValue: String,
    onEditNameChange: (PokemonEditActions.OnNameChanged) -> Unit,
    updatePokemonEvent: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            TextField(
                value = editIdValue.toString(),
                onValueChange = {
                    if(it.length <= 3) {
                        onEditIdChange(PokemonEditActions.OnIdChanged(it.toInt()))
                    }
                },
                visualTransformation = DigitLimitTransformation(3),
                maxLines = 1,
                readOnly = true,
                label = {
                    Text(text = "Id")
                },
                modifier = Modifier
                    .padding(8.dp)
                    .width(120.dp)
            )
            TextField(
                value = editNameValue,
                onValueChange = {
                    if(it.length <= 10) {
                        onEditNameChange(PokemonEditActions.OnNameChanged(it))
                    }
                },
                maxLines = 1,
                visualTransformation = DigitLimitTransformation(10),
                label = {
                    Text(text = "Name")
                },
                modifier = Modifier
                    .padding(8.dp)
                    .width(120.dp)
            )
        }
        
        Button(
            onClick = {
                updatePokemonEvent()
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Save")
        }
    }
}

@Preview
@Composable
fun EditHistoryViewPreview() {
    EditHistoryView(
        0,
        {},
        "",
        {},
        {}
    )
}