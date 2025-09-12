package io.openim.android.sdk.models;

public class GroupMembersInfo {
    /**
     * Group ID
     */
    private String groupID;
    /**
     * User ID
     */
    private String userID;
    /**
     * Nickname in group
     */
    private String nickname;
    /**
     * Avatar URL
     */
    private String faceURL;
    /**
     * Group role level
     */
    private int roleLevel;
    /**
     * Join time
     */
    private long joinTime;
    /**
     * Join source: 2 invited, 3 searched, 4 via QR code
     */
    private int joinSource;
    /**
     * Operator ID
     */
    private String operatorUserID;
    /**
     * Extra field
     */
    private String ex;
    /**
     * Mute end time
     */
    private long muteEndTime;

    /**
     * Inviter ID
     */
    private String inviterUserID;

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

    public String getFaceURL() {
        return faceURL;
    }

    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(long joinTime) {
        this.joinTime = joinTime;
    }

    public int getJoinSource() {
        return joinSource;
    }

    public void setJoinSource(int joinSource) {
        this.joinSource = joinSource;
    }

    public String getOperatorUserID() {
        return operatorUserID;
    }

    public void setOperatorUserID(String operatorUserID) {
        this.operatorUserID = operatorUserID;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public long getMuteEndTime() {
        return muteEndTime;
    }

    public void setMuteEndTime(long muteEndTime) {
        this.muteEndTime = muteEndTime;
    }

    public String getInviterUserID() {
        return inviterUserID;
    }

    public void setInviterUserID(String inviterUserID) {
        this.inviterUserID = inviterUserID;
    }
}
