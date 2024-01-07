package `in`.fluttertrainer.petfit.features.home.presentation.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.fluttertrainer.petfit.features.home.presentation.components.mobile_service.MobileServiceWidget
import `in`.fluttertrainer.petfit.features.home.presentation.components.my_pets.MyPetList
import `in`.fluttertrainer.petfit.features.home.presentation.components.servcies_features.FeatureList
import `in`.fluttertrainer.petfit.features.home.presentation.components.servcies_features.UserGreetings


@Composable
fun HomeSection() {
    var scrollState by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .verticalScroll(
                state = rememberScrollState(initial = 0),
                enabled = true,
            )
            .onGloballyPositioned {
                scrollState = it.boundsInWindow().bottom.toInt()
            },
    ) {
        UserGreetings()
        Spacer(modifier = Modifier.size(24.dp))
        FeatureList()
        Spacer(modifier = Modifier.size(24.dp))
        MyPetList()
        MobileServiceWidget()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeSectionPreview() {
    HomeSection()
}