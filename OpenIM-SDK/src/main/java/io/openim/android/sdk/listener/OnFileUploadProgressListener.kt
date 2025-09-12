package io.openim.android.sdk.listener

interface OnFileUploadProgressListener : OnBase<String> {
    override fun onError(code: Int, error: String) {}
    fun onProgress(progress: Long) {}
    override fun onSuccess(data: String) {}
}
