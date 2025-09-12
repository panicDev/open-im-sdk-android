package io.openim.android.sdk.listener

import io.openim.android.sdk.models.C2CReadReceiptInfo
import io.openim.android.sdk.models.GroupMessageReceipt
import io.openim.android.sdk.models.KeyValue
import io.openim.android.sdk.models.Message
import io.openim.android.sdk.models.RevokedInfo
import io.openim.android.sdk.utils.JsonUtil

class _AdvanceMsgListener(listener: OnAdvanceMsgListener) :
    BaseListener<OnAdvanceMsgListener>(listener),
    open_im_sdk_callback.OnAdvancedMsgListener {

    override fun onMsgDeleted(s: String) {
        val msg = JsonUtil.toObj(s, Message::class.java)
        post { listener.onMsgDeleted(msg) }
    }

    override fun onNewRecvMessageRevoked(s: String) {
        val info = JsonUtil.toObj(s, RevokedInfo::class.java)
        post { listener.onRecvMessageRevokedV2(info) }
    }

    override fun onRecvC2CReadReceipt(s: String) {
        val list = JsonUtil.toArray(s, C2CReadReceiptInfo::class.java)
        post { listener.onRecvC2CReadReceipt(list) }
    }

    override fun onRecvNewMessage(s: String) {
        val msg = JsonUtil.toObj(s, Message::class.java)
        post { listener.onRecvNewMessage(msg) }
    }

    override fun onRecvOfflineNewMessage(s: String) {
        val list = JsonUtil.toArray(s, Message::class.java)
        post { listener.onRecvOfflineNewMessage(list) }
    }

    override fun onRecvOnlineOnlyMessage(s: String) {
        post { listener.onRecvOnlineOnlyMessage(s) }
    }
}
