package com.example.pokeapp.domain.entities

import kotlinx.serialization.SerialName

data class GenerationViiEntity(
    val icons: IconsEntity,
//    @SerialName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoonEntity
)