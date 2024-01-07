package `in`.fluttertrainer.petfit.core.helpers.validations

import android.content.Context
import android.util.Patterns
import `in`.fluttertrainer.petfit.R

class FormValidator {
    companion object {
        fun validateEmail(email: String, context: Context): String? {
            if (email.isEmpty()) {
                return context.getString(R.string.email_required)
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                return context.getString(R.string.invalid_email)
            }
            return null
        }

        fun validatePassword(password: String, context: Context): String? {
            if (password.isEmpty()) {
                return context.getString(R.string.password_required)
            } else if (!password.matches(Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,}\$"))) {
                return context.getString(R.string.password_complexity_warning)
            }
            return null
        }
    }
}