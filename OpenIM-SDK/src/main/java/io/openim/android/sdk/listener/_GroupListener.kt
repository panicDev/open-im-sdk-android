package io.openim.android.sdk.listener

import io.openim.android.sdk.models.GroupApplicationInfo
import io.openim.android.sdk.models.GroupInfo
import io.openim.android.sdk.models.GroupMembersInfo
import io.openim.android.sdk.utils.CommonUtil
import io.openim.android.sdk.utils.JsonUtil
import open_im_sdk_callback.OnGroupListener as SdkGroupListener

internal class _GroupListener(private val listener: OnGroupListener) : SdkGroupListener {
    override fun onGroupApplicationAccepted(s: String) {
        val info = JsonUtil.toObj(s, GroupApplicationInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupApplicationAccepted(info) }
    }

    override fun onGroupApplicationAdded(s: String) {
        val info = JsonUtil.toObj(s, GroupApplicationInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupApplicationAdded(info) }
    }

    override fun onGroupApplicationDeleted(s: String) {
        val info = JsonUtil.toObj(s, GroupApplicationInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupApplicationDeleted(info) }
    }

    override fun onGroupApplicationRejected(s: String) {
        val info = JsonUtil.toObj(s, GroupApplicationInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupApplicationRejected(info) }
    }

    override fun onGroupDismissed(s: String) {
        val info = JsonUtil.toObj(s, GroupInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupDismissed(info) }
    }

    override fun onGroupInfoChanged(s: String) {
        val info = JsonUtil.toObj(s, GroupInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupInfoChanged(info) }
    }

    override fun onGroupMemberAdded(s: String) {
        val info = JsonUtil.toObj(s, GroupMembersInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupMemberAdded(info) }
    }

    override fun onGroupMemberDeleted(s: String) {
        val info = JsonUtil.toObj(s, GroupMembersInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupMemberDeleted(info) }
    }

    override fun onGroupMemberInfoChanged(s: String) {
        val info = JsonUtil.toObj(s, GroupMembersInfo::class.java)
        CommonUtil.runMainThread { listener.onGroupMemberInfoChanged(info) }
    }

    override fun onJoinedGroupAdded(s: String) {
        val info = JsonUtil.toObj(s, GroupInfo::class.java)
        CommonUtil.runMainThread { listener.onJoinedGroupAdded(info) }
    }

    override fun onJoinedGroupDeleted(s: String) {
        val info = JsonUtil.toObj(s, GroupInfo::class.java)
        CommonUtil.runMainThread { listener.onJoinedGroupDeleted(info) }
    }
}
