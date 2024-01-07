package `in`.fluttertrainer.petfit.ui.common.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import `in`.fluttertrainer.petfit.ui.common.models.BottomNavItem

@Composable
fun  AppBottomNavigationBar(onItemSelected: (Int) -> Unit, currentIndex: Int){
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Clinics,
        BottomNavItem.Products,
        BottomNavItem.Studio,
        BottomNavItem.Profile
    )


    NavigationBar {
        items.forEachIndexed{index,item ->
            NavigationBarItem(
                selected = index == currentIndex,
                onClick = { onItemSelected(index) },
                label = { Text(item.label) },
                icon = { Icon(item.icon,contentDescription = item.label) })
        }
    }
}

@Preview
@Composable
fun  AppBottomNavigationBarPreview(){
    AppBottomNavigationBar(onItemSelected= { }, currentIndex = 1)
}