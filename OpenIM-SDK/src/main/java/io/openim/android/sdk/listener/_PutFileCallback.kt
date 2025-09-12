package io.openim.android.sdk.listener

class _PutFileCallback(listener: OnPutFileListener) :
    BaseListener<OnPutFileListener>(listener),
    open_im_sdk_callback.UploadFileCallback {

    override fun complete(l: Long, s: String, l1: Long) {
        post { listener.complete(l, s, l1) }
    }

    override fun hashPartComplete(s: String, s1: String) {
        post { listener.hashPartComplete(s, s1) }
    }

    override fun hashPartProgress(l: Long, l1: Long, s: String) {
        post { listener.hashPartProgress(l, l1, s) }
    }

    override fun open(l: Long) {
        post { listener.open(l) }
    }

    override fun partSize(l: Long, l1: Long) {
        post { listener.partSize(l, l1) }
    }

    override fun uploadComplete(l: Long, l1: Long, l2: Long) {
        post { listener.uploadComplete(l, l1, l2) }
    }

    override fun uploadID(s: String) {
        post { listener.uploadID(s) }
    }

    override fun uploadPartComplete(l: Long, l1: Long, s: String) {
        post { listener.uploadPartComplete(l, l1, s) }
    }
}
