package io.openim.android.sdk.listener

import io.openim.android.sdk.models.ConversationInfo
import io.openim.android.sdk.utils.CommonUtil
import io.openim.android.sdk.utils.JsonUtil

class _ConversationListener(private val listener: OnConversationListener?) :
    open_im_sdk_callback.OnConversationListener {

    override fun onConversationChanged(s: String) {
        listener?.let {
            val list = JsonUtil.toArray(s, ConversationInfo::class.java)
            CommonUtil.runMainThread { it.onConversationChanged(list) }
        }
    }

    override fun onConversationUserInputStatusChanged(s: String) {
        listener?.let { CommonUtil.runMainThread { it.onConversationUserInputStatusChanged(s) } }
    }

    override fun onNewConversation(s: String) {
        listener?.let {
            val list = JsonUtil.toArray(s, ConversationInfo::class.java)
            CommonUtil.runMainThread { it.onNewConversation(list) }
        }
    }

    override fun onSyncServerFailed(reinstalled: Boolean) {
        listener?.let { CommonUtil.runMainThread { it.onSyncServerFailed(reinstalled) } }
    }

    override fun onSyncServerFinish(reinstalled: Boolean) {
        listener?.let { CommonUtil.runMainThread { it.onSyncServerFinish(reinstalled) } }
    }

    override fun onSyncServerStart(reinstalled: Boolean) {
        listener?.let { CommonUtil.runMainThread { it.onSyncServerStart(reinstalled) } }
    }

    override fun onSyncServerProgress(progress: Long) {
        listener?.let { CommonUtil.runMainThread { it.onSyncServerProgress(progress) } }
    }

    override fun onTotalUnreadMessageCountChanged(i: Int) {
        listener?.let { CommonUtil.runMainThread { it.onTotalUnreadMessageCountChanged(i) } }
    }
}
