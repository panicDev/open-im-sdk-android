package io.openim.android.sdk.models;

public class UserInfoReq {
    /**
     * User ID
     */
    private String userID;
    /**
     * User nickname
     */
    private String nickname;
    /**
     * User avatar URL
     */
    private String faceURL;
    /**
     * Extra information
     */
    private String ex;
    /**
     * Global do-not-disturb: 1 block; 2 receive without alert; 0 normal
     */
    private Integer globalRecvMsgOpt;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFaceURL() {
        return faceURL;
    }

    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public Integer getGlobalRecvMsgOpt() {
        return globalRecvMsgOpt;
    }

    public void setGlobalRecvMsgOpt(Integer globalRecvMsgOpt) {
        this.globalRecvMsgOpt = globalRecvMsgOpt;
    }
}
