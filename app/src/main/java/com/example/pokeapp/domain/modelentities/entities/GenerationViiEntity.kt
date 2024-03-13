package com.example.pokeapp.domain.modelentities.entities

import kotlinx.serialization.SerialName

data class GenerationViiEntity(
    val icons: com.example.pokeapp.domain.modelentities.entities.IconsEntity,
//    @SerialName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: com.example.pokeapp.domain.modelentities.entities.UltraSunUltraMoonEntity
)