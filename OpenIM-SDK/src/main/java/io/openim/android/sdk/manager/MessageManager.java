package io.openim.android.sdk.manager;


import android.util.ArrayMap;

import java.util.List;
import java.util.Map;

import io.openim.android.sdk.listener.BaseImpl;
import io.openim.android.sdk.listener.OnAdvanceMsgListener;
import io.openim.android.sdk.listener.OnBase;
import io.openim.android.sdk.listener.OnCustomBusinessListener;
import io.openim.android.sdk.listener.OnMessageKvInfoListener;
import io.openim.android.sdk.listener.OnMsgSendCallback;
import io.openim.android.sdk.listener._AdvanceMsgListener;
import io.openim.android.sdk.listener._CustomBusinessListener;
import io.openim.android.sdk.listener._MessageKvInfoListener;
import io.openim.android.sdk.listener._MsgSendProgressListener;
import io.openim.android.sdk.models.AdvancedMessage;
import io.openim.android.sdk.models.AtUserInfo;
import io.openim.android.sdk.models.CardElem;
import io.openim.android.sdk.models.FileElem;
import io.openim.android.sdk.models.Message;
import io.openim.android.sdk.models.OfflinePushInfo;
import io.openim.android.sdk.models.PictureInfo;
import io.openim.android.sdk.models.RichMessage;
import io.openim.android.sdk.models.SearchParams;
import io.openim.android.sdk.models.SearchResult;
import io.openim.android.sdk.models.SoundElem;
import io.openim.android.sdk.models.VideoElem;
import io.openim.android.sdk.enums.ViewType;
import io.openim.android.sdk.utils.CommonUtil;
import io.openim.android.sdk.utils.JsonUtil;
import io.openim.android.sdk.utils.ParamsUtil;
import open_im_sdk.Open_im_sdk;
import open_im_sdk_callback.Base;
/**
 * Provides message operations such as sending, local storage and read updates.
 */
public class MessageManager {
    /** Register listener for advanced message events. */
    public void setAdvancedMsgListener(OnAdvanceMsgListener listener) {
        Open_im_sdk.setAdvancedMsgListener(new _AdvanceMsgListener(listener));
    }
    public void sendMessage(OnMsgSendCallback base, Message message, String recvUid, String recvGid, OfflinePushInfo offlinePushInfo) {
        sendMessage(base, message, recvUid, recvGid, offlinePushInfo,false);
    }

    public void sendMessage(OnMsgSendCallback base, Message message, String recvUid, String recvGid, OfflinePushInfo offlinePushInfo, boolean isOnlineOnly) {
        Open_im_sdk.sendMessage(new _MsgSendProgressListener(base), ParamsUtil.buildOperationID(), JsonUtil.toString(message), recvUid, recvGid,
            JsonUtil.toString(offlinePushInfo), isOnlineOnly);
    }
    public void deleteMessageFromLocalStorage(String conversationID, String clientMsgID, OnBase<String> callBack) {
        Open_im_sdk.deleteMessageFromLocalStorage(BaseImpl.stringBase(callBack), ParamsUtil.buildOperationID(), conversationID, clientMsgID);
    }
    public void insertSingleMessageToLocalStorage(OnBase<String> base, Message message, String receiver, String sender) {
        Open_im_sdk.insertSingleMessageToLocalStorage(BaseImpl.stringBase(base), ParamsUtil.buildOperationID(), JsonUtil.toString(message), receiver, sender);
    }
    public void insertGroupMessageToLocalStorage(OnBase<String> base, Message message, String groupID, String senderID) {
        Open_im_sdk.insertGroupMessageToLocalStorage(BaseImpl.stringBase(base), ParamsUtil.buildOperationID(), JsonUtil.toString(message), groupID, senderID);
    }


//    /**
//     * id
//     *
//     * @param messageIDList id(clientMsgID)
//     * @param base          callback List<{@link Message}>
//     */
//    public void findMessages(OnBase<List<Message>> base, List<String> messageIDList) {
//        Open_im_sdk.findMessages(BaseImpl.arrayBase(base, Message.class), JsonUtil.toString(messageIDList));
//    }
    @Deprecated
    public void markMessagesAsReadByMsgID(String conversationID, List<String> clientMsgIDs, OnBase<String> callBack) {
        Open_im_sdk.markMessagesAsReadByMsgID(BaseImpl.stringBase(callBack), ParamsUtil.buildOperationID(), conversationID, JsonUtil.toString(clientMsgIDs));
    }
    public void markConversationMessageAsRead(String conversationID, OnBase<String> callback) {
        Open_im_sdk.markConversationMessageAsRead(BaseImpl.stringBase(callback), ParamsUtil.buildOperationID(), conversationID);
    }
    public void typingStatusUpdate(OnBase<String> base, String userID, String msgTip) {
        Open_im_sdk.typingStatusUpdate(BaseImpl.stringBase(base), ParamsUtil.buildOperationID(), userID, msgTip);
    }
    public Message createTextMessage(String text) {
        return parse(Open_im_sdk.createTextMessage(ParamsUtil.buildOperationID(), text));
    }
    public Message createTextAtMessage(String text, List<String> atUserIDList, List<AtUserInfo> atUserInfoList, Message quoteMessage) {
        return parse(Open_im_sdk.createTextAtMessage(ParamsUtil.buildOperationID(), text, JsonUtil.toString(atUserIDList), JsonUtil.toString(atUserInfoList),
            JsonUtil.toString(quoteMessage)));
    }
    public Message createImageMessage(String imagePath) {
        return parse(Open_im_sdk.createImageMessage(ParamsUtil.buildOperationID(), imagePath));
    }
    public Message createImageMessageFromFullPath(String imagePath) {
        return parse(Open_im_sdk.createImageMessageFromFullPath(ParamsUtil.buildOperationID(), imagePath));
    }
    public Message createSoundMessage(String soundPath, long duration) {
        return parse(Open_im_sdk.createSoundMessage(ParamsUtil.buildOperationID(), soundPath, duration));
    }
    public Message createSoundMessageFromFullPath(String soundPath, long duration) {
        return parse(Open_im_sdk.createSoundMessageFromFullPath(ParamsUtil.buildOperationID(), soundPath, duration));
    }
    public Message createVideoMessage(String videoPath, String videoType, long duration, String snapshotPath) {
        return parse(Open_im_sdk.createVideoMessage(ParamsUtil.buildOperationID(), videoPath, videoType, duration, snapshotPath));
    }
    public Message createVideoMessageFromFullPath(String videoPath, String videoType, long duration, String snapshotPath) {
        return parse(Open_im_sdk.createVideoMessageFromFullPath(ParamsUtil.buildOperationID(), videoPath, videoType, duration, snapshotPath));
    }
    public Message createFileMessage(String filePath, String fileName) {
        return parse(Open_im_sdk.createFileMessage(ParamsUtil.buildOperationID(), filePath, fileName));
    }
    public Message createFileMessageFromFullPath(String filePath, String fileName) {
        return parse(Open_im_sdk.createFileMessageFromFullPath(ParamsUtil.buildOperationID(), filePath, fileName));
    }
    public Message createMergerMessage(List<Message> messageList, String title, List<String> summaryList) {
        return parse(Open_im_sdk.createMergerMessage(ParamsUtil.buildOperationID(), JsonUtil.toString(messageList), title, JsonUtil.toString(summaryList)));
    }
    public Message createForwardMessage(Message message) {
        return parse(Open_im_sdk.createForwardMessage(ParamsUtil.buildOperationID(), JsonUtil.toString(message)));
    }
    public Message createLocationMessage(double latitude, double longitude, String description) {
        return parse(Open_im_sdk.createLocationMessage(ParamsUtil.buildOperationID(), description, longitude, latitude));
    }
    public Message createCustomMessage(String data, String extension, String description) {
        return parse(Open_im_sdk.createCustomMessage(ParamsUtil.buildOperationID(), data, extension, description));
    }
    public Message createQuoteMessage(String text, Message message) {
        return parse(Open_im_sdk.createQuoteMessage(ParamsUtil.buildOperationID(), text, JsonUtil.toString(message)));
    }
    public Message createCardMessage(CardElem cardElem) {
        return parse(Open_im_sdk.createCardMessage(ParamsUtil.buildOperationID(), JsonUtil.toString(cardElem)));
    }
    public Message createFaceMessage(long index, String data) {
        return parse(Open_im_sdk.createFaceMessage(ParamsUtil.buildOperationID(), index, data));
    }
    public void clearConversationAndDeleteAllMsg(String conversationID, OnBase<String> callBack) {
        Open_im_sdk.clearConversationAndDeleteAllMsg(BaseImpl.stringBase(callBack), ParamsUtil.buildOperationID(), conversationID);
    }
    public void searchLocalMessages(OnBase<SearchResult> base, String conversationID, List<String> keywordList, int keywordListMatchType,
                                    List<String> senderUserIDList, List<Integer> messageTypeList, int searchTimePosition, int searchTimePeriod, int pageIndex
        , int count) {

        Map<String, Object> map = new ArrayMap<>();
        map.put("conversationID", conversationID);
        map.put("keywordList", keywordList);
        map.put("keywordListMatchType", keywordListMatchType);
        map.put("senderUserIDList", senderUserIDList);
        map.put("messageTypeList", messageTypeList);
        map.put("searchTimePosition", searchTimePosition);
        map.put("searchTimePeriod", searchTimePeriod);
        map.put("pageIndex", pageIndex);
        map.put("count", count);
        Open_im_sdk.searchLocalMessages(BaseImpl.objectBase(base, SearchResult.class), ParamsUtil.buildOperationID(), JsonUtil.toString(map));
    }
    public void deleteMessageFromLocalAndSvr(String conversationID, String clientMsgID, OnBase<String> callBack) {
        Open_im_sdk.deleteMessage(BaseImpl.stringBase(callBack), ParamsUtil.buildOperationID(), conversationID, clientMsgID);
    }
    public void deleteAllMsgFromLocal(OnBase<String> base) {
        Open_im_sdk.deleteAllMsgFromLocal(BaseImpl.stringBase(base), ParamsUtil.buildOperationID());
    }
    public void deleteAllMsgFromLocalAndSvr(OnBase<String> base) {
        Open_im_sdk.deleteAllMsgFromLocalAndSvr(BaseImpl.stringBase(base), ParamsUtil.buildOperationID());
    }
    public void markMessageAsReadByConID(OnBase<String> callBack, String conversationID) {
        Open_im_sdk.markConversationMessageAsRead(BaseImpl.stringBase(callBack), ParamsUtil.buildOperationID(), conversationID);
    }
    public void revokeMessageV2(OnBase<String> callBack, String conversationID, String clientMsgID) {
        Open_im_sdk.revokeMessage(BaseImpl.stringBase(callBack), ParamsUtil.buildOperationID(), conversationID, clientMsgID);
    }
    public void getAdvancedHistoryMessageList(OnBase<AdvancedMessage> callBack, String conversationID, Message startMsg, int count, ViewType viewType) {
        Map<String, Object> map = new ArrayMap<>();
        map.put("conversationID", conversationID);
        if (null != startMsg) {
            map.put("startClientMsgID", startMsg.getClientMsgID());
        }
        map.put("count", count);
        map.put("viewType", viewType.getValue());

        Open_im_sdk.getAdvancedHistoryMessageList(new Base() {
            @Override
            public void onError(int i, String s) {
                CommonUtil.returnError(callBack, i, s);
            }

            @Override
            public void onSuccess(String s) {
                AdvancedMessage messageListSeq = JsonUtil.toObj(s, AdvancedMessage.class);
                CommonUtil.runMainThread(() -> {
                    if (null != callBack) callBack.onSuccess(messageListSeq);
                });
            }
        }, ParamsUtil.buildOperationID(), JsonUtil.toString(map));
    }
    public void getAdvancedHistoryMessageListReverse(OnBase<AdvancedMessage> callBack, String conversationID, Message startMsg, int count, ViewType viewType) {
        Map<String, Object> map = new ArrayMap<>();
        map.put("conversationID", conversationID);
        if (null != startMsg) {
            map.put("startClientMsgID", startMsg.getClientMsgID());
        }
        map.put("count", count);
        map.put("viewType", viewType.getValue());

        Open_im_sdk.getAdvancedHistoryMessageListReverse(new Base() {
            @Override
            public void onError(int i, String s) {
                CommonUtil.returnError(callBack, i, s);
            }

            @Override
            public void onSuccess(String s) {
                AdvancedMessage messageListSeq = JsonUtil.toObj(s, AdvancedMessage.class);
                CommonUtil.runMainThread(() -> {
                    if (null != callBack) callBack.onSuccess(messageListSeq);
                });
            }
        }, ParamsUtil.buildOperationID(), JsonUtil.toString(map));
    }
    public void findMessageList(OnBase<SearchResult> base, List<SearchParams> searchParams) {
//        Map<String, Object> map = new ArrayMap<>();
//        map.put("conversationID", conversationID);
//        map.put("clientMsgIDList", clientMsgIDList);

        Open_im_sdk.findMessageList(BaseImpl.objectBase(base, SearchResult.class), ParamsUtil.buildOperationID(), JsonUtil.toString(searchParams));
    }
    public Message createAdvancedTextMessage(String text, List<RichMessage> richList) {
        return parse(Open_im_sdk.createAdvancedTextMessage(ParamsUtil.buildOperationID(), text, JsonUtil.toString(richList)));
    }
    public Message createAdvancedQuoteMessage(String text, Message message, List<RichMessage> richList) {
        return parse(Open_im_sdk.createAdvancedQuoteMessage(ParamsUtil.buildOperationID(), text, JsonUtil.toString(message), JsonUtil.toString(richList)));
    }
    public void sendMessageNotOss(OnMsgSendCallback base, Message message, String recvUid, String recvGid, OfflinePushInfo offlinePushInfo) {
        sendMessageNotOss(base,message,recvUid,recvGid,offlinePushInfo,false);
    }

    public void sendMessageNotOss(OnMsgSendCallback base, Message message, String recvUid, String recvGid, OfflinePushInfo offlinePushInfo,boolean isOnlineOnly) {
        Open_im_sdk.sendMessageNotOss(new _MsgSendProgressListener(base), ParamsUtil.buildOperationID(), JsonUtil.toString(message), recvUid, recvGid,
            JsonUtil.toString(offlinePushInfo),isOnlineOnly);
    }
    public Message createImageMessageByURL(String sourcePath, PictureInfo sourcePicture, PictureInfo bigPicture, PictureInfo snapshotPicture) {
        return parse(Open_im_sdk.createImageMessageByURL(ParamsUtil.buildOperationID(), sourcePath, JsonUtil.toString(sourcePicture),
            JsonUtil.toString(bigPicture), JsonUtil.toString(snapshotPicture)));
    }
    public Message createSoundMessageByURL(SoundElem soundElem) {
        return parse(Open_im_sdk.createSoundMessageByURL(ParamsUtil.buildOperationID(), JsonUtil.toString(soundElem)));
    }
    public Message createVideoMessageByURL(VideoElem videoElem) {
        return parse(Open_im_sdk.createVideoMessageByURL(ParamsUtil.buildOperationID(), JsonUtil.toString(videoElem)));
    }
    public Message createFileMessageByURL(FileElem fileElem) {

        return parse(Open_im_sdk.createFileMessageByURL(ParamsUtil.buildOperationID(), JsonUtil.toString(fileElem)));
    }
    public void setMessageLocalEx(OnBase<String> callBack, String conversationID, String clientMsgID, String localEx) {
        Open_im_sdk.setMessageLocalEx(BaseImpl.stringBase(callBack), ParamsUtil.buildOperationID(), conversationID, clientMsgID, localEx);
    }
    public void setCustomBusinessListener(OnCustomBusinessListener listener) {
        Open_im_sdk.setCustomBusinessListener(new _CustomBusinessListener(listener));
    }

    public void setMessageKvInfoListener(OnMessageKvInfoListener listener) {
        Open_im_sdk.setMessageKvInfoListener(new _MessageKvInfoListener(listener));
    }


//    public void setOnListenerForService(OnListenerForService listener) {
//        Open_im_sdk.setListenerForService(new _ListenerForService(listener));
//    }

//    public void setMessageReactionExtensions(OnBase<List<TypeKeySetResult>> base, Message message, List<KeyValue> list) {
//        Open_im_sdk.setMessageReactionExtensions(BaseImpl.arrayBase(base, TypeKeySetResult.class), ParamsUtil.buildOperationID(), JsonUtil.toString(message),
//            JsonUtil.toString(list));
//    }

//    public void deleteMessageReactionExtensions(OnBase<List<TypeKeySetResult>> base, Message message, List<String> list) {
//        Open_im_sdk.deleteMessageReactionExtensions(BaseImpl.arrayBase(base, TypeKeySetResult.class), ParamsUtil.buildOperationID(),
//            JsonUtil.toString(message), JsonUtil.toString(list));
//    }
//
//    public void getMessageListReactionExtensions(OnBase<List<MessageTypeKeyMapping>> base, List<Message> messageList) {
//        Open_im_sdk.getMessageListReactionExtensions(BaseImpl.arrayBase(base, MessageTypeKeyMapping.class), ParamsUtil.buildOperationID(),
//            JsonUtil.toString(messageList));
//    }
//
//    public void addMessageReactionExtensions(OnBase<List<TypeKeySetResult>> base, Message message, List<KeyValue> list) {
//        Open_im_sdk.addMessageReactionExtensions(BaseImpl.arrayBase(base, TypeKeySetResult.class), ParamsUtil.buildOperationID(), JsonUtil.toString(message),
//            JsonUtil.toString(list));
//    }
//
//    public void getMessageListSomeReactionExtensions(OnBase<List<MessageTypeKeyMapping>> base, List<Message> messageList, List<KeyValue> kvList) {
//        Open_im_sdk.getMessageListSomeReactionExtensions(BaseImpl.arrayBase(base, MessageTypeKeyMapping.class), ParamsUtil.buildOperationID(),
//            JsonUtil.toString(messageList), JsonUtil.toString(kvList));
//    }

    static Message parse(String msg) {
        return JsonUtil.toObj(msg, Message.class);
    }
}
