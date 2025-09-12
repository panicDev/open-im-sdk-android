package io.openim.android.sdk.listener

import io.openim.android.sdk.models.BlacklistInfo
import io.openim.android.sdk.models.FriendApplicationInfo
import io.openim.android.sdk.models.FriendInfo

interface OnFriendshipListener {
    fun onBlacklistAdded(u: BlacklistInfo) {}
    fun onBlacklistDeleted(u: BlacklistInfo) {}
    fun onFriendApplicationAccepted(u: FriendApplicationInfo) {}
    fun onFriendApplicationAdded(u: FriendApplicationInfo) {}
    fun onFriendApplicationDeleted(u: FriendApplicationInfo) {}
    fun onFriendApplicationRejected(u: FriendApplicationInfo) {}
    fun onFriendInfoChanged(u: FriendInfo) {}
    fun onFriendAdded(u: FriendInfo) {}
    fun onFriendDeleted(u: FriendInfo) {}
}
