package io.openim.android.sdk.listener;

import io.openim.android.sdk.models.UserInfo;
import io.openim.android.sdk.models.UsersOnlineStatus;

public interface OnUserListener {
    /**
     * Current user's profile updated; refresh avatar and nickname in UI
     */
    default void onSelfInfoUpdated(UserInfo info){}

    /**
     *  When the user's online status changes, call
     * @param onlineStatus
     */
   default void onUserStatusChanged(UsersOnlineStatus onlineStatus){}
}
