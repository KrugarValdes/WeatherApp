package band.effective.practice.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val typography = getEffectiveTypography()

    MaterialTheme(
        typography = Typography(
            defaultFontFamily = getDefaultFont(),
            h4 = typography.h4,
            h5 = typography.h5,
            h6 = typography.h6,
            subtitle1 = typography.subtitle1,
            body1 = typography.body1,
            body2 = typography.body2,
            caption = typography.caption,
            button = typography.button
        ),
        content = {
            Surface(content = content)
        }
    )
}