package io.openim.android.sdk.listener

import io.openim.android.sdk.utils.CommonUtil

class _ConnListener(private val listener: OnConnListener?) : open_im_sdk_callback.OnConnListener {
    override fun onConnectFailed(i: Int, s: String) {
        listener?.let { CommonUtil.runMainThread { it.onConnectFailed(i, s) } }
    }

    override fun onConnectSuccess() {
        listener?.let { CommonUtil.runMainThread { it.onConnectSuccess() } }
    }

    override fun onConnecting() {
        listener?.let { CommonUtil.runMainThread { it.onConnecting() } }
    }

    override fun onKickedOffline() {
        listener?.let { CommonUtil.runMainThread { it.onKickedOffline() } }
    }

    override fun onUserTokenExpired() {
        listener?.let { CommonUtil.runMainThread { it.onUserTokenExpired() } }
    }

    override fun onUserTokenInvalid(s: String) {
        listener?.let { CommonUtil.runMainThread { it.onUserTokenInvalid(s) } }
    }
}
