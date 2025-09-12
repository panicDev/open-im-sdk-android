package io.openim.android.sdk.listener

import io.openim.android.sdk.models.Message
import io.openim.android.sdk.utils.CommonUtil

class _MsgSendProgressListener(private val base: OnMsgSendCallback?) :
    open_im_sdk_callback.SendMsgCallBack {
    override fun onError(i: Int, s: String) {
        base?.let { CommonUtil.returnError(it, i, s) }
    }

    override fun onProgress(l: Long) {
        base?.let { CommonUtil.runMainThread { it.onProgress(l) } }
    }

    override fun onSuccess(s: String) {
        base?.let { CommonUtil.returnObject(it, Message::class.java, s) }
    }
}
