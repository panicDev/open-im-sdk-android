package io.openim.android.sdk.listener;

import java.util.List;

import io.openim.android.sdk.models.ConversationInfo;
/**
 * Conversation listener
 */
public interface OnConversationListener {
    /**
     * Conversation list updated; refresh the list if needed
     */
    default void onConversationChanged(List<ConversationInfo> list){}

    /**
     * New conversation added; refresh the list if needed
     */
    default void onNewConversation(List<ConversationInfo> list){}

    default void onSyncServerFailed(boolean reinstalled){}

    default void onSyncServerFinish(boolean reinstalled){}

    default void onSyncServerStart(boolean reinstalled){}

    default void onSyncServerProgress(long progress){}

    /**
     * Total unread message count changed
     */
    default void onTotalUnreadMessageCountChanged(int i){}

    default void onConversationUserInputStatusChanged(String s){};
}
