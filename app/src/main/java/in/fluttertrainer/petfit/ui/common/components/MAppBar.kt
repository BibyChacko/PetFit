package `in`.fluttertrainer.petfit.ui.common.components


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.HeadsetMic
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import `in`.fluttertrainer.petfit.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MAppBar(
    title: String? = null,
    canPop: Boolean = true,
    onBackPressed: (() -> Unit)? = null,
    actions: (() -> Unit)? = null
) {
    TopAppBar(
        title = { Text(title ?: "Petonna",
            style = MaterialTheme.typography.headlineSmall) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            actionIconContentColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.primary,
            navigationIconContentColor = MaterialTheme.colorScheme.primary,
        ),
        navigationIcon = {
            if (canPop) {
                IconButton(onClick = onBackPressed ?: {}) {
                    Icon(
                        Icons.Outlined.ArrowBack,
                        contentDescription = stringResource(R.string.back)
                    )
                }
            }
        },
        actions = { actions ?: DefaultActions() },
    )
}

@Composable
fun DefaultActions() {
    Icon(Icons.Filled.HeadsetMic, contentDescription = "Info")
}

@Preview
@Composable
fun MAppBarPreview() {
    MAppBar(canPop = false)
}