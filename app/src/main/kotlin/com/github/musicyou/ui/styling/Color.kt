package com.github.musicyou.ui.styling

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

object SarangifyColors {
    val green = Color(0xFF1DB954)
    val brightGreen = Color(0xFF1ED760)
    val background = Color(0xFF050505)
    val surface = Color(0xFF121212)
    val elevatedSurface = Color(0xFF181818)
    val secondarySurface = Color(0xFF242424)
    val primaryText = Color(0xFFFFFFFF)
    val secondaryText = Color(0xFFB3B3B3)
    val divider = Color(0xFF303030)
    val error = Color(0xFFF15E6C)
}

val ColorScheme.shimmer: Color
    get() = SarangifyColors.secondaryText

val ColorScheme.overlay: Color
    get() = Color.Black.copy(alpha = Dimensions.mediumOpacity)

val ColorScheme.onOverlay: Color
    get() = SarangifyColors.primaryText