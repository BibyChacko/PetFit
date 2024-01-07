package `in`.fluttertrainer.petfit.features.home.presentation.components.servcies_features

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun UserGreetings(){
    Card(
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(12.dp)) {

            Text(
                text = "Welcome back,",
                style = MaterialTheme.typography.bodySmall.copy(
                    fontWeight = FontWeight.W300,
                    fontSize = 12.sp
                )
            )
            Text(
                text = "Marry Williams",
                style = MaterialTheme.typography.titleMedium
            )
        }

    }
}

@Preview
@Composable
fun UserGreetingPreviews(){
    UserGreetings()
}
