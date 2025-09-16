package io.openim.android.sdk.manager

import io.openim.android.sdk.listener.BaseImpl
import io.openim.android.sdk.listener.OnBase
import io.openim.android.sdk.listener.OnConversationListener
import io.openim.android.sdk.listener._ConversationListener
import io.openim.android.sdk.models.ConversationInfo
import io.openim.android.sdk.models.ConversationReq
import io.openim.android.sdk.utils.JsonUtil
import io.openim.android.sdk.utils.ParamsUtil
import open_im_sdk.Open_im_sdk

class ConversationManager {
    fun setOnConversationListener(listener: OnConversationListener) {
        Open_im_sdk.setConversationListener(_ConversationListener(listener))
    }

    fun getAllConversationList(base: OnBase<List<ConversationInfo>>) {
        Open_im_sdk.getAllConversationList(
            BaseImpl.arrayBase(base, ConversationInfo::class.java),
            ParamsUtil.buildOperationID()
        )
    }

    fun getConversationListSplit(base: OnBase<List<ConversationInfo>>, offset: Long, count: Long) {
        Open_im_sdk.getConversationListSplit(
            BaseImpl.arrayBase(base, ConversationInfo::class.java),
            ParamsUtil.buildOperationID(),
            offset,
            count
        )
    }

    fun getOneConversation(base: OnBase<ConversationInfo>, sourceId: String, sessionType: Int) {
        Open_im_sdk.getOneConversation(
            BaseImpl.objectBase(base, ConversationInfo::class.java),
            ParamsUtil.buildOperationID(),
            sessionType,
            sourceId
        )
    }

    fun getMultipleConversation(base: OnBase<List<ConversationInfo>>, conversationIDs: List<String>) {
        Open_im_sdk.getMultipleConversation(
            BaseImpl.arrayBase(base, ConversationInfo::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(conversationIDs)
        )
    }

    fun setConversationDraft(base: OnBase<String>, conversationID: String, draftText: String) {
        Open_im_sdk.setConversationDraft(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            conversationID,
            draftText
        )
    }

    fun hideConversation(base: OnBase<String>, conversationID: String) {
        Open_im_sdk.hideConversation(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            conversationID
        )
    }

    fun markGroupMessageHasRead(base: OnBase<String>, groupID: String) {
        Open_im_sdk.markConversationMessageAsRead(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            groupID
        )
    }

    fun getTotalUnreadMsgCount(base: OnBase<String>) {
        Open_im_sdk.getTotalUnreadMsgCount(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID()
        )
    }

    fun getConversationIDBySessionType(sourceId: String, sessionType: Int): String {
        return Open_im_sdk.getConversationIDBySessionType(
            ParamsUtil.buildOperationID(),
            sourceId,
            sessionType.toLong()
        )
    }

    fun changeInputStates(base: OnBase<String>, conversationId: String, hasFocus: Boolean) {
        Open_im_sdk.changeInputStates(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            conversationId,
            hasFocus
        )
    }

    fun getInputStates(base: OnBase<String>, conversationID: String, userId: String) {
        Open_im_sdk.getInputStates(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            conversationID,
            userId
        )
    }

    fun setConversation(base: OnBase<String>, conversationID: String, conversationReq: ConversationReq) {
        Open_im_sdk.setConversation(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            conversationID,
            JsonUtil.toStringWithoutNull(conversationReq)
        )
    }

    fun deleteConversationFromLocalAndSvr(base: OnBase<String>, conversionID: String) {
        Open_im_sdk.clearConversationAndDeleteAllMsg(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            conversionID
        )
    }

    fun deleteConversationAndDeleteAllMsg(base: OnBase<String>, conversionID: String) {
        Open_im_sdk.deleteConversationAndDeleteAllMsg(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            conversionID
        )
    }

    fun getAtAllTag(): String {
        return Open_im_sdk.getAtAllTag(ParamsUtil.buildOperationID())
    }

    fun simpleComparator(): Comparator<ConversationInfo> {
        return Comparator { a, b ->
            if ((a.isPinned && b.isPinned) || (!a.isPinned && !b.isPinned)) {
                val aCompare = maxOf(a.draftTextTime, a.latestMsgSendTime)
                val bCompare = maxOf(b.draftTextTime, b.latestMsgSendTime)
                bCompare.compareTo(aCompare)
            } else if (a.isPinned && !b.isPinned) {
                -1
            } else {
                1
            }
        }
    }
}
