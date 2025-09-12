package io.openim.android.sdk.enums

enum class GroupMemberFilter(val value: Int) {
    All(0),
    Owner(1),
    Admin(2),
    Normal(3),
    AdminAndNormal(4),
    AdminAndOwner(5)
}
