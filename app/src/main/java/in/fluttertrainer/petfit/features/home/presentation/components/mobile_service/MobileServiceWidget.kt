package `in`.fluttertrainer.petfit.features.home.presentation.components.mobile_service


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Emergency
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import `in`.fluttertrainer.petfit.R
import `in`.fluttertrainer.petfit.ui.common.theme.PurpleGrey80


@Composable
fun MobileServiceWidget() {
    Surface(
        color = PurpleGrey80.copy(alpha = 0.5f),
        modifier = Modifier.height(80.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp),
        ) {
            Card {
                Icon(
                    Icons.Outlined.Emergency,
                    contentDescription = stringResource(R.string.emergency)
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(2.2f)) {
                Text(
                    stringResource(R.string.on_your_doorsteps),
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    ),
                )
                Text(
                    stringResource(R.string.mobile_service_main_text),
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Light,
                        fontSize = 9.sp,
                        color = Color.Gray
                    ),

                )
            }
            Spacer(modifier = Modifier.width(24.dp))
            Surface(
                color = Color.Red,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .weight(1.1f)
                    .height(40.dp)
                    .align(alignment = Alignment.CenterVertically)
            ) {
                Text(
                    text = stringResource(
                        R.string.book_now
                    ),
                    modifier = Modifier
                        .weight(1.0f)
                        .padding(8.dp)
                        .align(alignment = Alignment.CenterVertically),
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        color = Color.White
                    )
                )
            }
        }
    }
}

@Preview(showSystemUi = false, showBackground = true)
@Composable
fun MobileServiceWidgetPreview() {
    MobileServiceWidget()
}
