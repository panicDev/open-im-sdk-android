package io.openim.android.sdk.listener;

import io.openim.android.sdk.models.UserInfo;

/**
 * Connection callbacks occur only after calling the SDK login method
 */
public interface OnConnListener {

    /**
     * Failed to connect to server; notify user the network is unavailable
     */
    default void onConnectFailed(int code, String error){}

    /**
     * Successfully connected to the server
     */
    default void onConnectSuccess(){}

    /**
     * Connecting to the server; suitable for showing a "connecting" state in the UI
     */
    default void onConnecting(){}

    /**
     * Current user kicked offline; inform user the account is logged in elsewhere
     */
    default void onKickedOffline(){}

    /**
     * Login token expired; use a newly issued UserSig to log in
     */
    default void onUserTokenExpired(){}

    /**
     * Login token invalid; use a newly issued UserSig to log in
     */
    default void onUserTokenInvalid(String s){}
}
