package io.openim.android.sdk.models;

public class SetGroupMemberInfo {
    /**
     * Group ID
     */
    private String groupID;
    /**
     * Member ID
     */
    private String userID;
    /**
     * Member nickname
     */
    private String nickname;
    /**
     * Member avatar URL
     */
    private String faceURL;
    /**
     * Member role: 1 member, 2 owner, 3 admin
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

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }
}
