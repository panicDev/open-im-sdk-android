package io.openim.android.sdk.models;

public class GroupMemberInfoReq {
    /**
     * Group ID
     */
    private String groupID;
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
     * Group role {@link io.openim.android.sdk.enums.GroupRole}
     */
    private Integer roleLevel;
    /**
     * Extra field
     */
    private String ex;

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

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

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }
}
