package com.example.pokeapp.data.mapper

import com.example.pokeapp.data.dto.Ability
import com.example.pokeapp.data.dto.AbilityX
import com.example.pokeapp.data.dto.Animated
import com.example.pokeapp.data.dto.BlackWhite
import com.example.pokeapp.data.dto.Cries
import com.example.pokeapp.data.dto.Crystal
import com.example.pokeapp.data.dto.DiamondPearl
import com.example.pokeapp.data.dto.DreamWorld
import com.example.pokeapp.data.dto.Emerald
import com.example.pokeapp.data.dto.FireredLeafgreen
import com.example.pokeapp.data.dto.Form
import com.example.pokeapp.data.dto.GameIndice
import com.example.pokeapp.data.dto.Generation
import com.example.pokeapp.data.dto.GenerationI
import com.example.pokeapp.data.dto.GenerationIi
import com.example.pokeapp.data.dto.GenerationIii
import com.example.pokeapp.data.dto.GenerationIv
import com.example.pokeapp.data.dto.GenerationV
import com.example.pokeapp.data.dto.GenerationVi
import com.example.pokeapp.data.dto.GenerationVii
import com.example.pokeapp.data.dto.GenerationViii
import com.example.pokeapp.data.dto.Gold
import com.example.pokeapp.data.dto.HeartgoldSoulsilver
import com.example.pokeapp.data.dto.HeldItem
import com.example.pokeapp.data.dto.Home
import com.example.pokeapp.data.dto.Icons
import com.example.pokeapp.data.dto.IconsX
import com.example.pokeapp.data.dto.Item
import com.example.pokeapp.data.dto.Move
import com.example.pokeapp.data.dto.MoveLearnMethod
import com.example.pokeapp.data.dto.MoveX
import com.example.pokeapp.data.dto.OfficialArtwork
import com.example.pokeapp.data.dto.OmegarubyAlphasapphire
import com.example.pokeapp.data.dto.Other
import com.example.pokeapp.data.dto.PastType
import com.example.pokeapp.data.dto.Platinum
import com.example.pokeapp.data.dto.Pokemon
import com.example.pokeapp.data.dto.RedBlue
import com.example.pokeapp.data.dto.RubySapphire
import com.example.pokeapp.data.dto.Showdown
import com.example.pokeapp.data.dto.Silver
import com.example.pokeapp.data.dto.Species
import com.example.pokeapp.data.dto.Sprites
import com.example.pokeapp.data.dto.Stat
import com.example.pokeapp.data.dto.StatX
import com.example.pokeapp.data.dto.Type
import com.example.pokeapp.data.dto.TypeX
import com.example.pokeapp.data.dto.TypeXX
import com.example.pokeapp.data.dto.TypeXXX
import com.example.pokeapp.data.dto.UltraSunUltraMoon
import com.example.pokeapp.data.dto.Version
import com.example.pokeapp.data.dto.VersionDetail
import com.example.pokeapp.data.dto.VersionGroup
import com.example.pokeapp.data.dto.VersionGroupDetail
import com.example.pokeapp.data.dto.Versions
import com.example.pokeapp.data.dto.XY
import com.example.pokeapp.data.dto.Yellow
import com.example.pokeapp.domain.entities.AbilityEntity
import com.example.pokeapp.domain.entities.AbilityXEntity
import com.example.pokeapp.domain.entities.AnimatedEntity
import com.example.pokeapp.domain.entities.BlackWhiteEntity
import com.example.pokeapp.domain.entities.CriesEntity
import com.example.pokeapp.domain.entities.CrystalEntity
import com.example.pokeapp.domain.entities.DiamondPearlEntity
import com.example.pokeapp.domain.entities.DreamWorldEntity
import com.example.pokeapp.domain.entities.EmeraldEntity
import com.example.pokeapp.domain.entities.FireredLeafgreenEntity
import com.example.pokeapp.domain.entities.FormEntity
import com.example.pokeapp.domain.entities.GameIndiceEntity
import com.example.pokeapp.domain.entities.GenerationEntity
import com.example.pokeapp.domain.entities.GenerationIEntity
import com.example.pokeapp.domain.entities.GenerationIiEntity
import com.example.pokeapp.domain.entities.GenerationIiiEntity
import com.example.pokeapp.domain.entities.GenerationIvEntity
import com.example.pokeapp.domain.entities.GenerationVEntity
import com.example.pokeapp.domain.entities.GenerationViEntity
import com.example.pokeapp.domain.entities.GenerationViiEntity
import com.example.pokeapp.domain.entities.GenerationViiiEntity
import com.example.pokeapp.domain.entities.GoldEntity
import com.example.pokeapp.domain.entities.HeartgoldSoulsilverEntity
import com.example.pokeapp.domain.entities.HeldItemEntity
import com.example.pokeapp.domain.entities.HomeEntity
import com.example.pokeapp.domain.entities.IconsEntity
import com.example.pokeapp.domain.entities.IconsXEntity
import com.example.pokeapp.domain.entities.ItemEntity
import com.example.pokeapp.domain.entities.MoveEntity
import com.example.pokeapp.domain.entities.MoveLearnMethodEntity
import com.example.pokeapp.domain.entities.MoveXEntity
import com.example.pokeapp.domain.entities.OfficialArtworkEntity
import com.example.pokeapp.domain.entities.OmegarubyAlphasapphireEntity
import com.example.pokeapp.domain.entities.OtherEntity
import com.example.pokeapp.domain.entities.PastTypeEntity
import com.example.pokeapp.domain.entities.PlatinumEntity
import com.example.pokeapp.domain.entities.PokemonEntity
import com.example.pokeapp.domain.entities.RedBlueEntity
import com.example.pokeapp.domain.entities.RubySapphireEntity
import com.example.pokeapp.domain.entities.ShowdownEntity
import com.example.pokeapp.domain.entities.SilverEntity
import com.example.pokeapp.domain.entities.SpeciesEntity
import com.example.pokeapp.domain.entities.SpritesEntity
import com.example.pokeapp.domain.entities.StatEntity
import com.example.pokeapp.domain.entities.StatXEntity
import com.example.pokeapp.domain.entities.TypeEntity
import com.example.pokeapp.domain.entities.TypeXEntity
import com.example.pokeapp.domain.entities.TypeXXEntity
import com.example.pokeapp.domain.entities.TypeXXXEntity
import com.example.pokeapp.domain.entities.UltraSunUltraMoonEntity
import com.example.pokeapp.domain.entities.VersionDetailEntity
import com.example.pokeapp.domain.entities.VersionEntity
import com.example.pokeapp.domain.entities.VersionGroupDetailEntity
import com.example.pokeapp.domain.entities.VersionGroupEntity
import com.example.pokeapp.domain.entities.VersionsEntity
import com.example.pokeapp.domain.entities.XYEntity
import com.example.pokeapp.domain.entities.YellowEntity

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
    url =  url
)

fun Cries.toEntity() = CriesEntity(
    latest = latest,
    legacy = legacy
)

fun Form.toEntity() = FormEntity(
    name = name,
    url = url
)

fun GameIndice.toEntity() = GameIndiceEntity(
    game_index = game_index,
    version = version.toEntity()
)

fun Version.toEntity() = VersionEntity(
    name = name,
    url = url
)

fun HeldItem.toEntity() = HeldItemEntity(
    item = item.toEntity(),
    version_details = version_details.map { obj -> obj.toEntity() }
)

fun Item.toEntity() = ItemEntity(
    name = name,
    url = url
)

fun VersionDetail.toEntity() = VersionDetailEntity(
    rarity = rarity,
    version = version.toEntity()
)

fun Move.toEntity() = MoveEntity(
    move = move.toEntity(),
    version_group_details = version_group_details.map { obj -> obj.toEntity() }
)

fun MoveX.toEntity() = MoveXEntity(
    name = name,
    url = url
)

fun VersionGroupDetail.toEntity() = VersionGroupDetailEntity(
    level_learned_at = level_learned_at,
    move_learn_method = move_learn_method.toEntity(),
    version_group = version_group.toEntity()
)

fun MoveLearnMethod.toEntity() = MoveLearnMethodEntity(
    name = name,
    url = url
)

fun VersionGroup.toEntity() = VersionGroupEntity(
    name = name,
    url = url
)

fun PastType.toEntity() = PastTypeEntity(
    generation = generation.toEntity(),
    types = types.map { obj -> obj.toEntity() }
)

fun Generation.toEntity() = GenerationEntity(
    name = name,
    url = url
)

fun TypeXX.toEntity() = TypeXXEntity(
    slot = slot,
    type = type.toEntity()
)

fun TypeXXX.toEntity() = TypeXXXEntity(
    name = name,
    url = url
)

fun Species.toEntity() = SpeciesEntity(
    name = name,
    url = url
)

fun Sprites.toEntity() = SpritesEntity(
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

fun Other.toEntity() = OtherEntity(
    dream_world = dream_world.toEntity(),
    home = home.toEntity(),
    officialArtwork = officialArtwork.toEntity(),
    showdown = showdown.toEntity()
)

fun DreamWorld.toEntity() = DreamWorldEntity(
    front_default = front_default,
    front_female = front_female
)

fun Home.toEntity() = HomeEntity(
    front_default = front_default,
    front_female = front_female,
    front_shiny_female = front_shiny_female,
    front_shiny = front_shiny
)

fun OfficialArtwork.toEntity() = OfficialArtworkEntity(
    front_default = front_default,
    front_shiny = front_shiny
)

fun Showdown.toEntity() = ShowdownEntity(
    back_default = back_default,
    back_female = back_female,
    back_shiny = back_shiny,
    back_shiny_female = back_shiny_female,
    front_default = front_default,
    front_female = front_female,
    front_shiny = front_shiny,
    front_shiny_female = front_shiny_female
)

fun Versions.toEntity() = VersionsEntity(
    generationI = generationI.toEntity(),
    generationIi = generationIi.toEntity(),
    generationIii = generationIii.toEntity(),
    generationIv = generationIv.toEntity(),
    generationV = generationV.toEntity(),
    generationVi = generationVi.toEntity(),
    generationVii = generationVii.toEntity(),
    generationViii = generationViii.toEntity()
)

fun GenerationI.toEntity() = GenerationIEntity(
    redBlue = redBlue.toEntity(),
    yellow = yellow.toEntity()
)

fun GenerationIi.toEntity() = GenerationIiEntity(
    crystal = crystal.toEntity(),
    gold = gold.toEntity(),
    silver = silver.toEntity()
)

fun GenerationIii.toEntity() = GenerationIiiEntity(
    emerald = emerald.toEntity(),
    fireredLeafgreen = fireredLeafgreen.toEntity(),
    rubySapphire = rubySapphire.toEntity()
)

fun GenerationIv.toEntity() = GenerationIvEntity(
    diamondPearl = diamondPearl.toEntity(),
    heartgoldSoulSilver = heartgoldSoulsilver.toEntity(),
    platinum = platinum.toEntity()
)

fun GenerationV.toEntity() = GenerationVEntity(
    blackWhite = blackWhite.toEntity()
)

fun GenerationVi.toEntity() = GenerationViEntity(
    omegarubyAlphasapphire = omegarubyAlphasapphire.toEntity(),
    xY = xY.toEntity()
)

fun GenerationVii.toEntity() = GenerationViiEntity(
    icons = icons.toEntity(),
    ultraSunUltraMoon = ultraSunUltraMoon.toEntity()
)

fun GenerationViii.toEntity() = GenerationViiiEntity(
   icons = icons.toEntity()
)

fun IconsX.toEntity() = IconsXEntity(
    front_default = front_default,
    front_female = front_female
)

fun Icons.toEntity() = IconsEntity(
    front_default = front_default,
    front_female = front_female
)

fun UltraSunUltraMoon.toEntity() = UltraSunUltraMoonEntity(
    front_female = front_female,
    front_default = front_default,
    front_shiny = front_shiny,
    front_shiny_female = front_shiny_female
)

fun OmegarubyAlphasapphire.toEntity() = OmegarubyAlphasapphireEntity(
    front_female = front_female,
    front_shiny_female = front_shiny_female,
    front_default = front_default,
    front_shiny = front_shiny
)

fun XY.toEntity() = XYEntity(
    front_female = front_female,
    front_shiny_female = front_shiny_female,
    front_default = front_default,
    front_shiny = front_shiny
)

fun BlackWhite.toEntity() = BlackWhiteEntity(
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

fun Animated.toEntity() = AnimatedEntity(
    back_default = back_default,
    back_shiny = back_shiny,
    back_female = back_female,
    back_shiny_female = back_shiny_female,
    front_shiny = front_shiny,
    front_default = front_default,
    front_shiny_female = front_shiny_female,
    front_female = front_female
)

fun DiamondPearl.toEntity() = DiamondPearlEntity(
    back_default = back_default,
    back_shiny = back_shiny,
    back_female = back_female,
    back_shiny_female = back_shiny_female,
    front_shiny = front_shiny,
    front_default = front_default,
    front_shiny_female = front_shiny_female,
    front_female = front_female
)

fun HeartgoldSoulsilver.toEntity() = HeartgoldSoulsilverEntity(
    back_default = back_default,
    back_shiny = back_shiny,
    back_female = back_female,
    back_shiny_female = back_shiny_female,
    front_shiny = front_shiny,
    front_default = front_default,
    front_shiny_female = front_shiny_female,
    front_female = front_female
)

fun Platinum.toEntity() = PlatinumEntity(
    back_default = back_default,
    back_shiny = back_shiny,
    back_female = back_female,
    back_shiny_female = back_shiny_female,
    front_shiny = front_shiny,
    front_default = front_default,
    front_shiny_female = front_shiny_female,
    front_female = front_female
)

fun Emerald.toEntity() = EmeraldEntity(
    front_default = front_default,
    front_shiny = front_shiny
)

fun FireredLeafgreen.toEntity() = FireredLeafgreenEntity(
    back_default = back_default,
    back_shiny = back_shiny,
    front_default = front_default,
    front_shiny = front_shiny
)

fun RubySapphire.toEntity() = RubySapphireEntity(
    back_default = back_default,
    back_shiny = back_shiny,
    front_default = front_default,
    front_shiny = front_shiny
)

fun Crystal.toEntity() = CrystalEntity(
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