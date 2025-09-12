package io.openim.android.sdk.models;

public class GroupInfoReq {
    /**
     * Group ID
     */
    private String groupID;
    /**
     * Group name
     */
    private String groupName;
    /**
     * Group announcement
     */
    private String notification;
    /**
     * Group introduction
     */
    private String introduction;
    /**
     * Group avatar URL
     */
    private String faceURL;
    /**
     * Extension field
     */
    private String ex;
    /**
     * Join verification mode {@link io.openim.android.sdk.enums.GroupVerification}
     */
    private Integer needVerification;
    /**
     * Disallow fetching member info via group: 0 off, 1 on
     */
    private Integer lookMemberInfo;
    /**
     * Disallow adding friends via group: 0 off, 1 on
     */
    private Integer applyMemberFriend;

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

    public Integer getNeedVerification() {
        return needVerification;
    }

    public void setNeedVerification(Integer needVerification) {
        this.needVerification = needVerification;
    }

    public Integer getLookMemberInfo() {
        return lookMemberInfo;
    }

    public void setLookMemberInfo(Integer lookMemberInfo) {
        this.lookMemberInfo = lookMemberInfo;
    }

    public Integer getApplyMemberFriend() {
        return applyMemberFriend;
    }

    public void setApplyMemberFriend(Integer applyMemberFriend) {
        this.applyMemberFriend = applyMemberFriend;
    }
}
