package io.openim.android.sdk.listener

import io.openim.android.sdk.models.Message

interface OnMsgSendCallback : OnBase<Message> {
    override fun onError(code: Int, error: String) {}
    fun onProgress(progress: Long) {}
    override fun onSuccess(data: Message) {}
}
