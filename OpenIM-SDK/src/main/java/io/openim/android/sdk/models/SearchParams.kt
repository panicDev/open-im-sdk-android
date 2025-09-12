package io.openim.android.sdk.models

data class SearchParams(
    var conversationID: String? = null,
    var clientMsgIDList: List<String>? = null
)
