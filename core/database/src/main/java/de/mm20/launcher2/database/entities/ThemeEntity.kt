package de.mm20.launcher2.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "Theme")
data class ThemeEntity(
    @PrimaryKey val id: UUID,
    val corePaletteA1: Int?,
    val corePaletteA2: Int?,
    val corePaletteA3: Int?,
    val corePaletteN1: Int?,
    val corePaletteN2: Int?,
    val corePaletteE: Int?,

    val lightPrimary: String?,
    val lightOnPrimary: String?,
    val lightPrimaryContainer: String?,
    val lightOnPrimaryContainer: String?,
    val lightSecondary: String?,
    val lightOnSecondary: String?,
    val lightSecondaryContainer: String?,
    val lightOnSecondaryContainer: String?,
    val lightTertiary: String?,
    val lightOnTertiary: String?,
    val lightTertiaryContainer: String?,
    val lightOnTertiaryContainer: String?,
    val lightError: String?,
    val lightOnError: String?,
    val lightErrorContainer: String?,
    val lightOnErrorContainer: String?,
    val lightSurface: String?,
    val lightOnSurface: String?,
    val lightOnSurfaceVariant: String?,
    val lightOutline: String?,
    val lightOutlineVariant: String?,
    val lightInverseSurface: String?,
    val lightInverseOnSurface: String?,
    val lightInversePrimary: String?,
    val lightSurfaceDim: String?,
    val lightSurfaceBright: String?,
    val lightSurfaceContainerLowest: String?,
    val lightSurfaceContainerLow: String?,
    val lightSurfaceContainer: String?,
    val lightSurfaceContainerHigh: String?,
    val lightSurfaceContainerHighest: String?,
    val lightBackground: String?,
    val lightOnBackground: String?,
    val lightSurfaceTint: String?,
    val lightScrim: String?,
    val lightSurfaceVariant: String?,

    val darkPrimary: String?,
    val darkOnPrimary: String?,
    val darkPrimaryContainer: String?,
    val darkOnPrimaryContainer: String?,
    val darkSecondary: String?,
    val darkOnSecondary: String?,
    val darkSecondaryContainer: String?,
    val darkOnSecondaryContainer: String?,
    val darkTertiary: String?,
    val darkOnTertiary: String?,
    val darkTertiaryContainer: String?,
    val darkOnTertiaryContainer: String?,
    val darkError: String?,
    val darkOnError: String?,
    val darkErrorContainer: String?,
    val darkOnErrorContainer: String?,
    val darkSurface: String?,
    val darkOnSurface: String?,
    val darkOnSurfaceVariant: String?,
    val darkOutline: String?,
    val darkOutlineVariant: String?,
    val darkInverseSurface: String?,
    val darkInverseOnSurface: String?,
    val darkInversePrimary: String?,
    val darkSurfaceDim: String?,
    val darkSurfaceBright: String?,
    val darkSurfaceContainerLowest: String?,
    val darkSurfaceContainerLow: String?,
    val darkSurfaceContainer: String?,
    val darkSurfaceContainerHigh: String?,
    val darkSurfaceContainerHighest: String?,
    val darkBackground: String?,
    val darkOnBackground: String?,
    val darkSurfaceTint: String?,
    val darkScrim: String?,
    val darkSurfaceVariant: String?,
)