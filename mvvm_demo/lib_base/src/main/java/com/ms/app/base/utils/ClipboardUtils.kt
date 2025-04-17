package com.ms.app.base.utils

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import com.ms.app.base.BaseApplication

object ClipboardUtils {

    /**
     * 复制内容到剪切板
     *
     * @param text String 内容
     * @param label String 标签，用于区分内容
     */
    fun copyToClipboard(text: String, label: String = "") {
        val clipboard =
            BaseApplication.context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText(label, text)
        clipboard.setPrimaryClip(clip)
    }

}