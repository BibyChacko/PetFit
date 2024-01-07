package `in`.fluttertrainer.petfit.features.products.presentation.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Toys
import androidx.compose.material.icons.outlined.Fastfood
import androidx.compose.material.icons.outlined.Storefront
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector


enum class TabListEnum {
    All,
    Nutrition,
    Accessories,
    Toys,
}


fun TabListEnum.getIcon(): ImageVector {
    return when (this) {
        TabListEnum.All -> { Icons.Filled.Home }
        TabListEnum.Nutrition -> { Icons.Filled.Fastfood }
        TabListEnum.Accessories -> { Icons.Filled.ShoppingCart }
        TabListEnum.Toys -> { Icons.Filled.Toys }
    }
}

