package io.openim.android.sdk.models

data class SearchResultItem(
    var conversationID: String? = null,
    var messageCount: Int = 0,
    var showName: String? = null,
    var faceURL: String? = null,
    var messageList: List<Message>? = null
)
