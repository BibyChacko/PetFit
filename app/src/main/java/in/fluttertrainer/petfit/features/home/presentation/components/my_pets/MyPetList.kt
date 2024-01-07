package `in`.fluttertrainer.petfit.features.home.presentation.components.my_pets

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.fluttertrainer.petfit.R
import `in`.fluttertrainer.petfit.ui.common.models.MyPetInfo
import kotlin.math.absoluteValue

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyPetList() {
    val petList = listOf(
        MyPetInfo(
            imageAddress = "https://images.news18.com/ibnlive/uploads/2022/01/untitled-design-2022-01-24t124157.003.jpg",
            petName = "Jimmy",
        ),
        MyPetInfo(
            imageAddress = "https://www.petsworld.in/blog/wp-content/uploads/2017/12/persian-cat.jpg",
            petName = "Toby",
        ),
        MyPetInfo(
            imageAddress = "https://assets.vogue.in/photos/62502b8d90038a40f11ff27c/2:3/w_2560%2Cc_limit/Dog%25202.png",
            petName = "Nancy",
        )
    )
    val pagerState = rememberPagerState {
        petList.size
    }

    val screenWidth = LocalConfiguration.current.screenWidthDp.absoluteValue / 2.5

    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(stringResource(R.string.my_pets), style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(height = 16.dp))
        HorizontalPager(
            state = pagerState,
            pageSize = PageSize.Fixed(screenWidth.dp)
        ) { page ->
            MyPetListItem(
                imageAddress = petList[page].imageAddress,
                name = petList[page].petName,
            )
        }
        Spacer(modifier = Modifier.height(height = 16.dp))
        Divider()
        Spacer(modifier = Modifier.height(height = 16.dp))
    }
}

@Preview
@Composable
fun MyPetListPreview() {
    MyPetList()
}