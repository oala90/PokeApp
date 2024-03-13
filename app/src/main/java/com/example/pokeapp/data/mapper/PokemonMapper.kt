package com.example.pokeapp.data.mapper

import com.example.pokeapp.data.model.dto.Ability
import com.example.pokeapp.data.model.dto.AbilityX
import com.example.pokeapp.data.model.dto.Animated
import com.example.pokeapp.data.model.dto.BlackWhite
import com.example.pokeapp.data.model.dto.Cries
import com.example.pokeapp.data.model.dto.Crystal
import com.example.pokeapp.data.model.dto.DiamondPearl
import com.example.pokeapp.data.model.dto.DreamWorld
import com.example.pokeapp.data.model.dto.Emerald
import com.example.pokeapp.data.model.dto.FireredLeafgreen
import com.example.pokeapp.data.model.dto.Form
import com.example.pokeapp.data.model.dto.GameIndice
import com.example.pokeapp.data.model.dto.Generation
import com.example.pokeapp.data.model.dto.GenerationI
import com.example.pokeapp.data.model.dto.GenerationIi
import com.example.pokeapp.data.model.dto.GenerationIii
import com.example.pokeapp.data.model.dto.GenerationIv
import com.example.pokeapp.data.model.dto.GenerationV
import com.example.pokeapp.data.model.dto.GenerationVi
import com.example.pokeapp.data.model.dto.GenerationVii
import com.example.pokeapp.data.model.dto.GenerationViii
import com.example.pokeapp.data.model.dto.Gold
import com.example.pokeapp.data.model.dto.HeartgoldSoulsilver
import com.example.pokeapp.data.model.dto.HeldItem
import com.example.pokeapp.data.model.dto.Home
import com.example.pokeapp.data.model.dto.Icons
import com.example.pokeapp.data.model.dto.IconsX
import com.example.pokeapp.data.model.dto.Item
import com.example.pokeapp.data.model.dto.Move
import com.example.pokeapp.data.model.dto.MoveLearnMethod
import com.example.pokeapp.data.model.dto.MoveX
import com.example.pokeapp.data.model.dto.OfficialArtwork
import com.example.pokeapp.data.model.dto.OmegarubyAlphasapphire
import com.example.pokeapp.data.model.dto.Other
import com.example.pokeapp.data.model.dto.PastType
import com.example.pokeapp.data.model.dto.Platinum
import com.example.pokeapp.data.model.dto.Pokemon
import com.example.pokeapp.data.model.dto.RedBlue
import com.example.pokeapp.data.model.dto.RubySapphire
import com.example.pokeapp.data.model.dto.Showdown
import com.example.pokeapp.data.model.dto.Silver
import com.example.pokeapp.data.model.dto.Species
import com.example.pokeapp.data.model.dto.Sprites
import com.example.pokeapp.data.model.dto.Stat
import com.example.pokeapp.data.model.dto.StatX
import com.example.pokeapp.data.model.dto.Type
import com.example.pokeapp.data.model.dto.TypeX
import com.example.pokeapp.data.model.dto.TypeXX
import com.example.pokeapp.data.model.dto.TypeXXX
import com.example.pokeapp.data.model.dto.UltraSunUltraMoon
import com.example.pokeapp.data.model.dto.Version
import com.example.pokeapp.data.model.dto.VersionDetail
import com.example.pokeapp.data.model.dto.VersionGroup
import com.example.pokeapp.data.model.dto.VersionGroupDetail
import com.example.pokeapp.data.model.dto.Versions
import com.example.pokeapp.data.model.dto.XY
import com.example.pokeapp.data.model.dto.Yellow
import com.example.pokeapp.domain.modelentities.entities.AbilityEntity
import com.example.pokeapp.domain.modelentities.entities.AbilityXEntity
import com.example.pokeapp.domain.modelentities.entities.AnimatedEntity
import com.example.pokeapp.domain.modelentities.entities.BlackWhiteEntity
import com.example.pokeapp.domain.modelentities.entities.CriesEntity
import com.example.pokeapp.domain.modelentities.entities.CrystalEntity
import com.example.pokeapp.domain.modelentities.entities.DiamondPearlEntity
import com.example.pokeapp.domain.modelentities.entities.DreamWorldEntity
import com.example.pokeapp.domain.modelentities.entities.EmeraldEntity
import com.example.pokeapp.domain.modelentities.entities.FireredLeafgreenEntity
import com.example.pokeapp.domain.modelentities.entities.FormEntity
import com.example.pokeapp.domain.modelentities.entities.GameIndiceEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationIEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationIiEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationIiiEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationIvEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationVEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationViEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationViiEntity
import com.example.pokeapp.domain.modelentities.entities.GenerationViiiEntity
import com.example.pokeapp.domain.modelentities.entities.GoldEntity
import com.example.pokeapp.domain.modelentities.entities.HeartgoldSoulsilverEntity
import com.example.pokeapp.domain.modelentities.entities.HeldItemEntity
import com.example.pokeapp.domain.modelentities.entities.HomeEntity
import com.example.pokeapp.domain.modelentities.entities.IconsEntity
import com.example.pokeapp.domain.modelentities.entities.IconsXEntity
import com.example.pokeapp.domain.modelentities.entities.ItemEntity
import com.example.pokeapp.domain.modelentities.entities.MoveEntity
import com.example.pokeapp.domain.modelentities.entities.MoveLearnMethodEntity
import com.example.pokeapp.domain.modelentities.entities.MoveXEntity
import com.example.pokeapp.domain.modelentities.entities.OfficialArtworkEntity
import com.example.pokeapp.domain.modelentities.entities.OmegarubyAlphasapphireEntity
import com.example.pokeapp.domain.modelentities.entities.OtherEntity
import com.example.pokeapp.domain.modelentities.entities.PastTypeEntity
import com.example.pokeapp.domain.modelentities.entities.PlatinumEntity
import com.example.pokeapp.domain.modelentities.entities.PokemonEntity
import com.example.pokeapp.domain.modelentities.entities.RedBlueEntity
import com.example.pokeapp.domain.modelentities.entities.RubySapphireEntity
import com.example.pokeapp.domain.modelentities.entities.ShowdownEntity
import com.example.pokeapp.domain.modelentities.entities.SilverEntity
import com.example.pokeapp.domain.modelentities.entities.SpeciesEntity
import com.example.pokeapp.domain.modelentities.entities.SpritesEntity
import com.example.pokeapp.domain.modelentities.entities.StatEntity
import com.example.pokeapp.domain.modelentities.entities.StatXEntity
import com.example.pokeapp.domain.modelentities.entities.TypeEntity
import com.example.pokeapp.domain.modelentities.entities.TypeXEntity
import com.example.pokeapp.domain.modelentities.entities.TypeXXEntity
import com.example.pokeapp.domain.modelentities.entities.TypeXXXEntity
import com.example.pokeapp.domain.modelentities.entities.UltraSunUltraMoonEntity
import com.example.pokeapp.domain.modelentities.entities.VersionDetailEntity
import com.example.pokeapp.domain.modelentities.entities.VersionEntity
import com.example.pokeapp.domain.modelentities.entities.VersionGroupDetailEntity
import com.example.pokeapp.domain.modelentities.entities.VersionGroupEntity
import com.example.pokeapp.domain.modelentities.entities.VersionsEntity
import com.example.pokeapp.domain.modelentities.entities.XYEntity
import com.example.pokeapp.domain.modelentities.entities.YellowEntity

fun Pokemon.toEntity() = PokemonEntity(
        abilities = abilities.map { obj -> obj.toEntity() },
        base_experience = base_experience,
        cries = cries.toEntity(),
        forms = forms.map { obj -> obj.toEntity() },
        game_indices = game_indices.map { obj -> obj.toEntity() },
        height = height,
        held_items = held_items.map { obj -> obj.toEntity() },
        id = id,
        is_default = is_default,
        location_area_encounters = location_area_encounters,
        moves = moves.map { obj -> obj.toEntity() },
        name = name,
        order = order,
        past_abilities = emptyList(),
        past_types = past_types.map { obj -> obj.toEntity() },
        species = species.toEntity(),
        sprites = sprites.toEntity(),
        stats = stats.map { obj -> obj.toEntity() },
        types = types.map { obj -> obj.toEntity() },
        weight = weight
    )

fun Type.toEntity() = TypeEntity(
        slot = slot,
        type = type.toEntity()
    )

fun TypeX.toEntity() = TypeXEntity(
        name = name,
        url = url
    )

fun Stat.toEntity() = StatEntity(
        base_stat = base_stat,
        effort = effort,
        stat = stat.toEntity()
    )

fun StatX.toEntity() = StatXEntity(
        name = name,
        url = url
    )

fun Ability.toEntity() = AbilityEntity(
        ability = ability.toEntity(),
        is_hidden = is_hidden,
        slot = slot
    )

fun AbilityX.toEntity() = AbilityXEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.Cries.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.CriesEntity(
        latest = latest,
        legacy = legacy
    )

fun com.example.pokeapp.data.model.dto.Form.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.FormEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.GameIndice.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GameIndiceEntity(
        game_index = game_index,
        version = version.toEntity()
    )

fun com.example.pokeapp.data.model.dto.Version.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.VersionEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.HeldItem.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.HeldItemEntity(
        item = item.toEntity(),
        version_details = version_details.map { obj -> obj.toEntity() }
    )

fun com.example.pokeapp.data.model.dto.Item.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.ItemEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.VersionDetail.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.VersionDetailEntity(
        rarity = rarity,
        version = version.toEntity()
    )

fun com.example.pokeapp.data.model.dto.Move.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.MoveEntity(
        move = move.toEntity(),
        version_group_details = version_group_details.map { obj -> obj.toEntity() }
    )

fun com.example.pokeapp.data.model.dto.MoveX.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.MoveXEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.VersionGroupDetail.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.VersionGroupDetailEntity(
        level_learned_at = level_learned_at,
        move_learn_method = move_learn_method.toEntity(),
        version_group = version_group.toEntity()
    )

fun com.example.pokeapp.data.model.dto.MoveLearnMethod.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.MoveLearnMethodEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.VersionGroup.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.VersionGroupEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.PastType.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.PastTypeEntity(
        generation = generation.toEntity(),
        types = types.map { obj -> obj.toEntity() }
    )

fun com.example.pokeapp.data.model.dto.Generation.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GenerationEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.TypeXX.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.TypeXXEntity(
        slot = slot,
        type = type.toEntity()
    )

fun com.example.pokeapp.data.model.dto.TypeXXX.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.TypeXXXEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.Species.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.SpeciesEntity(
        name = name,
        url = url
    )

fun com.example.pokeapp.data.model.dto.Sprites.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.SpritesEntity(
        back_default = back_default,
        back_female = back_female,
        back_shiny = back_shiny,
        back_shiny_female = back_shiny_female,
        front_default = front_default,
        front_female = front_female,
        front_shiny = front_shiny,
        front_shiny_female = front_shiny_female,
        other = other.toEntity(),
        versions = versions.toEntity()
    )

fun com.example.pokeapp.data.model.dto.Other.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.OtherEntity(
        dream_world = dream_world.toEntity(),
        home = home.toEntity(),
        officialArtwork = officialArtwork.toEntity(),
        showdown = showdown.toEntity()
    )

fun com.example.pokeapp.data.model.dto.DreamWorld.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.DreamWorldEntity(
        front_default = front_default,
        front_female = front_female
    )

fun com.example.pokeapp.data.model.dto.Home.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.HomeEntity(
        front_default = front_default,
        front_female = front_female,
        front_shiny_female = front_shiny_female,
        front_shiny = front_shiny
    )

fun com.example.pokeapp.data.model.dto.OfficialArtwork.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.OfficialArtworkEntity(
        front_default = front_default,
        front_shiny = front_shiny
    )

fun com.example.pokeapp.data.model.dto.Showdown.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.ShowdownEntity(
        back_default = back_default,
        back_female = back_female,
        back_shiny = back_shiny,
        back_shiny_female = back_shiny_female,
        front_default = front_default,
        front_female = front_female,
        front_shiny = front_shiny,
        front_shiny_female = front_shiny_female
    )

fun Versions.toEntity() =
    VersionsEntity(
        generationI = generationI.toEntity(),
        generationIi = generationIi.toEntity(),
        generationIii = generationIii.toEntity(),
        generationIv = generationIv.toEntity(),
        generationV = generationV.toEntity(),
        generationVi = generationVi.toEntity(),
        generationVii = generationVii.toEntity(),
        generationViii = generationViii.toEntity()
    )

fun GenerationI.toEntity() =
    GenerationIEntity(
        redBlue = redBlue.toEntity(),
        yellow = yellow.toEntity()
    )

fun com.example.pokeapp.data.model.dto.GenerationIi.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GenerationIiEntity(
        crystal = crystal.toEntity(),
        gold = gold.toEntity(),
        silver = silver.toEntity()
    )

fun com.example.pokeapp.data.model.dto.GenerationIii.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GenerationIiiEntity(
        emerald = emerald.toEntity(),
        fireredLeafgreen = fireredLeafgreen.toEntity(),
        rubySapphire = rubySapphire.toEntity()
    )

fun com.example.pokeapp.data.model.dto.GenerationIv.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GenerationIvEntity(
        diamondPearl = diamondPearl.toEntity(),
        heartgoldSoulSilver = heartgoldSoulsilver.toEntity(),
        platinum = platinum.toEntity()
    )

fun com.example.pokeapp.data.model.dto.GenerationV.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GenerationVEntity(
        blackWhite = blackWhite.toEntity()
    )

fun com.example.pokeapp.data.model.dto.GenerationVi.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GenerationViEntity(
        omegarubyAlphasapphire = omegarubyAlphasapphire.toEntity(),
        xY = xY.toEntity()
    )

fun com.example.pokeapp.data.model.dto.GenerationVii.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GenerationViiEntity(
        icons = icons.toEntity(),
        ultraSunUltraMoon = ultraSunUltraMoon.toEntity()
    )

fun com.example.pokeapp.data.model.dto.GenerationViii.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.GenerationViiiEntity(
        icons = icons.toEntity()
    )

fun com.example.pokeapp.data.model.dto.IconsX.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.IconsXEntity(
        front_default = front_default,
        front_female = front_female
    )

fun com.example.pokeapp.data.model.dto.Icons.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.IconsEntity(
        front_default = front_default,
        front_female = front_female
    )

fun com.example.pokeapp.data.model.dto.UltraSunUltraMoon.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.UltraSunUltraMoonEntity(
        front_female = front_female,
        front_default = front_default,
        front_shiny = front_shiny,
        front_shiny_female = front_shiny_female
    )

fun com.example.pokeapp.data.model.dto.OmegarubyAlphasapphire.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.OmegarubyAlphasapphireEntity(
        front_female = front_female,
        front_shiny_female = front_shiny_female,
        front_default = front_default,
        front_shiny = front_shiny
    )

fun com.example.pokeapp.data.model.dto.XY.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.XYEntity(
        front_female = front_female,
        front_shiny_female = front_shiny_female,
        front_default = front_default,
        front_shiny = front_shiny
    )

fun com.example.pokeapp.data.model.dto.BlackWhite.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.BlackWhiteEntity(
        animated = animated.toEntity(),
        back_default = back_default,
        back_shiny = back_shiny,
        back_female = back_female,
        back_shiny_female = back_shiny_female,
        front_shiny = front_shiny,
        front_default = front_default,
        front_shiny_female = front_shiny_female,
        front_female = front_female
    )

fun com.example.pokeapp.data.model.dto.Animated.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.AnimatedEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        back_female = back_female,
        back_shiny_female = back_shiny_female,
        front_shiny = front_shiny,
        front_default = front_default,
        front_shiny_female = front_shiny_female,
        front_female = front_female
    )

fun com.example.pokeapp.data.model.dto.DiamondPearl.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.DiamondPearlEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        back_female = back_female,
        back_shiny_female = back_shiny_female,
        front_shiny = front_shiny,
        front_default = front_default,
        front_shiny_female = front_shiny_female,
        front_female = front_female
    )

fun com.example.pokeapp.data.model.dto.HeartgoldSoulsilver.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.HeartgoldSoulsilverEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        back_female = back_female,
        back_shiny_female = back_shiny_female,
        front_shiny = front_shiny,
        front_default = front_default,
        front_shiny_female = front_shiny_female,
        front_female = front_female
    )

fun com.example.pokeapp.data.model.dto.Platinum.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.PlatinumEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        back_female = back_female,
        back_shiny_female = back_shiny_female,
        front_shiny = front_shiny,
        front_default = front_default,
        front_shiny_female = front_shiny_female,
        front_female = front_female
    )

fun com.example.pokeapp.data.model.dto.Emerald.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.EmeraldEntity(
        front_default = front_default,
        front_shiny = front_shiny
    )

fun com.example.pokeapp.data.model.dto.FireredLeafgreen.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.FireredLeafgreenEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        front_default = front_default,
        front_shiny = front_shiny
    )

fun com.example.pokeapp.data.model.dto.RubySapphire.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.RubySapphireEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        front_default = front_default,
        front_shiny = front_shiny
    )

fun com.example.pokeapp.data.model.dto.Crystal.toEntity() =
    com.example.pokeapp.domain.modelentities.entities.CrystalEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        back_shiny_transparent = back_shiny_transparent,
        back_transparent = back_transparent,
        front_default = front_default,
        front_shiny = front_shiny,
        front_shiny_transparent = front_shiny_transparent,
        front_transparent = front_transparent
    )

fun Gold.toEntity() = GoldEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        front_default = front_default,
        front_shiny = front_shiny,
        front_transparent = front_transparent
    )

fun Silver.toEntity() = SilverEntity(
        back_default = back_default,
        back_shiny = back_shiny,
        front_default = front_default,
        front_shiny = front_shiny,
        front_transparent = front_transparent
    )

fun RedBlue.toEntity() = RedBlueEntity(
        back_default = back_default,
        back_gray = back_gray,
        back_transparent = back_transparent,
        front_default = front_default,
        front_gray = front_gray,
        front_transparent = front_transparent
    )

fun Yellow.toEntity() = YellowEntity(
        back_default = back_default,
        back_gray = back_gray,
        back_transparent = back_transparent,
        front_default = front_default,
        front_gray = front_gray,
        front_transparent = front_transparent
    )