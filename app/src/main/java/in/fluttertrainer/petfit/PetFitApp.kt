package `in`.fluttertrainer.petfit

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import `in`.fluttertrainer.petfit.core.routing.Routes
import `in`.fluttertrainer.petfit.features.authentication.presentation.pages.LoginPage
import `in`.fluttertrainer.petfit.ui.common.pages.HomePage


@Composable
fun PetFitApp(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController, startDestination = Routes.Login.name
    ) {
        composable(route = Routes.Login.name) {
            LoginPage(navigateTo = { route ->
                navController.navigate(route.name)
            })
        }
        composable(route = Routes.Home.name) {
            HomePage()
        }
    }
}

@Preview
@Composable
fun PetFitAppPreview() {
    PetFitApp()
}
