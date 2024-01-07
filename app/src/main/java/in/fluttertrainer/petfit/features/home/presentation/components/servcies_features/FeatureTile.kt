package `in`.fluttertrainer.petfit.features.home.presentation.components.servcies_features

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Healing
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FeatureTile(icon: ImageVector, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Card(

            colors = CardDefaults.cardColors(
                contentColor = MaterialTheme.colorScheme.primary
            )
        ) {
            Icon(
                icon,
                contentDescription = title,
                modifier = Modifier.padding(16.dp).size(32.dp))
        }
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            title, style = MaterialTheme.typography.labelSmall.copy(
                color = MaterialTheme.colorScheme.primary
            )
        )
    }
}

@Preview
@Composable
fun FeatureTilePreview() {
    FeatureTile(icon = Icons.Outlined.Healing, title = "Surgery")
}