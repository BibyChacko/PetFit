package `in`.fluttertrainer.petfit.ui.common.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import `in`.fluttertrainer.petfit.R
import `in`.fluttertrainer.petfit.ui.common.theme.Purple40
import `in`.fluttertrainer.petfit.ui.common.theme.PurpleGrey80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTextFormField(
    value: String,
    label: String,
    onValueChanged: (String) -> Unit,
    isObscure: Boolean = false,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    errorText: String? = null,

    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            unfocusedIndicatorColor = PurpleGrey80,
            focusedIndicatorColor = Purple40
        ),
        label = { Text(label, style = MaterialTheme.typography.labelSmall) },
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        isError = errorText != null,
        supportingText = {
            if (errorText != null) {
                Text(
                    errorText, style =
                    MaterialTheme.typography.labelSmall.copy(color = Color.Red)
                )
            }
        },
        modifier = Modifier
            .fillMaxWidth(),
        visualTransformation = if (isObscure) PasswordVisualTransformation()
        else VisualTransformation.None
    )
}


@Preview
@Composable
fun AppTextFormFieldPreview() {
    AppTextFormField(
        value = "",
        onValueChanged = {},
        label = "Label",
        leadingIcon = @Composable {
            Icon(
                Icons.Outlined.Email,
                contentDescription = "Leading"
            )
        },
        errorText = stringResource(
            R.string.email_required
        )
    )
}