package io.openim.android.sdk.listener

import io.openim.android.sdk.models.UserInfo
import io.openim.android.sdk.models.UsersOnlineStatus
import io.openim.android.sdk.utils.CommonUtil
import io.openim.android.sdk.utils.JsonUtil

class _UserListener(private val listener: OnUserListener) : open_im_sdk_callback.OnUserListener {
    override fun onUserCommandAdd(s: String) {}
    override fun onUserCommandDelete(s: String) {}
    override fun onUserCommandUpdate(s: String) {}

    override fun onSelfInfoUpdated(s: String) {
        CommonUtil.runMainThread { listener.onSelfInfoUpdated(JsonUtil.toObj(s, UserInfo::class.java)) }
    }

    override fun onUserStatusChanged(s: String) {
        CommonUtil.runMainThread { listener.onUserStatusChanged(JsonUtil.toObj(s, UsersOnlineStatus::class.java)) }
    }
}
