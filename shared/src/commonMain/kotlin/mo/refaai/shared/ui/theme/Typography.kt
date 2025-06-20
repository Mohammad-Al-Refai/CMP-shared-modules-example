package mo.refaai.shared.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import multipleappsinone.shared.generated.resources.GeliatExtrabold
import multipleappsinone.shared.generated.resources.GeliatExtralight
import multipleappsinone.shared.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun SharedFontFamily() = FontFamily(
    Font(Res.font.GeliatExtralight, weight = FontWeight.Light),
    Font(Res.font.GeliatExtralight, weight = FontWeight.Normal),
    Font(Res.font.GeliatExtrabold, weight = FontWeight.Medium),
    Font(Res.font.GeliatExtrabold, weight = FontWeight.SemiBold),
    Font(Res.font.GeliatExtrabold, weight = FontWeight.Bold)
)

@Composable
fun SharedTypography() = Typography().run {
    val fontFamily = SharedFontFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = fontFamily),
        displayMedium = displayMedium.copy(fontFamily = fontFamily),
        displaySmall = displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = titleLarge.copy(fontFamily = fontFamily),
        titleMedium = titleMedium.copy(fontFamily = fontFamily),
        titleSmall = titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = bodyLarge.copy(fontFamily = fontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = bodySmall.copy(fontFamily = fontFamily),
        labelLarge = labelLarge.copy(fontFamily = fontFamily),
        labelMedium = labelMedium.copy(fontFamily = fontFamily),
        labelSmall = labelSmall.copy(fontFamily = fontFamily)
    )
}