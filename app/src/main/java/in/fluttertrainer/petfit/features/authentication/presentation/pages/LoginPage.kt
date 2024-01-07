package `in`.fluttertrainer.petfit.features.authentication.presentation.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Key
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import `in`.fluttertrainer.petfit.R
import `in`.fluttertrainer.petfit.core.helpers.validations.FormValidator
import `in`.fluttertrainer.petfit.core.routing.Routes
import `in`.fluttertrainer.petfit.ui.common.components.AppButton
import `in`.fluttertrainer.petfit.ui.common.components.AppTextFormField


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(navigateTo:(Routes) -> Unit) {
    var emailInput by rememberSaveable {
        mutableStateOf("")
    }

    var passwordInput by rememberSaveable {
        mutableStateOf("")
    }

    var shouldViewPassword by remember {
        mutableStateOf(false)
    }

    var hasError by remember {
        mutableStateOf(false)
    }

    var scrollState by remember { mutableStateOf(0) }

    Scaffold() {
        val innerPadding = it
        val context = LocalContext.current
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(16.dp)
                .padding(innerPadding)
                .verticalScroll(
                    state = rememberScrollState(initial = 0),
                    enabled = true,
                )
                .onGloballyPositioned {
                    scrollState = it.boundsInWindow().bottom.toInt()
                },
            verticalArrangement = Arrangement.Center,

            ) {
            Image(
                painter = painterResource(id = R.drawable.app_logo),
                contentDescription = "App logo",
                modifier = Modifier
                    .size(240.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                stringResource(R.string.login_to_your_account),
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(height = 24.dp))
            AppTextFormField(
                value = emailInput,
                label = stringResource(R.string.email),
                leadingIcon = @Composable {
                    Icon(
                        Icons.Outlined.Email,
                        contentDescription = "Email"
                    )
                },
                onValueChanged = {
                    emailInput = it
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next,
                    keyboardType = KeyboardType.Email
                ),
                errorText = if (!hasError) null else FormValidator.validateEmail(
                    emailInput.trim(),
                    context
                )
            )
            Spacer(modifier = Modifier.height(height = 12.dp))
            AppTextFormField(
                value = passwordInput,
                label = stringResource(R.string.password),
                onValueChanged = {
                    passwordInput = it
                },
                leadingIcon = @Composable {
                    Icon(
                        Icons.Outlined.Key,
                        contentDescription = "Password"
                    )
                },
                trailingIcon = {
                    IconButton(onClick = {
                        shouldViewPassword = !shouldViewPassword
                    }) {
                        Icon(
                            if (shouldViewPassword)
                                Icons.Outlined.VisibilityOff
                            else Icons.Outlined.Visibility,
                            contentDescription = stringResource(
                                R.string.password_visibility
                            )
                        )
                    }
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done,
                ),
                isObscure = !shouldViewPassword,
                errorText = if (!hasError) null else FormValidator.validatePassword(
                    passwordInput,
                    context
                )
            )
            Spacer(modifier = Modifier.height(height = 24.dp))
            Surface(modifier = Modifier.padding(horizontal = 16.dp)) {
                AppButton(
                    buttonText = stringResource(R.string.login),
                    onClick = {
//                        hasError = FormValidator.validateEmail(
//                            emailInput.trim(),
//                            context
//                        ) != null || FormValidator.validatePassword(
//                            passwordInput,
//                            context
//                        ) != null
//                        if (hasError) {
//                            return@AppButton
//                        }
//                        loginUser(emailInput.trim(), passwordInput)
                        navigateTo(Routes.Home)
                    }
                )
            }
            Spacer(modifier = Modifier.height(height = 24.dp))
            Divider(modifier = Modifier.padding(horizontal = 32.dp))
            Spacer(modifier = Modifier.height(height = 12.dp))
            Text(
                stringResource(R.string.signin_alternatives_text),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Card(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Google sign in",

                        modifier = Modifier
                            .size(40.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }
                Card(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "Facebook sign in",
                        modifier = Modifier
                            .size(40.dp)
                            .align(Alignment.CenterHorizontally)
                            .padding(4.dp)
                    )
                }
                Card(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.twitter),
                        contentDescription = "X Sign in",
                        modifier = Modifier
                            .size(40.dp)
                            .align(Alignment.CenterHorizontally)
                            .padding(4.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(height = 24.dp))
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clickable {
                        navigateToSignUp()
                    }) {
                Text(
                    stringResource(
                        R.string.new_user_text_1
                    ), style = MaterialTheme.typography
                        .labelMedium.copy(color = Color.Gray)
                )
                Text(
                    stringResource(
                        R.string.create_now
                    ),
                    style = MaterialTheme.typography
                        .labelMedium.copy(
                            color = MaterialTheme.colorScheme.primary
                        )
                )
            }
        }
    }
}

private fun loginUser(email: String, password: String) {
//    TODO("Not yet implemented")

}

private fun navigateToSignUp() {
//    TODO("Not yet implemented")
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginPagePreview() {
    LoginPage(navigateTo = {})
}