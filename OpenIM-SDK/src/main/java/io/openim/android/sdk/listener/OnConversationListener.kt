package io.openim.android.sdk.listener

import io.openim.android.sdk.models.ConversationInfo

interface OnConversationListener {
    fun onConversationChanged(list: List<ConversationInfo>) {}
    fun onNewConversation(list: List<ConversationInfo>) {}
    fun onSyncServerFailed(reinstalled: Boolean) {}
    fun onSyncServerFinish(reinstalled: Boolean) {}
    fun onSyncServerStart(reinstalled: Boolean) {}
    fun onSyncServerProgress(progress: Long) {}
    fun onTotalUnreadMessageCountChanged(i: Int) {}
    fun onConversationUserInputStatusChanged(s: String) {}
}
