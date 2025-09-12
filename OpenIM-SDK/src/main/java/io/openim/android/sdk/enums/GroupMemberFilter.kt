package io.openim.android.sdk.enums

enum class GroupMemberFilter(val value: Int) {
    All(0),
    Owner(1),
    Admin(2),
    Nomal(3),
    AdminAndNomal(4),
    AdminAndOwner(5)
}
