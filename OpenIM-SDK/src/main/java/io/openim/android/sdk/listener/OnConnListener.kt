package io.openim.android.sdk.listener

/** Connection callbacks occur only after calling the SDK login method */
interface OnConnListener {
    fun onConnectFailed(code: Int, error: String) {}
    fun onConnectSuccess() {}
    fun onConnecting() {}
    fun onKickedOffline() {}
    fun onUserTokenExpired() {}
    fun onUserTokenInvalid(s: String) {}
}
