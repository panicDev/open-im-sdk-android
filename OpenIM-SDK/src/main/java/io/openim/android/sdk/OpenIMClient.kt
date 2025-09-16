package io.openim.android.sdk

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.LinkProperties
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.os.Build
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner
import io.openim.android.sdk.internal.log.LogcatHelper
import io.openim.android.sdk.listener.*
import io.openim.android.sdk.manager.*
import io.openim.android.sdk.models.InitConfig
import io.openim.android.sdk.models.PutArgs
import io.openim.android.sdk.utils.CommonUtil
import io.openim.android.sdk.utils.JsonUtil
import io.openim.android.sdk.utils.ParamsUtil
import open_im_sdk.Open_im_sdk
import open_im_sdk_callback.Base
import open_im_sdk_callback.UploadLogProgress

class OpenIMClient private constructor() {
    val conversationManager = ConversationManager()
    val friendshipManager = FriendshipManager()
    val groupManager = GroupManager()
    val messageManager = MessageManager()
    val userInfoManager = UserInfoManager()

    private var app: Application? = null

    companion object {
        val instance: OpenIMClient by lazy { OpenIMClient() }
    }

    fun initSDK(application: Application, initConfig: InitConfig, listener: OnConnListener): Boolean {
        this.app = application
        val initialized = Open_im_sdk.initSDK(_ConnListener(listener),
            ParamsUtil.buildOperationID(), JsonUtil.toString(initConfig))
        LogcatHelper.logDInDebug(String.format("Initialization successful: %s", initialized))
        return initialized
    }

    fun unInit() {
        Open_im_sdk.unInitSDK(ParamsUtil.buildOperationID())
    }

    private fun registerNetworkCallback() {
        val connectivityManager = app?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            connectivityManager.registerDefaultNetworkCallback(networkCallback)
        } else {
            val builder = NetworkRequest.Builder()
            val request = builder.build()
            connectivityManager.registerNetworkCallback(request, networkCallback)
        }
    }

    private val networkCallback = object : ConnectivityManager.NetworkCallback() {
        override fun onAvailable(network: Network) {
            networkChanged()
        }

        override fun onLosing(network: Network, maxMsToLive: Int) {
            networkChanged()
        }

        override fun onCapabilitiesChanged(network: Network, networkCapabilities: NetworkCapabilities) {
            networkChanged()
        }

        override fun onLinkPropertiesChanged(network: Network, linkProperties: LinkProperties) {
            networkChanged()
        }
    }

    private fun registerActivityLifecycleCallbacks() {
        ProcessLifecycleOwner.get().lifecycle.addObserver(object : DefaultLifecycleObserver {
            override fun onResume(owner: LifecycleOwner) {
                setAppBackgroundStatus(false)
            }

            override fun onStop(owner: LifecycleOwner) {
                setAppBackgroundStatus(true)
            }
        })
    }

    private fun setAppBackgroundStatus(isBackground: Boolean) {
        Open_im_sdk.setAppBackgroundStatus(object : Base {
            override fun onError(i: Int, s: String) {
            }

            override fun onSuccess(s: String) {
            }
        }, ParamsUtil.buildOperationID(), isBackground)
    }

    fun login(base: OnBase<String>, uid: String, token: String) {
        Open_im_sdk.login(object : Base {
            override fun onError(i: Int, s: String) {
                CommonUtil.returnError(base, i, s)
            }

            override fun onSuccess(s: String) {
                CommonUtil.runMainThread {
//                    registerActivityLifecycleCallbacks()
//                    registerNetworkCallback()
                    base.onSuccess(s)
                }
            }
        }, ParamsUtil.buildOperationID(), uid, token)
    }

    fun logout(base: OnBase<String>) {
        Open_im_sdk.logout(BaseImpl.stringBase(base), ParamsUtil.buildOperationID())
    }

    fun getLoginStatus(): Int {
        return Open_im_sdk.getLoginStatus(ParamsUtil.buildOperationID()).toInt()
    }

    fun getLoginUserID(): String {
        return Open_im_sdk.getLoginUserID()
    }

    fun uploadFile(base: OnBase<String>, listener: OnPutFileListener, putArgs: PutArgs) {
        Open_im_sdk.uploadFile(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(putArgs),
            _PutFileCallback(listener)
        )
    }

    fun uploadLogs(base: OnBase<String>, params: List<String>, line: Int, ex: String, progress: UploadLogProgress) {
        Open_im_sdk.uploadLogs(BaseImpl.stringBase(base), ParamsUtil.buildOperationID(),
            line.toLong(), ex, progress)
    }

    fun logs(base: OnBase<String>, logLevel: Long, file: String, line: Long, msg: String, err: String, keyAndValues: Array<String>) {
        // no-op
    }

    fun updateFcmToken(base: OnBase<String>, fcmToken: String, expireTime: Long) {
        Open_im_sdk.updateFcmToken(BaseImpl.stringBase(base), ParamsUtil.buildOperationID(), fcmToken, expireTime)
    }

    fun networkChanged() {
        Open_im_sdk.networkStatusChanged(object : Base {
            override fun onError(i: Int, s: String) {
            }

            override fun onSuccess(s: String) {
            }
        }, ParamsUtil.buildOperationID())
    }

    fun setCustomBusinessListener(customBusinessListener: OnCustomBusinessListener) {
        Open_im_sdk.setCustomBusinessListener(_CustomBusinessListener(customBusinessListener))
    }
}
