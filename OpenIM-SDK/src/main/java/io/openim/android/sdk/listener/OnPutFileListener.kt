package io.openim.android.sdk.listener

interface OnPutFileListener {
    fun complete(size: Long, url: String, type: Long) {}
    fun hashPartComplete(var1: String, var2: String) {}
    fun hashPartProgress(var1: Long, var3: Long, var5: String) {}
    fun open(var1: Long) {}
    fun partSize(var1: Long, var3: Long) {}
    fun uploadComplete(size: Long, progress: Long, l2: Long) {}
    fun uploadID(var1: String) {}
    fun uploadPartComplete(var1: Long, var3: Long, var5: String) {}
}
