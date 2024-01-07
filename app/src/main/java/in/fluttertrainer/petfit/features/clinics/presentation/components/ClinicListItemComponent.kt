package `in`.fluttertrainer.petfit.features.clinics.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import `in`.fluttertrainer.petfit.features.clinics.data.models.ClinicModel
import `in`.fluttertrainer.petfit.ui.common.components.AppRatingBar

@Composable
fun ClinicListItemComponent(clinicModel: ClinicModel) {
    Card(modifier = Modifier.padding(bottom = 16.dp)) {
        Column {
            AsyncImage(
                model = clinicModel.image,
                contentDescription = clinicModel.name,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(height = 200.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Column(modifier = Modifier.padding(8.dp)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = clinicModel.name, style = MaterialTheme.typography.titleMedium.copy(
                            fontSize = 18.sp
                        )
                    )
                    AppRatingBar(clinicModel.rating)

                }
                Row {
                    Text(
                        text = clinicModel.address,
                        style = MaterialTheme.typography.bodySmall.copy(
                            fontWeight = FontWeight.Light
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Preview()
@Composable
fun ClinicListItemComponentPreview() {
    ClinicListItemComponent(
        ClinicModel(
            image = "https://content.jdmagicbox.com/comp/kottayam/e7/9999px481.x481.210309163527.k8e7/catalogue/pawzon-pet-hospital-pala-town-kottayam-veterinary-hospitals-igaauapl8q.jpg",
            address = "Kizhathadiyoor Rd, Moonnani, Pala",
            name = "Pawzon",
            rating = 4.0f
        )
    )
}