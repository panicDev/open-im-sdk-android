package io.openim.android.sdk.models;

public class FriendshipInfo {
    /**
     * User ID
     */
    private String userID;
    /**
     * 1 indicates friend and not blacklisted
     */
    private int result;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
