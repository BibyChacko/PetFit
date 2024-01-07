package `in`.fluttertrainer.petfit.features.clinics.presentation.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.fluttertrainer.petfit.R
import `in`.fluttertrainer.petfit.features.clinics.presentation.components.ClinicListComponent
import `in`.fluttertrainer.petfit.ui.common.components.AppTextFormField


@Composable
fun ClinicSection() {
    val clinicInputSearch by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        AppTextFormField(
            value = clinicInputSearch,
            label = "Search clinics",
            leadingIcon = {
                Icon(
                    Icons.Outlined.Search,
                    contentDescription = stringResource(R.string.search_clinics)
                )
            },
            onValueChanged = {}
        )
        Spacer(modifier = Modifier.height(32.dp))
        ClinicListComponent()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ClinicSectionPreview() {
    ClinicSection()
}