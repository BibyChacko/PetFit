package `in`.fluttertrainer.petfit.features.clinics.presentation.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import `in`.fluttertrainer.petfit.features.clinics.data.models.ClinicModel


@Composable
fun ClinicListComponent() {
    val clinicList = listOf(
        ClinicModel(
            image = "https://content.jdmagicbox.com/comp/kottayam/e7/9999px481.x481.210309163527.k8e7/catalogue/pawzon-pet-hospital-pala-town-kottayam-veterinary-hospitals-igaauapl8q.jpg",
            address = "Kizhathadiyoor Rd, Moonnani, Pala",
            name = "Pawzon",
            rating = 4.0f
        ),
        ClinicModel(
            image = "https://content.jdmagicbox.com/comp/kottayam/e7/9999px481.x481.210309163527.k8e7/catalogue/pawzon-pet-hospital-pala-town-kottayam-veterinary-hospitals-igaauapl8q.jpg",
            address = "Kizhathadiyoor Rd, Moonnani, Pala",
            name = "Pet world",
            rating = 3.5f
        ),
        ClinicModel(
            image = "https://content.jdmagicbox.com/comp/kottayam/e7/9999px481.x481.210309163527.k8e7/catalogue/pawzon-pet-hospital-pala-town-kottayam-veterinary-hospitals-igaauapl8q.jpg",
            address = "Kizhathadiyoor Rd, Moonnani, Pala",
            name = "Govt. Veteinary",
            rating = 2.0f
        ),
        ClinicModel(
            image = "https://content.jdmagicbox.com/comp/kottayam/e7/9999px481.x481.210309163527.k8e7/catalogue/pawzon-pet-hospital-pala-town-kottayam-veterinary-hospitals-igaauapl8q.jpg",
            address = "Kizhathadiyoor Rd, Moonnani, Pala",
            name = "Laka zonll",
            rating = 3.0f
        ),

        )

    LazyColumn {
        items(clinicList) { clinic ->
            ClinicListItemComponent(clinicModel = clinic)
        }
    }
}

@Preview
@Composable
fun ClinicListComponentsPreview() {
    ClinicListComponent()
}