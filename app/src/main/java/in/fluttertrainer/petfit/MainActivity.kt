package `in`.fluttertrainer.petfit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import `in`.fluttertrainer.petfit.features.authentication.presentation.pages.LoginPage
import `in`.fluttertrainer.petfit.ui.common.theme.PetFitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetFitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PetFitApp()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PetFitPreview() {
    PetFitTheme {
        PetFitApp()
    }
}