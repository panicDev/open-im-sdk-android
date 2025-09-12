package io.openim.android.sdk.models

import io.openim.android.sdk.utils.JsonUtil

open class BaseEntity {
    override fun toString(): String = JsonUtil.toString(this)
}
