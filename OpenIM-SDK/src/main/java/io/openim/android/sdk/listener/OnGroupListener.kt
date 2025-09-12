package io.openim.android.sdk.listener

import io.openim.android.sdk.models.GroupApplicationInfo
import io.openim.android.sdk.models.GroupInfo
import io.openim.android.sdk.models.GroupMembersInfo

/**
 * Group event listener
 */
interface OnGroupListener {
    fun onGroupApplicationAccepted(info: GroupApplicationInfo) {}
    fun onGroupApplicationAdded(info: GroupApplicationInfo) {}
    fun onGroupApplicationDeleted(info: GroupApplicationInfo) {}
    fun onGroupApplicationRejected(info: GroupApplicationInfo) {}
    fun onGroupDismissed(info: GroupInfo) {}
    fun onGroupInfoChanged(info: GroupInfo) {}
    fun onGroupMemberAdded(info: GroupMembersInfo) {}
    fun onGroupMemberDeleted(info: GroupMembersInfo) {}
    fun onGroupMemberInfoChanged(info: GroupMembersInfo) {}
    fun onJoinedGroupAdded(info: GroupInfo) {}
    fun onJoinedGroupDeleted(info: GroupInfo) {}
}
