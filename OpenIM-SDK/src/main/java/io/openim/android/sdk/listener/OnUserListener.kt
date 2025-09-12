package io.openim.android.sdk.listener

import io.openim.android.sdk.models.UserInfo
import io.openim.android.sdk.models.UsersOnlineStatus

interface OnUserListener {
    fun onSelfInfoUpdated(info: UserInfo) {}
    fun onUserStatusChanged(onlineStatus: UsersOnlineStatus) {}
}
