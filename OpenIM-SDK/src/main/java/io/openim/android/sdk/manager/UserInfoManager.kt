package io.openim.android.sdk.manager

import android.util.ArrayMap
import io.openim.android.sdk.listener.BaseImpl
import io.openim.android.sdk.listener.OnBase
import io.openim.android.sdk.listener.OnUserListener
import io.openim.android.sdk.listener._UserListener
import io.openim.android.sdk.models.PublicUserInfo
import io.openim.android.sdk.models.UserInfo
import io.openim.android.sdk.models.UserInfoReq
import io.openim.android.sdk.models.UsersOnlineStatus
import io.openim.android.sdk.utils.JsonUtil
import io.openim.android.sdk.utils.ParamsUtil
import open_im_sdk.Open_im_sdk

/**
 * Manager for user information operations.
 */
class UserInfoManager {
    /** Set listener for current user profile changes. */
    fun setOnUserListener(listener: OnUserListener) {
        Open_im_sdk.setUserListener(_UserListener(listener))
    }

    /**
     * Query user info by user IDs.
     */
    fun getUsersInfo(base: OnBase<List<PublicUserInfo>>, uidList: List<String>) {
        Open_im_sdk.getUsersInfo(
            BaseImpl.arrayBase(base, PublicUserInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(uidList)
        )
    }

    /**
     * Query user info from cache. Deprecated; use [getUsersInfo].
     */
    @Deprecated("Use getUsersInfo")
    fun getUsersInfoWithCache(
        callBack: OnBase<List<UserInfo>>,
        uidList: List<String>,
        groupID: String?
    ) {
        Open_im_sdk.getUsersInfo(
            BaseImpl.arrayBase(callBack, UserInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(uidList)
        )
    }

    /**
     * Update profile for the current user.
     */
    fun setSelfInfo(
        base: OnBase<String>,
        nickname: String?,
        faceURL: String?,
        gender: Int,
        appMangerLevel: Int,
        phoneNumber: String?,
        birth: Long,
        email: String?,
        ex: String?
    ) {
        val map: MutableMap<String, Any?> = ArrayMap()
        map["nickname"] = nickname
        map["faceURL"] = faceURL
        map["gender"] = gender
        map["appMangerLevel"] = appMangerLevel
        map["phoneNumber"] = phoneNumber
        map["birth"] = birth
        map["email"] = email
        map["ex"] = ex
        Open_im_sdk.setSelfInfo(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(map)
        )
    }

    /**
     * Global message reception options.
     * status: 1 block, 2 receive without prompt, 0 normal
     */
    @Deprecated("Use setSelfInfo with UserInfoReq")
    fun setGlobalRecvMessageOpt(base: OnBase<String>, status: Long) {
        val userInfo = UserInfo()
        userInfo.globalRecvMsgOpt = status.toInt()
        Open_im_sdk.setSelfInfo(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toStringWithoutNull(userInfo)
        )
    }

    /**
     * Update current user profile via request object.
     */
    fun setSelfInfo(base: OnBase<String>, userInfoReq: UserInfoReq) {
        Open_im_sdk.setSelfInfo(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toStringWithoutNull(userInfoReq)
        )
    }

    /**
     * Get current user info.
     */
    fun getSelfUserInfo(base: OnBase<UserInfo>) {
        Open_im_sdk.getSelfUserInfo(
            BaseImpl.objectBase(base, UserInfo::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    /** Subscribe to users' online status. */
    fun subscribeUsersOnlineStatus(callBack: OnBase<List<UsersOnlineStatus>>, uid: List<String>) {
        Open_im_sdk.subscribeUsersStatus(
            BaseImpl.arrayBase(callBack, UsersOnlineStatus::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(uid)
        )
    }

    /** Stop receiving users' online status. */
    fun unsubscribeOnlineUsersStatus(callBack: OnBase<String>, uid: List<String>) {
        Open_im_sdk.subscribeUsersStatus(
            BaseImpl.stringBase(callBack),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(uid)
        )
    }

    /** Get online status for all subscribed users. */
    fun getSubscribeOnlineUsersStatus(callBack: OnBase<List<UsersOnlineStatus>>) {
        Open_im_sdk.getSubscribeUsersStatus(
            BaseImpl.arrayBase(callBack, UsersOnlineStatus::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    /** Get online status for specified users. */
    fun getUserStatus(callback: OnBase<List<UsersOnlineStatus>>, ids: List<String>) {
        Open_im_sdk.getUserStatus(
            BaseImpl.arrayBase(callback, UsersOnlineStatus::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(ids)
        )
    }
}

