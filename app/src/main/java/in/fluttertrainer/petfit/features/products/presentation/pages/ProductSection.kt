package `in`.fluttertrainer.petfit.features.products.presentation.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.fluttertrainer.petfit.features.products.presentation.data.TabListEnum
import `in`.fluttertrainer.petfit.features.products.presentation.data.getIcon


@Composable
fun ProductSection() {
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }
    Column {
        ScrollableTabRow(
            selectedTabIndex = selectedTabIndex,
            indicator = {tabPositions ->
                TabRowDefaults.Indicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex])
                )
            },
            edgePadding = 4.dp) {
            TabListEnum.values()
                .forEachIndexed { index, tabListEnum ->
                    Tab(
                        selected = index == selectedTabIndex,
                        modifier = Modifier
                            .wrapContentSize()
                            .width(IntrinsicSize.Min),
                        icon = {
                               Icon(tabListEnum.getIcon(), contentDescription = null )
                        },
                        text = {
                            Text(text = tabListEnum.name)
                        },
                        onClick = {
                            selectedTabIndex = index
                        }
                    )
                }
        }
        Column {
            Text(text = TabListEnum.values()[selectedTabIndex].name)
        }
    }


}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProductSectionPreview() {
    ProductSection()
}