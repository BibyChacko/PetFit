package `in`.fluttertrainer.petfit.ui.common.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import `in`.fluttertrainer.petfit.features.clinics.presentation.pages.ClinicSection
import `in`.fluttertrainer.petfit.features.home.presentation.pages.HomeSection
import `in`.fluttertrainer.petfit.features.products.presentation.pages.ProductSection
import `in`.fluttertrainer.petfit.ui.common.components.AppBottomNavigationBar
import `in`.fluttertrainer.petfit.ui.common.components.MAppBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage() {
    var selectedIndex by rememberSaveable {
        mutableIntStateOf(0)
    }
    Scaffold(
        topBar = { MAppBar(canPop = false) },
        bottomBar = {
            AppBottomNavigationBar(
                currentIndex = selectedIndex,
                onItemSelected = {
                    selectedIndex = it
                })
        }
    ) {
        val innerPadding = it
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            when (selectedIndex) {
                0 -> HomeSection()
                1 -> ClinicSection()
                2 -> ProductSection()
                3 -> Text("Studio")
                4 -> Text("Profile")
            }
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomePagePreview() {
    HomePage()
}
