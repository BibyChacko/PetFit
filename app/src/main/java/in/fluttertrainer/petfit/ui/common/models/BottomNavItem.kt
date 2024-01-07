package `in`.fluttertrainer.petfit.ui.common.models

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddShoppingCart
import androidx.compose.material.icons.outlined.HomeMax
import androidx.compose.material.icons.outlined.LocalHospital
import androidx.compose.material.icons.outlined.Radio
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route:String,val icon:ImageVector,val  label:String){
    object Home: BottomNavItem(
            route = BottomNavListItems.Home.name,
            icon = Icons.Outlined.HomeMax,
            label = BottomNavListItems.Home.name,
        )
    object Clinics: BottomNavItem(
        route = BottomNavListItems.Clinics.name,
        icon = Icons.Outlined.LocalHospital,
        label = BottomNavListItems.Clinics.name,
    )
    object Products: BottomNavItem(
        route = BottomNavListItems.Products.name,
        icon = Icons.Outlined.AddShoppingCart,
        label = BottomNavListItems.Products.name,
    )
    object Studio: BottomNavItem(
        route = BottomNavListItems.Studio.name,
        icon = Icons.Outlined.Radio,
        label = BottomNavListItems.Studio.name,
    )
    object Profile: BottomNavItem(
        route = BottomNavListItems.Profile.name,
        icon = Icons.Outlined.VerifiedUser,
        label = BottomNavListItems.Profile.name,
    )
}


enum class BottomNavListItems {
    Home,
    Clinics,
    Products,
    Studio,
    Profile
}