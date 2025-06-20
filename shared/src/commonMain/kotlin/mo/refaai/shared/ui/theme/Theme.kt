package mo.refaai.shared.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun SharedTheme(content: @Composable () -> Unit) = MaterialTheme(
    typography = SharedTypography(),
    colorScheme = LightColors,
    content = content
)

