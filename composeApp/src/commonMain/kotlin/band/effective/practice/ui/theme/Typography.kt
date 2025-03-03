package band.effective.practice.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.roboto_bold
import kmp.composeapp.generated.resources.roboto_light
import kmp.composeapp.generated.resources.roboto_normal
import org.jetbrains.compose.resources.Font

// Функция для загрузки шрифта
@Composable
fun getDefaultFont(): FontFamily {
    return FontFamily(
        Font(Res.font.roboto_light, weight = FontWeight.Normal),
        Font(Res.font.roboto_normal, weight = FontWeight.Medium),
        Font(Res.font.roboto_bold, weight = FontWeight.Bold)
    )
}

// Определяем типографику
data class EffectiveThemeTypography(
    val h4: TextStyle,
    val h5: TextStyle,
    val h6: TextStyle,
    val subtitle1: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val caption: TextStyle,
    val button: TextStyle
)

@Composable
fun getEffectiveTypography(): EffectiveThemeTypography {
    val fontFamily = getDefaultFont()

    return EffectiveThemeTypography(
        h4 = TextStyle(
            fontSize = 40.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = fontFamily,
            letterSpacing = 0.1.sp,
            lineHeight = 40.sp
        ),
        h5 = TextStyle(
            fontSize = 28.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = fontFamily,
            letterSpacing = 0.1.sp,
            lineHeight = 36.4.sp
        ),
        h6 = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = fontFamily,
            letterSpacing = 0.1.sp,
            lineHeight = 26.sp
        ),
        subtitle1 = TextStyle(
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = fontFamily,
            letterSpacing = 0.1.sp,
            lineHeight = 19.5.sp
        ),
        body1 = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = fontFamily,
            letterSpacing = 0.1.sp,
            lineHeight = 20.8.sp
        ),
        body2 = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = fontFamily,
            letterSpacing = 0.1.sp,
            lineHeight = 18.2.sp
        ),
        caption = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = fontFamily,
            letterSpacing = 0.1.sp,
            lineHeight = 15.6.sp
        ),
        button = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = fontFamily,
            letterSpacing = 0.1.sp,
            lineHeight = 20.8.sp
        )
    )
}