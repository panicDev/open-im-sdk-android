package io.openim.android.sdk.listener

import io.openim.android.sdk.utils.CommonUtil

class _CustomBusinessListener(private val listener: OnCustomBusinessListener?) :
    open_im_sdk_callback.OnCustomBusinessListener {
    override fun onRecvCustomBusinessMessage(s: String) {
        listener?.let { CommonUtil.runMainThread { it.onRecvCustomBusinessMessage(s) } }
    }
}
