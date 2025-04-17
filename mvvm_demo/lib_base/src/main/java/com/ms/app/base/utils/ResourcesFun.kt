package com.ms.app.base.utils

import androidx.annotation.StringRes
import com.ms.app.base.BaseApplication.Companion.instance as app

fun getString(@StringRes stringRes: Int): String {
    return app.getString(stringRes)
}