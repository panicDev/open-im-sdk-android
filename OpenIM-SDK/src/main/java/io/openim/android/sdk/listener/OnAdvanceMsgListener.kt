package io.openim.android.sdk.listener

import io.openim.android.sdk.models.C2CReadReceiptInfo
import io.openim.android.sdk.models.GroupMessageReceipt
import io.openim.android.sdk.models.KeyValue
import io.openim.android.sdk.models.Message
import io.openim.android.sdk.models.RevokedInfo

interface OnAdvanceMsgListener {
    fun onRecvNewMessage(msg: Message) {}
    fun onRecvC2CReadReceipt(list: List<C2CReadReceiptInfo>) {}
    fun onRecvGroupMessageReadReceipt(groupMessageReceipt: GroupMessageReceipt) {}
    fun onRecvMessageRevokedV2(info: RevokedInfo) {}
    fun onRecvMessageExtensionsChanged(msgID: String, list: List<KeyValue>) {}
    fun onRecvMessageExtensionsDeleted(msgID: String, list: List<String>) {}
    fun onRecvMessageExtensionsAdded(msgID: String, list: List<KeyValue>) {}
    fun onMsgDeleted(message: Message) {}
    fun onRecvOfflineNewMessage(msg: List<Message>) {}
    fun onRecvOnlineOnlyMessage(s: String) {}
}
