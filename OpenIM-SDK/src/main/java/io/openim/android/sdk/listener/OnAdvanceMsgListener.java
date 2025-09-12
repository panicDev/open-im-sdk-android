package io.openim.android.sdk.listener;

import java.util.List;

import io.openim.android.sdk.models.C2CReadReceiptInfo;
import io.openim.android.sdk.models.GroupMessageReceipt;
import io.openim.android.sdk.models.KeyValue;
import io.openim.android.sdk.models.Message;
import io.openim.android.sdk.models.RevokedInfo;

/**
 * Message listener
 */
public interface OnAdvanceMsgListener {
    /**
     * New message received; add to list and refresh UI
     */
    default void onRecvNewMessage(Message msg){}

    /**
     * Peer read receipt; update UI read status
     */
    default void onRecvC2CReadReceipt(List<C2CReadReceiptInfo> list){}

    /**
     * Group member read receipt; update UI read status
     */
    default void onRecvGroupMessageReadReceipt(GroupMessageReceipt groupMessageReceipt){}

    /**
     * Message recalled by peer. Includes single chats, group chats, and admin recalls.
     * The new version only returns recall details via this callback and does not trigger onRecvNewMessage.
     */
    default void onRecvMessageRevokedV2(RevokedInfo info){}

    default void onRecvMessageExtensionsChanged(String msgID, List<KeyValue> list){}

    default void onRecvMessageExtensionsDeleted(String msgID, List<String> list){}

    default void onRecvMessageExtensionsAdded(String msgID, List<KeyValue> list){}

    /**
     * Message deleted
     * @param message Deleted message
     */
    default void onMsgDeleted(Message message){}

    default void onRecvOfflineNewMessage(List<Message> msg){}

    default void onRecvOnlineOnlyMessage(String s){};
}
