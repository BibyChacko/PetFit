package `in`.fluttertrainer.petfit.features.home.presentation.components.my_pets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun MyPetListItem(imageAddress: String, name: String) {
    Card {
        Column(
        ) {
            AsyncImage(
               model = imageAddress,
               contentDescription = name,
                contentScale = ContentScale.FillBounds,
               modifier = Modifier.size(width = 140.dp, height = 140.dp)
           )
            Spacer(modifier = Modifier.height(height = 6.dp))
            Text("2 Years old", style = MaterialTheme
                .typography.labelSmall.copy(fontSize = 9.sp, fontWeight = FontWeight.Light),
                modifier = Modifier.padding(start = 8.dp)
                )
            Spacer(modifier = Modifier.height(height = 6.dp))
            Text(
                name,
                style = MaterialTheme.typography.labelMedium
                    .copy(fontSize = 14.sp, fontWeight = FontWeight.Medium),
                modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            Spacer(modifier = Modifier.height(height = 12.dp))
        }
    }
}

@Preview
@Composable
fun MyPetListItemPreview() {
    MyPetListItem(
        imageAddress = "http://images.news18.com/ibnlive/uploads/2022/01/untitled-design-2022-01-24t124157.003.jpg",
        name = "Jimmy"
    )
}