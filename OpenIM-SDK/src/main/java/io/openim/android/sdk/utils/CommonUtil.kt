package io.openim.android.sdk.utils

import android.os.Handler
import android.os.Looper
import io.openim.android.sdk.listener.OnBase

object CommonUtil {
    private val uiHandler = Handler(Looper.getMainLooper())

    fun runMainThread(runnable: () -> Unit) {
        uiHandler.post(runnable)
    }

    fun <T> returnError(onBase: OnBase<T>?, code: Int, error: String) {
        if (onBase != null) {
            runMainThread { onBase.onError(code, error) }
        }
    }

    fun returnSuccess(onBase: OnBase<String>?, s: String) {
        if (onBase != null) {
            runMainThread { onBase.onSuccess(s) }
        }
    }

    fun <T> returnObject(onBase: OnBase<T>?, clazz: Class<T>, s: String) {
        if (onBase != null) {
            try {
                val obj = JsonUtil.toObj(s, clazz)
                runMainThread { onBase.onSuccess(obj) }
            } catch (e: Exception) {
                runMainThread { onBase.onError(-1, e.message ?: "") }
            }
        }
    }

    fun <T> returnList(onBase: OnBase<List<T>>?, clazz: Class<T>, s: String) {
        if (onBase != null) {
            try {
                val list = JsonUtil.toArray(s, clazz)
                runMainThread { onBase.onSuccess(list) }
            } catch (e: Exception) {
                runMainThread { onBase.onError(-1, e.message ?: "") }
            }
        }
    }
}
