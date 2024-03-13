package com.example.pokeapp.data.model.dtopokeapi

import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
data class PokeAPI(
    @PrimaryKey
    val id: Int,
    val name: String
)
