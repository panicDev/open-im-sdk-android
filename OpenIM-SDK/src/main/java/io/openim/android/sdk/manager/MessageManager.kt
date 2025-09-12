package io.openim.android.sdk.manager

import android.util.ArrayMap
import io.openim.android.sdk.enums.ViewType
import io.openim.android.sdk.listener.*
import io.openim.android.sdk.models.*
import io.openim.android.sdk.utils.CommonUtil
import io.openim.android.sdk.utils.JsonUtil
import io.openim.android.sdk.utils.ParamsUtil
import open_im_sdk.Open_im_sdk
import open_im_sdk_callback.Base

class MessageManager {
    fun setAdvancedMsgListener(listener: OnAdvanceMsgListener) {
        Open_im_sdk.setAdvancedMsgListener(_AdvanceMsgListener(listener))
    }

    @JvmOverloads
    fun sendMessage(
        base: OnMsgSendCallback,
        message: Message,
        recvUid: String,
        recvGid: String,
        offlinePushInfo: OfflinePushInfo,
        isOnlineOnly: Boolean = false
    ) {
        Open_im_sdk.sendMessage(
            _MsgSendProgressListener(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(message),
            recvUid,
            recvGid,
            JsonUtil.toString(offlinePushInfo),
            isOnlineOnly
        )
    }

    fun deleteMessageFromLocalStorage(conversationID: String, clientMsgID: String, callBack: OnBase<String>) {
        Open_im_sdk.deleteMessageFromLocalStorage(
            BaseImpl.stringBase(callBack),
            ParamsUtil.buildOperationID(),
            conversationID,
            clientMsgID
        )
    }

    fun insertSingleMessageToLocalStorage(base: OnBase<String>, message: Message, receiver: String, sender: String) {
        Open_im_sdk.insertSingleMessageToLocalStorage(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(message),
            receiver,
            sender
        )
    }

    fun insertGroupMessageToLocalStorage(base: OnBase<String>, message: Message, groupID: String, senderID: String) {
        Open_im_sdk.insertGroupMessageToLocalStorage(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(message),
            groupID,
            senderID
        )
    }

    @Deprecated("use markConversationMessageAsRead instead")
    fun markMessagesAsReadByMsgID(conversationID: String, clientMsgIDs: List<String>, callBack: OnBase<String>) {
        Open_im_sdk.markMessagesAsReadByMsgID(
            BaseImpl.stringBase(callBack),
            ParamsUtil.buildOperationID(),
            conversationID,
            JsonUtil.toString(clientMsgIDs)
        )
    }

    fun markConversationMessageAsRead(conversationID: String, callback: OnBase<String>) {
        Open_im_sdk.markConversationMessageAsRead(
            BaseImpl.stringBase(callback),
            ParamsUtil.buildOperationID(),
            conversationID
        )
    }

    fun typingStatusUpdate(base: OnBase<String>, userID: String, msgTip: String) {
        Open_im_sdk.typingStatusUpdate(BaseImpl.stringBase(base), ParamsUtil.buildOperationID(), userID, msgTip)
    }

    fun createTextMessage(text: String): Message =
        parse(Open_im_sdk.createTextMessage(ParamsUtil.buildOperationID(), text))

    fun createTextAtMessage(
        text: String,
        atUserIDList: List<String>,
        atUserInfoList: List<AtUserInfo>,
        quoteMessage: Message?
    ): Message = parse(
        Open_im_sdk.createTextAtMessage(
            ParamsUtil.buildOperationID(),
            text,
            JsonUtil.toString(atUserIDList),
            JsonUtil.toString(atUserInfoList),
            JsonUtil.toString(quoteMessage)
        )
    )

    fun createImageMessage(imagePath: String): Message =
        parse(Open_im_sdk.createImageMessage(ParamsUtil.buildOperationID(), imagePath))

    fun createImageMessageFromFullPath(imagePath: String): Message =
        parse(Open_im_sdk.createImageMessageFromFullPath(ParamsUtil.buildOperationID(), imagePath))

    fun createSoundMessage(soundPath: String, duration: Long): Message =
        parse(Open_im_sdk.createSoundMessage(ParamsUtil.buildOperationID(), soundPath, duration))

    fun createSoundMessageFromFullPath(soundPath: String, duration: Long): Message =
        parse(Open_im_sdk.createSoundMessageFromFullPath(ParamsUtil.buildOperationID(), soundPath, duration))

    fun createVideoMessage(videoPath: String, videoType: String, duration: Long, snapshotPath: String): Message =
        parse(Open_im_sdk.createVideoMessage(ParamsUtil.buildOperationID(), videoPath, videoType, duration, snapshotPath))

    fun createVideoMessageFromFullPath(videoPath: String, videoType: String, duration: Long, snapshotPath: String): Message =
        parse(
            Open_im_sdk.createVideoMessageFromFullPath(
                ParamsUtil.buildOperationID(),
                videoPath,
                videoType,
                duration,
                snapshotPath
            )
        )

    fun createFileMessage(filePath: String, fileName: String): Message =
        parse(Open_im_sdk.createFileMessage(ParamsUtil.buildOperationID(), filePath, fileName))

    fun createFileMessageFromFullPath(filePath: String, fileName: String): Message =
        parse(Open_im_sdk.createFileMessageFromFullPath(ParamsUtil.buildOperationID(), filePath, fileName))

    fun createMergerMessage(messageList: List<Message>, title: String, summaryList: List<String>): Message =
        parse(
            Open_im_sdk.createMergerMessage(
                ParamsUtil.buildOperationID(),
                JsonUtil.toString(messageList),
                title,
                JsonUtil.toString(summaryList)
            )
        )

    fun createForwardMessage(message: Message): Message =
        parse(Open_im_sdk.createForwardMessage(ParamsUtil.buildOperationID(), JsonUtil.toString(message)))

    fun createLocationMessage(latitude: Double, longitude: Double, description: String): Message =
        parse(Open_im_sdk.createLocationMessage(ParamsUtil.buildOperationID(), description, longitude, latitude))

    fun createCustomMessage(data: String, extension: String, description: String): Message =
        parse(Open_im_sdk.createCustomMessage(ParamsUtil.buildOperationID(), data, extension, description))

    fun createQuoteMessage(text: String, message: Message): Message =
        parse(Open_im_sdk.createQuoteMessage(ParamsUtil.buildOperationID(), text, JsonUtil.toString(message)))

    fun createCardMessage(cardElem: CardElem): Message =
        parse(Open_im_sdk.createCardMessage(ParamsUtil.buildOperationID(), JsonUtil.toString(cardElem)))

    fun createFaceMessage(index: Long, data: String): Message =
        parse(Open_im_sdk.createFaceMessage(ParamsUtil.buildOperationID(), index, data))

    fun clearConversationAndDeleteAllMsg(conversationID: String, callBack: OnBase<String>) {
        Open_im_sdk.clearConversationAndDeleteAllMsg(
            BaseImpl.stringBase(callBack),
            ParamsUtil.buildOperationID(),
            conversationID
        )
    }

    fun searchLocalMessages(
        base: OnBase<SearchResult>,
        conversationID: String,
        keywordList: List<String>,
        keywordListMatchType: Int,
        senderUserIDList: List<String>,
        messageTypeList: List<Int>,
        searchTimePosition: Int,
        searchTimePeriod: Int,
        pageIndex: Int,
        count: Int
    ) {
        val map: MutableMap<String, Any> = ArrayMap()
        map["conversationID"] = conversationID
        map["keywordList"] = keywordList
        map["keywordListMatchType"] = keywordListMatchType
        map["senderUserIDList"] = senderUserIDList
        map["messageTypeList"] = messageTypeList
        map["searchTimePosition"] = searchTimePosition
        map["searchTimePeriod"] = searchTimePeriod
        map["pageIndex"] = pageIndex
        map["count"] = count
        Open_im_sdk.searchLocalMessages(
            BaseImpl.objectBase(base, SearchResult::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(map)
        )
    }

    fun deleteMessageFromLocalAndSvr(conversationID: String, clientMsgID: String, callBack: OnBase<String>) {
        Open_im_sdk.deleteMessage(
            BaseImpl.stringBase(callBack),
            ParamsUtil.buildOperationID(),
            conversationID,
            clientMsgID
        )
    }

    fun deleteAllMsgFromLocal(base: OnBase<String>) {
        Open_im_sdk.deleteAllMsgFromLocal(BaseImpl.stringBase(base), ParamsUtil.buildOperationID())
    }

    fun deleteAllMsgFromLocalAndSvr(base: OnBase<String>) {
        Open_im_sdk.deleteAllMsgFromLocalAndSvr(BaseImpl.stringBase(base), ParamsUtil.buildOperationID())
    }

    fun deleteMessageList(base: OnBase<String>, conversationID: String, clientMsgIDList: List<String>) {
        Open_im_sdk.deleteMessageList(
            BaseImpl.stringBase(base),
            ParamsUtil.buildOperationID(),
            conversationID,
            JsonUtil.toString(clientMsgIDList)
        )
    }

    fun setGlobalRecvMessageOpt(base: OnBase<String>, opt: Int) {
        Open_im_sdk.setGlobalRecvMessageOpt(BaseImpl.stringBase(base), ParamsUtil.buildOperationID(), opt)
    }

    fun getAdvancedHistoryMessageList(
        callBack: OnBase<AdvancedMessage>,
        conversationID: String,
        startMsg: Message?,
        count: Int
    ) {
        val map: MutableMap<String, Any> = ArrayMap()
        map["conversationID"] = conversationID
        startMsg?.clientMsgID?.let { map["startClientMsgID"] = it }
        map["count"] = count
        Open_im_sdk.getAdvancedHistoryMessageList(object : Base() {
            override fun onError(i: Int, s: String) {
                CommonUtil.returnError(callBack, i, s)
            }

            override fun onSuccess(s: String) {
                val messageListSeq = JsonUtil.toObj(s, AdvancedMessage::class.java)
                CommonUtil.runMainThread { callBack.onSuccess(messageListSeq) }
            }
        }, ParamsUtil.buildOperationID(), JsonUtil.toString(map))
    }

    fun getAdvancedHistoryMessageListReverse(
        callBack: OnBase<AdvancedMessage>,
        conversationID: String,
        startMsg: Message?,
        count: Int,
        viewType: ViewType
    ) {
        val map: MutableMap<String, Any> = ArrayMap()
        map["conversationID"] = conversationID
        startMsg?.clientMsgID?.let { map["startClientMsgID"] = it }
        map["count"] = count
        map["viewType"] = viewType.value
        Open_im_sdk.getAdvancedHistoryMessageListReverse(object : Base() {
            override fun onError(i: Int, s: String) {
                CommonUtil.returnError(callBack, i, s)
            }

            override fun onSuccess(s: String) {
                val messageListSeq = JsonUtil.toObj(s, AdvancedMessage::class.java)
                CommonUtil.runMainThread { callBack.onSuccess(messageListSeq) }
            }
        }, ParamsUtil.buildOperationID(), JsonUtil.toString(map))
    }

    fun findMessageList(base: OnBase<SearchResult>, searchParams: List<SearchParams>) {
        Open_im_sdk.findMessageList(
            BaseImpl.objectBase(base, SearchResult::class.java),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(searchParams)
        )
    }

    fun createAdvancedTextMessage(text: String, richList: List<RichMessage>): Message =
        parse(Open_im_sdk.createAdvancedTextMessage(ParamsUtil.buildOperationID(), text, JsonUtil.toString(richList)))

    fun createAdvancedQuoteMessage(text: String, message: Message, richList: List<RichMessage>): Message =
        parse(
            Open_im_sdk.createAdvancedQuoteMessage(
                ParamsUtil.buildOperationID(),
                text,
                JsonUtil.toString(message),
                JsonUtil.toString(richList)
            )
        )

    @JvmOverloads
    fun sendMessageNotOss(
        base: OnMsgSendCallback,
        message: Message,
        recvUid: String,
        recvGid: String,
        offlinePushInfo: OfflinePushInfo,
        isOnlineOnly: Boolean = false
    ) {
        Open_im_sdk.sendMessageNotOss(
            _MsgSendProgressListener(base),
            ParamsUtil.buildOperationID(),
            JsonUtil.toString(message),
            recvUid,
            recvGid,
            JsonUtil.toString(offlinePushInfo),
            isOnlineOnly
        )
    }

    fun createImageMessageByURL(
        sourcePath: String,
        sourcePicture: PictureInfo,
        bigPicture: PictureInfo,
        snapshotPicture: PictureInfo
    ): Message =
        parse(
            Open_im_sdk.createImageMessageByURL(
                ParamsUtil.buildOperationID(),
                sourcePath,
                JsonUtil.toString(sourcePicture),
                JsonUtil.toString(bigPicture),
                JsonUtil.toString(snapshotPicture)
            )
        )

    fun createSoundMessageByURL(soundElem: SoundElem): Message =
        parse(Open_im_sdk.createSoundMessageByURL(ParamsUtil.buildOperationID(), JsonUtil.toString(soundElem)))

    fun createVideoMessageByURL(videoElem: VideoElem): Message =
        parse(Open_im_sdk.createVideoMessageByURL(ParamsUtil.buildOperationID(), JsonUtil.toString(videoElem)))

    fun createFileMessageByURL(fileElem: FileElem): Message =
        parse(Open_im_sdk.createFileMessageByURL(ParamsUtil.buildOperationID(), JsonUtil.toString(fileElem)))

    fun setMessageLocalEx(callBack: OnBase<String>, conversationID: String, clientMsgID: String, localEx: String) {
        Open_im_sdk.setMessageLocalEx(
            BaseImpl.stringBase(callBack),
            ParamsUtil.buildOperationID(),
            conversationID,
            clientMsgID,
            localEx
        )
    }

    fun setCustomBusinessListener(listener: OnCustomBusinessListener) {
        Open_im_sdk.setCustomBusinessListener(_CustomBusinessListener(listener))
    }

    fun setMessageKvInfoListener(listener: OnMessageKvInfoListener) {
        Open_im_sdk.setMessageKvInfoListener(_MessageKvInfoListener(listener))
    }

    companion object {
        private fun parse(msg: String): Message {
            return JsonUtil.toObj(msg, Message::class.java)
        }
    }
}
