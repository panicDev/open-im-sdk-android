package io.openim.android.sdk.listener

import io.openim.android.sdk.utils.CommonUtil
import open_im_sdk_callback.Base

object BaseImpl {
    fun stringBase(base: OnBase<String>): Base = object : Base {
        override fun onError(l: Int, s: String) {
            CommonUtil.returnError(base, l, s)
        }

        override fun onSuccess(s: String) {
            CommonUtil.returnSuccess(base, s)
        }
    }

    fun <T> arrayBase(base: OnBase<List<T>>, clazz: Class<T>): Base = object : Base {
        override fun onError(l: Int, s: String) {
            CommonUtil.returnError(base, l, s)
        }

        override fun onSuccess(s: String) {
            CommonUtil.returnList(base, clazz, s)
        }
    }

    fun <T> objectBase(base: OnBase<T>, clazz: Class<T>): Base = object : Base {
        override fun onError(l: Int, s: String) {
            CommonUtil.returnError(base, l, s)
        }

        override fun onSuccess(s: String) {
            CommonUtil.returnObject(base, clazz, s)
        }
    }
}
