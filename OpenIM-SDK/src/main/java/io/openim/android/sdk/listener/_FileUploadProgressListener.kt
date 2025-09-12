package io.openim.android.sdk.listener

import io.openim.android.sdk.utils.CommonUtil

class _FileUploadProgressListener(private val base: OnFileUploadProgressListener?) :
    open_im_sdk_callback.SendMsgCallBack {
    override fun onError(i: Int, s: String) {
        base?.let { CommonUtil.returnError(it, i, s) }
    }

    override fun onProgress(l: Long) {
        base?.let { CommonUtil.runMainThread { it.onProgress(l) } }
    }

    override fun onSuccess(s: String) {
        base?.let { CommonUtil.runMainThread { it.onSuccess(s) } }
    }
}
