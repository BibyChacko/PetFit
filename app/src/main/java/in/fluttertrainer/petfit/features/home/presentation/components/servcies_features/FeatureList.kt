package `in`.fluttertrainer.petfit.features.home.presentation.components.servcies_features

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalGroceryStore
import androidx.compose.material.icons.filled.Pets
import androidx.compose.material.icons.outlined.Brush
import androidx.compose.material.icons.outlined.Fastfood
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun  FeatureList(){
    Column {
        Text(
            text = "Lets take care of your pets",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.size(12.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            // TODO: Make it grid and use enums and extensions
            FeatureTile(icon = Icons.Outlined.Fastfood, title = "Nutrition")
            FeatureTile(icon = Icons.Filled.Pets, title = "Veterinary")
            FeatureTile(icon = Icons.Outlined.Brush, title = "Grooming")
            FeatureTile(icon = Icons.Filled.LocalGroceryStore, title = "Accessories")
        }
    }
}

@Preview
@Composable
fun  FeatureListPreview(){
    FeatureList()
}