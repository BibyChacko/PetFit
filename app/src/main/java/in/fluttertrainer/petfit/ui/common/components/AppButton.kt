package `in`.fluttertrainer.petfit.ui.common.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AppButton(buttonText: String, onClick: () -> Unit, enabled: Boolean = true) {
    Button(
        onClick = onClick,
        enabled = enabled,
        shape = RoundedCornerShape(6.dp),
//        elevation = ButtonDefaults.buttonElevation(
//            defaultElevation = 4.dp,
//            pressedElevation = 8.dp,
//            focusedElevation = 6.dp,
//            hoveredElevation = 4.dp,
//            disabledElevation = 2.dp
//        ),
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Text(buttonText, style = MaterialTheme.typography.labelMedium)
    }
}


@Preview
@Composable
fun AppButtonPreview() {
    AppButton(buttonText = "Click Me", onClick = { /*TODO*/ })
}
