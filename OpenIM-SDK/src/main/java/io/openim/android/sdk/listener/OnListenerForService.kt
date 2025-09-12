package io.openim.android.sdk.listener

import io.openim.android.sdk.models.FriendApplicationInfo
import io.openim.android.sdk.models.GroupApplicationInfo
import io.openim.android.sdk.models.Message

interface OnListenerForService {
    fun onFriendApplicationAccepted(u: FriendApplicationInfo) {}
    fun onFriendApplicationAdded(u: FriendApplicationInfo) {}
    fun onGroupApplicationAccepted(info: GroupApplicationInfo) {}
    fun onGroupApplicationAdded(info: GroupApplicationInfo) {}
    fun onRecvNewMessage(msg: Message) {}
}
