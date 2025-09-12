package io.openim.android.sdk.models

data class UsersOnlineStatus(
    var userID: String? = null,
    var status: Int = 0,
    var platformIDs: List<Int>? = null
)
