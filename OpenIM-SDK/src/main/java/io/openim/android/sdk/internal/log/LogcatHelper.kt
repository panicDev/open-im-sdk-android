package io.openim.android.sdk.internal.log

import android.text.TextUtils
import android.util.Log
import io.openim.android.sdk.BuildConfig

object LogcatHelper {
    private const val TAG = "OpenIM-SDK"
    fun logDInDebug(message: String?) {
        if (message.isNullOrEmpty()) return
        if (BuildConfig.DEBUG) {
            Log.d(TAG, message)
        }
    }
}
