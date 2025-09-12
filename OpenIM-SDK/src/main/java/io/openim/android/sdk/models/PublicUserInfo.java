package io.openim.android.sdk.models;

public class PublicUserInfo {
    /**
     * User ID
     */
    private String userID;
    /**
     * Nickname
     */
    private String nickname;
    /**
     * Avatar URL
     */
    private String faceURL;
    /**
     * Extra field
     */
    private String ex;
    /**
     * Creation time
     */
    private Long createTime;

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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
}
