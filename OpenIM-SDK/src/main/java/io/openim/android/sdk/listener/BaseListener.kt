package io.openim.android.sdk.listener

import io.openim.android.sdk.utils.CommonUtil

open class BaseListener<T>(protected val listener: T) {
    protected fun post(block: () -> Unit) {
        CommonUtil.runMainThread(block)
    }
}
