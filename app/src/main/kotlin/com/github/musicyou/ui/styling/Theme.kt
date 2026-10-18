package com.github.musicyou.ui.styling

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val darkScheme = darkColorScheme(
    primary = SarangifyColors.green,
    onPrimary = SarangifyColors.background,
    primaryContainer = SarangifyColors.brightGreen,
    onPrimaryContainer = SarangifyColors.background,
    secondary = SarangifyColors.secondaryText,
    onSecondary = SarangifyColors.background,
    secondaryContainer = SarangifyColors.secondarySurface,
    onSecondaryContainer = SarangifyColors.primaryText,
    tertiary = SarangifyColors.brightGreen,
    onTertiary = SarangifyColors.background,
    tertiaryContainer = SarangifyColors.elevatedSurface,
    onTertiaryContainer = SarangifyColors.primaryText,
    error = SarangifyColors.error,
    onError = SarangifyColors.background,
    errorContainer = SarangifyColors.error.copy(alpha = 0.2f),
    onErrorContainer = SarangifyColors.primaryText,
    background = SarangifyColors.background,
    onBackground = SarangifyColors.primaryText,
    surface = SarangifyColors.surface,
    onSurface = SarangifyColors.primaryText,
    surfaceVariant = SarangifyColors.secondarySurface,
    onSurfaceVariant = SarangifyColors.secondaryText,
    outline = SarangifyColors.secondaryText,
    outlineVariant = SarangifyColors.divider,
    scrim = SarangifyColors.background,
    inverseSurface = SarangifyColors.primaryText,
    inverseOnSurface = SarangifyColors.background,
    inversePrimary = SarangifyColors.green,
    surfaceDim = SarangifyColors.background,
    surfaceBright = SarangifyColors.secondarySurface,
    surfaceContainerLowest = SarangifyColors.background,
    surfaceContainerLow = SarangifyColors.surface,
    surfaceContainer = SarangifyColors.elevatedSurface,
    surfaceContainerHigh = SarangifyColors.secondarySurface,
    surfaceContainerHighest = SarangifyColors.divider,
)

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkScheme,
        typography = Typography,
        content = content
    )
}