package io.openim.android.sdk.utils

object ParamsUtil {
    fun buildOperationID(): String = System.currentTimeMillis().toString()
}
