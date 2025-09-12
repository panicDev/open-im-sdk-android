package io.openim.android.sdk.listener;


import io.openim.android.sdk.models.Message;

/**
 * Message send listener
 */
public interface OnMsgSendCallback extends OnBase<Message> {
    /**
     * Send failed
     */
    default void onError(int code, String error){}

    /**
     * Upload progress
     */
    default void onProgress(long progress){}

    /**
     * Send succeeded
     */
    default void onSuccess(Message s){}
}
