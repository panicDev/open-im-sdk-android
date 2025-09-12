package io.openim.android.sdk.manager

import android.util.ArrayMap
import io.openim.android.sdk.listener.BaseImpl
import io.openim.android.sdk.listener.OnBase
import io.openim.android.sdk.listener.OnFriendshipListener
import io.openim.android.sdk.listener._FriendshipListener
import io.openim.android.sdk.models.FriendApplicationInfo
import io.openim.android.sdk.models.FriendInfo
import io.openim.android.sdk.models.FriendshipInfo
import io.openim.android.sdk.models.UpdateFriendsReq
import io.openim.android.sdk.models.UserInfo
import io.openim.android.sdk.utils.JsonUtil
import io.openim.android.sdk.utils.ParamsUtil
import open_im_sdk.Open_im_sdk

/**
 * Manager for friendship operations.
 */
class FriendshipManager {
    /** Set the friendship listener. */
    fun setOnFriendshipListener(listener: OnFriendshipListener) {
        Open_im_sdk.setFriendListener(_FriendshipListener(listener))
    }

    /**
     * Query friend info by user IDs.
     */
    @Deprecated("Use overloaded version with filterBlack")
    fun getFriendsInfo(base: OnBase<List<UserInfo>>, uidList: List<String>) {
        getFriendsInfo(base, uidList, null)
    }

    /**
     * Query friend info by user IDs with optional blacklist filtering.
     */
    fun getFriendsInfo(base: OnBase<List<UserInfo>>, uidList: List<String>, filterBlack: Boolean?) {
        Open_im_sdk.getSpecifiedFriendsInfo(
            BaseImpl.arrayBase(base, UserInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(uidList),
            filterBlack ?: false
        )
    }

    /** Send a friend request. */
    fun addFriend(base: OnBase<String>, uid: String, reqMessage: String) {
        val params: MutableMap<String, Any?> = ArrayMap()
        params["toUserID"] = uid
        params["reqMsg"] = reqMessage
        Open_im_sdk.addFriend(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(params)
        )
    }

    /**
     * Received friend applications.
     */
    fun getRecvFriendApplicationList(base: OnBase<List<FriendApplicationInfo>>) {
        Open_im_sdk.getFriendApplicationListAsRecipient(
            BaseImpl.arrayBase(base, FriendApplicationInfo::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    /**
     * Sent friend applications.
     */
    fun getSendFriendApplicationList(base: OnBase<List<FriendApplicationInfo>>) {
        Open_im_sdk.getFriendApplicationListAsApplicant(
            BaseImpl.arrayBase(base, FriendApplicationInfo::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    /**
     * Get the friend list.
     * Returned list may contain users in the blacklist; check `isInBlackList` field.
     */
    @Deprecated("Use overloaded version with filterBlack")
    fun getFriendList(base: OnBase<List<UserInfo>>) {
        getFriendList(base, null)
    }

    /**
     * Get the friend list with optional blacklist filtering.
     * Returned list may contain users in the blacklist; check `isInBlackList` field.
     */
    fun getFriendList(base: OnBase<List<UserInfo>>, filterBlack: Boolean?) {
        Open_im_sdk.getFriendList(
            BaseImpl.arrayBase(base, UserInfo::class.java),
            ParamsUtil.buildOperationID(),
            filterBlack ?: false
        )
    }

    /**
     * Paginated friend list.
     * Returned list may contain users in the blacklist; check `isInBlackList` field.
     */
    @Deprecated("Use overloaded version with filterBlack")
    fun getFriendListPage(base: OnBase<List<UserInfo>>, offset: Int, count: Int) {
        getFriendListPage(base, offset, count, null)
    }

    /**
     * Paginated friend list with optional blacklist filtering.
     */
    fun getFriendListPage(base: OnBase<List<UserInfo>>, offset: Int, count: Int, filterBlack: Boolean?) {
        Open_im_sdk.getFriendListPage(
            BaseImpl.arrayBase(base, UserInfo::class.java),
            ParamsUtil.buildOperationID(),
            offset,
            count,
            filterBlack ?: false
        )
    }

    /**
     * Update friend information.
     */
    fun updateFriendsReq(base: OnBase<String>, updateFriendsReq: UpdateFriendsReq) {
        Open_im_sdk.updateFriends(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toStringWithoutNull(updateFriendsReq)
        )
    }

    /**
     * Add user to blacklist.
     */
    fun addBlacklist(base: OnBase<String>, uid: String, ex: String? = null) {
        Open_im_sdk.addBlack(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            uid,
            ex
        )
    }

    /**
     * Get blacklist users.
     */
    fun getBlacklist(base: OnBase<List<UserInfo>>) {
        Open_im_sdk.getBlackList(
            BaseImpl.arrayBase(base, UserInfo::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    /**
     * Remove user from blacklist.
     */
    fun removeBlacklist(base: OnBase<String>, uid: String) {
        Open_im_sdk.removeBlack(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            uid
        )
    }

    /**
     * Check friendship status with specified users.
     */
    fun checkFriend(base: OnBase<List<FriendshipInfo>>, uidList: List<String>) {
        Open_im_sdk.checkFriend(
            BaseImpl.arrayBase(base, FriendshipInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(uidList)
        )
    }

    /**
     * Delete a friend.
     */
    fun deleteFriend(base: OnBase<String>, uid: String) {
        Open_im_sdk.deleteFriend(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            uid
        )
    }

    /**
     * Refuse a friend application.
     */
    fun refuseFriendApplication(base: OnBase<String>, uid: String, handleMsg: String) {
        val params: MutableMap<String, Any?> = ArrayMap()
        params["toUserID"] = uid
        params["handleMsg"] = handleMsg
        Open_im_sdk.refuseFriendApplication(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(params)
        )
    }

    /**
     * Accept a friend application.
     */
    fun acceptFriendApplication(base: OnBase<String>, uid: String, handleMsg: String) {
        val params: MutableMap<String, Any?> = ArrayMap()
        params["toUserID"] = uid
        params["handleMsg"] = handleMsg
        Open_im_sdk.acceptFriendApplication(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(params)
        )
    }

    /**
     * Search friends by keyword.
     */
    fun searchFriends(
        base: OnBase<List<FriendInfo>>,
        keywordList: List<String>,
        isSearchUserID: Boolean,
        isSearchNickname: Boolean,
        isSearchRemark: Boolean
    ) {
        val params: MutableMap<String, Any?> = ArrayMap()
        params["keywordList"] = keywordList
        params["isSearchUserID"] = isSearchUserID
        params["isSearchNickname"] = isSearchNickname
        params["isSearchRemark"] = isSearchRemark
        Open_im_sdk.searchFriends(
            BaseImpl.arrayBase(base, FriendInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(params)
        )
    }
}

