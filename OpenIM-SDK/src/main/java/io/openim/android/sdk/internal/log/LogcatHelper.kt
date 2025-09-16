package io.openim.android.sdk.internal.log

import android.util.Log

object LogcatHelper {
    private const val TAG = "OpenIM-SDK"
    fun logDInDebug(message: String?) {
        if (message.isNullOrEmpty()) return

        Log.d(TAG, message)
    }
}
