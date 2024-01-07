package `in`.fluttertrainer.petfit.ui.common.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarHalf
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.ceil
import kotlin.math.floor


@Composable
fun AppRatingBar(rating: Float) {
    val totalStars = 5
    val filledStars = floor(rating).toInt()
    val hasHalfStar = rating.rem(1)>0.0
    val unfilledStars = (totalStars - ceil(rating)).toInt()

    Row {
        repeat(filledStars) {
            Icon(Icons.Filled.Star, contentDescription = null, tint = Color.Yellow)
        }
        if (hasHalfStar) {
            Icon(
                imageVector = Icons.Outlined.StarHalf,
                contentDescription = null,
                tint = Color.Yellow
            )
        }
        repeat(unfilledStars) {
            Icon(Icons.Outlined.StarOutline, contentDescription = null, tint = Color.Yellow)
        }
    }
}

@Preview
@Composable
fun AppRatingBarPreview() {
    AppRatingBar(rating = 4.0f)
}

@Preview
@Composable
fun AppRatingBarFloatPreview() {
    AppRatingBar(rating = 3.5f)
}

@Preview
@Composable
fun AppRatingBarFloat2Preview() {
    AppRatingBar(rating = 4.5f)
}

@Preview
@Composable
fun AppRatingBarFullPreview() {
    AppRatingBar(rating = 5f)
}
@Preview
@Composable
fun AppRatingBarNonePreview() {
    AppRatingBar(rating = 0f)
}

