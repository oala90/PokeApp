package com.example.pokeapp.domain.modelentities.entities

data class SpritesEntity(
    val back_default: String?,
    val back_female: String?,
    val back_shiny: String?,
    val back_shiny_female: String?,
    val front_default: String?,
    val front_female: String?,
    val front_shiny: String?,
    val front_shiny_female: String?,
    val other: com.example.pokeapp.domain.modelentities.entities.OtherEntity,
    val versions: com.example.pokeapp.domain.modelentities.entities.VersionsEntity
)