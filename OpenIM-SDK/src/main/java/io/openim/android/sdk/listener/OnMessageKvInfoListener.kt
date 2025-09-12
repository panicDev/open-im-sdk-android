package io.openim.android.sdk.listener

import io.openim.android.sdk.models.MessageKv

interface OnMessageKvInfoListener {
    fun onMessageKvInfoChanged(list: List<MessageKv>) {}
}
