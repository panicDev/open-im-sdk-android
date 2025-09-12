package io.openim.android.sdk.manager

import android.util.ArrayMap
import io.openim.android.sdk.listener.BaseImpl
import io.openim.android.sdk.listener.OnBase
import io.openim.android.sdk.listener.OnGroupListener
import io.openim.android.sdk.listener._GroupListener
import io.openim.android.sdk.models.*
import io.openim.android.sdk.utils.JsonUtil
import io.openim.android.sdk.utils.ParamsUtil
import open_im_sdk.Open_im_sdk

class GroupManager {
    fun setOnGroupListener(listener: OnGroupListener) {
        Open_im_sdk.setGroupListener(_GroupListener(listener))
    }

    fun inviteUserToGroup(base: OnBase<String>, groupId: String, uidList: List<String>, reason: String) {
        Open_im_sdk.inviteUserToGroup(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            groupId,
            reason,
            JsonUtil.toString(uidList)
        )
    }

    fun kickGroupMember(base: OnBase<String>, groupId: String, uidList: List<String>, reason: String) {
        Open_im_sdk.kickGroupMember(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            groupId,
            reason,
            JsonUtil.toString(uidList)
        )
    }

    fun getGroupMembersInfo(base: OnBase<List<GroupMembersInfo>>, groupId: String, uidList: List<String>) {
        Open_im_sdk.getSpecifiedGroupMembersInfo(
            BaseImpl.arrayBase(base, GroupMembersInfo::class.java),
            ParamsUtil.buildOperationID(),
            groupId,
            JsonUtil.toString(uidList)
        )
    }

    fun getGroupMemberList(base: OnBase<List<GroupMembersInfo>>, groupId: String, filter: Int, offset: Int, count: Int) {
        Open_im_sdk.getGroupMemberList(
            BaseImpl.arrayBase(base, GroupMembersInfo::class.java),
            ParamsUtil.buildOperationID(),
            groupId,
            filter,
            offset,
            count
        )
    }

    fun getUsersInGroup(base: OnBase<List<String>>, groupID: String, userIdList: List<String>) {
        Open_im_sdk.getUsersInGroup(
            BaseImpl.arrayBase(base, String::class.java),
            ParamsUtil.buildOperationID(),
            groupID,
            JsonUtil.toString(userIdList)
        )
    }

    fun getJoinedGroupList(base: OnBase<List<GroupInfo>>) {
        Open_im_sdk.getJoinedGroupList(
            BaseImpl.arrayBase(base, GroupInfo::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    fun getJoinedGroupListPage(base: OnBase<List<GroupInfo>>, offset: Int, count: Int) {
        Open_im_sdk.getJoinedGroupListPage(
            BaseImpl.arrayBase(base, GroupInfo::class.java),
            ParamsUtil.buildOperationID(),
            offset,
            count
        )
    }

    fun createGroup(
        memberUserIDs: List<String>,
        adminUserIDs: List<String>,
        groupInfo: GroupInfo,
        ownerUserID: String,
        callBack: OnBase<GroupInfo>
    ) {
        val map = ArrayMap<String, Any?>()
        map["memberUserIDs"] = memberUserIDs
        map["groupInfo"] = groupInfo
        map["adminUserIDs"] = adminUserIDs
        map["ownerUserID"] = ownerUserID
        Open_im_sdk.createGroup(
            BaseImpl.objectBase(callBack, GroupInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(map)
        )
    }

    fun setGroupInfo(groupInfo: GroupInfo, callBack: OnBase<String>) {
        Open_im_sdk.setGroupInfo(
            BaseImpl.stringBase(callBack),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(groupInfo)
        )
    }

    fun getGroupsInfo(base: OnBase<List<GroupInfo>>, gidList: List<String>) {
        Open_im_sdk.getSpecifiedGroupsInfo(
            BaseImpl.arrayBase(base, GroupInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(gidList)
        )
    }

    fun joinGroup(base: OnBase<String>, gid: String, reason: String, joinSource: Int, ex: String? = null) {
        Open_im_sdk.joinGroup(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            gid,
            reason,
            joinSource,
            ex
        )
    }

    fun quitGroup(base: OnBase<String>, gid: String) {
        Open_im_sdk.quitGroup(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            gid
        )
    }

    fun transferGroupOwner(base: OnBase<String>, gid: String, uid: String) {
        Open_im_sdk.transferGroupOwner(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            gid,
            uid
        )
    }

    fun getRecvGroupApplicationList(base: OnBase<List<GroupApplicationInfo>>) {
        Open_im_sdk.getGroupApplicationListAsRecipient(
            BaseImpl.arrayBase(base, GroupApplicationInfo::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    fun getSendGroupApplicationList(base: OnBase<List<GroupApplicationInfo>>) {
        Open_im_sdk.getGroupApplicationListAsApplicant(
            BaseImpl.arrayBase(base, GroupApplicationInfo::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    fun acceptGroupApplication(base: OnBase<String>, gid: String, uid: String, handleMsg: String) {
        Open_im_sdk.acceptGroupApplication(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            gid,
            uid,
            handleMsg
        )
    }

    fun refuseGroupApplication(base: OnBase<String>, gid: String, uid: String, handleMsg: String) {
        Open_im_sdk.refuseGroupApplication(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            gid,
            uid,
            handleMsg
        )
    }

    fun dismissGroup(base: OnBase<String>, gid: String) {
        Open_im_sdk.dismissGroup(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            gid
        )
    }

    fun changeGroupMute(base: OnBase<String>, gid: String, mute: Boolean) {
        Open_im_sdk.changeGroupMute(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            gid,
            mute
        )
    }

    fun changeGroupMemberMute(base: OnBase<String>, gid: String, uid: String, seconds: Long) {
        Open_im_sdk.changeGroupMemberMute(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            gid,
            uid,
            seconds
        )
    }

    fun searchGroups(
        base: OnBase<List<GroupInfo>>,
        keywordList: List<String>,
        isSearchGroupID: Boolean,
        isSearchGroupName: Boolean
    ) {
        val map = ArrayMap<String, Any?>()
        map["keywordList"] = keywordList
        map["isSearchGroupID"] = isSearchGroupID
        map["isSearchGroupName"] = isSearchGroupName
        Open_im_sdk.searchGroups(
            BaseImpl.arrayBase(base, GroupInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(map)
        )
    }

    fun setGroupMemberInfo(setGroupMemberInfo: SetGroupMemberInfo, base: OnBase<String>) {
        Open_im_sdk.setGroupMemberInfo(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toStringWithoutNull(setGroupMemberInfo)
        )
    }

    fun getGroupMemberListByJoinTime(
        base: OnBase<List<GroupMembersInfo>>,
        groupID: String,
        offset: Int,
        count: Int,
        joinTimeBegin: Long,
        joinTimeEnd: Long,
        excludeUserIDList: List<String>
    ) {
        Open_im_sdk.getGroupMemberListByJoinTimeFilter(
            BaseImpl.arrayBase(base, GroupMembersInfo::class.java),
            ParamsUtil.buildOperationID(),
            groupID,
            offset,
            count,
            joinTimeBegin,
            joinTimeEnd,
            JsonUtil.toString(excludeUserIDList)
        )
    }

    fun getGroupMemberOwnerAndAdmin(base: OnBase<List<GroupMembersInfo>>, groupID: String) {
        Open_im_sdk.getGroupMemberOwnerAndAdmin(
            BaseImpl.arrayBase(base, GroupMembersInfo::class.java),
            ParamsUtil.buildOperationID(),
            groupID
        )
    }

    fun searchGroupMembers(
        base: OnBase<List<GroupMembersInfo>>,
        groupID: String,
        keywordList: List<String>,
        isSearchUserID: Boolean,
        isSearchMemberNickname: Boolean,
        offset: Int,
        count: Int
    ) {
        val map = ArrayMap<String, Any?>()
        map["groupID"] = groupID
        map["keywordList"] = keywordList
        map["isSearchUserID"] = isSearchUserID
        map["isSearchMemberNickname"] = isSearchMemberNickname
        map["offset"] = offset
        map["count"] = count
        Open_im_sdk.searchGroupMembers(
            BaseImpl.arrayBase(base, GroupMembersInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(map)
        )
    }

    fun isJoinGroup(gid: String, callBack: OnBase<Boolean>) {
        Open_im_sdk.isJoinGroup(
            BaseImpl.objectBase(callBack, Boolean::class.java),
            ParamsUtil.buildOperationID(),
            gid
        )
    }
}
