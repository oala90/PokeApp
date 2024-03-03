package com.example.pokeapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.pokeapp.R
import com.example.pokeapp.domain.entities.PokemonEntity
import com.example.pokeapp.presentation.actions.PokemonActions
import com.example.pokeapp.presentation.images.icons.rememberQuestionMark
import com.example.pokeapp.presentation.validation.StateValidation
import com.example.pokeapp.presentation.visualtransformation.DigitLimitTransformation

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PokemonSearchView(
    pokemonObjEnt: PokemonEntity?,
    currentPokemonName: String,
    onChangedPokemonName: (PokemonActions.OnNameChanged) -> Unit,
    pokemonNameValidation: StateValidation,
    onPokemonNameValidation: (String) -> Unit,
    clickedPokemonNameSearchButton: Boolean,
    isClickedPokemonNameSearchButton: (Boolean) -> Unit,
    isButtonEnabled: Boolean,
    searchPokemonButton: () -> Unit,
    onClearButtonClick: () -> Unit,
    clearValidations: () -> Unit,
    errorMessageState: String?,
    errorMessageFlag: Boolean,
    isLoadingState: Boolean,
    onResetErrorMessageFlag: () -> Unit
) {
    var isHintDialogVisible by remember { mutableStateOf(false) }
    var isDialogVisible by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = pokemonObjEnt?.name ?: "Pokemon",
                modifier = Modifier.padding(8.dp),
                fontFamily = FontFamily.Cursive,
                fontSize = 50.sp
            )

            val pokemonImage = pokemonObjEnt?.sprites?.front_default

            if(pokemonImage != null) {
                GlideImage(
                    model =pokemonImage,
                    contentDescription = null,
                    modifier = Modifier.size(200.dp),
                )
            } else {
                Image(
                    painter = painterResource(id = R.drawable.free_poke_ball_vector),
                    contentDescription = "Default Pokemon Image",
                    modifier = Modifier.size(200.dp)
                )
            }

            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextField(
                        value = currentPokemonName,
                        onValueChange = {
                            if(it.length <= 10) {
                                onChangedPokemonName(PokemonActions.OnNameChanged(it))
                                isClickedPokemonNameSearchButton(false)
                                onPokemonNameValidation(it)
                            }
                        },
                        maxLines = 1,
                        visualTransformation = DigitLimitTransformation(10),
                        label = {
                            Text(text = "Pokemon Name")
                        },
                        modifier = Modifier.padding(8.dp)
                    )

                    Icon(
                        imageVector = rememberQuestionMark(),
                        contentDescription = "Help Icon",
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(24.dp)
                            .padding(start = 4.dp)
                            .clickable {
                                isHintDialogVisible = true
                            }
                    )
                }

                if (clickedPokemonNameSearchButton && pokemonNameValidation is StateValidation.Invalid) {
                    TextFieldError(textError = pokemonNameValidation.error)
                }

                if (isHintDialogVisible) {
                    ShowMessageDialog(
                        title = "Hint",
                        message = "This field accepts ids from 1 to 649 and all lowercase letters.",
                        onDismiss = {
                            isHintDialogVisible = false
                        }
                    )
                }
            }

            Button(
                onClick = {
                    isClickedPokemonNameSearchButton(true)
                    if(isButtonEnabled) {
                        searchPokemonButton()
                    } else {
                        isDialogVisible = true
                    }
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "Buscar")
            }

            if(isDialogVisible) {
                ShowMessageDialog(
                    title = "Error",
                    message = "Pokemon text field is invalid. You must enter a valid number ID or lowercase letters. Click on icon to see more details.",
                    onDismiss = {
                        isDialogVisible = false
                    }
                )
            }
            if(errorMessageFlag) {
                ShowMessageDialog(
                    title = "Error",
                    onDismiss = {
                        onResetErrorMessageFlag()

                    },
                    message = errorMessageState ?: ""
                )
            }

            Button(
                onClick = {
                    onClearButtonClick()
                    isClickedPokemonNameSearchButton(false)
                    clearValidations()
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "Limpiar")
            }
        }

        if(isLoadingState) {
            CircularProgressIndicator(color = MaterialTheme.colorScheme.secondary)
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
        StateValidation.Idle,
        {_-> },
        false,
        {_ ->},
        false,
        {},
        {},
        {},
        "",
        errorMessageFlag = false,
        isLoadingState = false,
        onResetErrorMessageFlag = {}
    )
}