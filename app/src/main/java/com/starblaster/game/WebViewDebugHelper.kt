package com.starblaster.game

import android.content.pm.ApplicationInfo
import android.os.Build
import android.webkit.WebView

object WebViewDebugHelper {
    fun enableDebug() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (0 != (BuildConfig.DEBUG).let { if (it) 1 else 0 }) {
                WebView.setWebContentsDebuggingEnabled(true)
            }
        }
    }
}
