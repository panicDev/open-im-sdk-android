package io.openim.android.sdk.listener

import io.openim.android.sdk.models.BlacklistInfo
import io.openim.android.sdk.models.FriendApplicationInfo
import io.openim.android.sdk.models.FriendInfo
import io.openim.android.sdk.utils.CommonUtil
import io.openim.android.sdk.utils.JsonUtil

class _FriendshipListener(private val listener: OnFriendshipListener?) :
    open_im_sdk_callback.OnFriendshipListener {

    override fun onBlackAdded(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, BlacklistInfo::class.java)
            CommonUtil.runMainThread { it.onBlacklistAdded(u) }
        }
    }

    override fun onBlackDeleted(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, BlacklistInfo::class.java)
            CommonUtil.runMainThread { it.onBlacklistDeleted(u) }
        }
    }

    override fun onFriendAdded(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, FriendInfo::class.java)
            CommonUtil.runMainThread { it.onFriendAdded(u) }
        }
    }

    override fun onFriendApplicationAccepted(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, FriendApplicationInfo::class.java)
            CommonUtil.runMainThread { it.onFriendApplicationAccepted(u) }
        }
    }

    override fun onFriendApplicationAdded(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, FriendApplicationInfo::class.java)
            CommonUtil.runMainThread { it.onFriendApplicationAdded(u) }
        }
    }

    override fun onFriendApplicationDeleted(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, FriendApplicationInfo::class.java)
            CommonUtil.runMainThread { it.onFriendApplicationDeleted(u) }
        }
    }

    override fun onFriendApplicationRejected(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, FriendApplicationInfo::class.java)
            CommonUtil.runMainThread { it.onFriendApplicationRejected(u) }
        }
    }

    override fun onFriendDeleted(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, FriendInfo::class.java)
            CommonUtil.runMainThread { it.onFriendDeleted(u) }
        }
    }

    override fun onFriendInfoChanged(s: String) {
        listener?.let {
            val u = JsonUtil.toObj(s, FriendInfo::class.java)
            CommonUtil.runMainThread { it.onFriendInfoChanged(u) }
        }
    }
}
