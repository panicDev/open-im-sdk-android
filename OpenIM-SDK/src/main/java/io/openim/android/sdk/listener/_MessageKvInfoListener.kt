package io.openim.android.sdk.listener

import io.openim.android.sdk.models.MessageKv
import io.openim.android.sdk.utils.CommonUtil
import io.openim.android.sdk.utils.JsonUtil

class _MessageKvInfoListener(private val listener: OnMessageKvInfoListener?) :
    open_im_sdk_callback.OnMessageKvInfoListener {
    override fun onMessageKvInfoChanged(s: String) {
        listener?.let {
            val list = JsonUtil.toArray(s, MessageKv::class.java)
            CommonUtil.runMainThread { it.onMessageKvInfoChanged(list) }
        }
    }
}
