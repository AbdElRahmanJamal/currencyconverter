package com.app.core.domain.util

import java.io.IOException

sealed class AppExceptions : IOException() {
    object GenericErrorException : AppExceptions()
}
