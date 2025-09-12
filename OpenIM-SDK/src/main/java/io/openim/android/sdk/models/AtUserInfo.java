package io.openim.android.sdk.models;

/**
 * Mapping between user IDs and nicknames in @ messages
 */
public class AtUserInfo {
    /**
     * ID of the mentioned user
     */
    private String atUserID;
    /**
     * Nickname of the mentioned user
     */
    private String groupNickname;

    public String getAtUserID() {
        return atUserID;
    }

    public void setAtUserID(String atUserID) {
        this.atUserID = atUserID;
    }

    public String getGroupNickname() {
        return groupNickname;
    }

    public void setGroupNickname(String groupNickname) {
        this.groupNickname = groupNickname;
    }
}
