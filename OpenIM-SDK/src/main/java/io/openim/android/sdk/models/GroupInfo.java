package io.openim.android.sdk.models;

import java.util.Objects;

public class GroupInfo {
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
     * Group owner user ID
     */
    private String ownerUserID;
    /**
     * Creation time
     */
    private Long createTime;
    /**
     * Number of group members
     */
    private Integer memberCount;
    /**
     * Group status: ok = 0, blocked = 1, dismissed = 2, muted = 3
     */
    private Integer status;
    /**
     * Creator user ID
     */
    private String creatorUserID;
    /**
     * Group type
     */
    private Integer groupType;
    /**
     * Extension field
     */
    private String ex;
    /**
     * Join verification mode {@link io.openim.android.sdk.enums.GroupVerification}
     */
    private Integer needVerification;

    /**
     * Disallow retrieving member info via group: 0 off, 1 on
     */
    private Integer lookMemberInfo;
    /**
     * Disallow adding friends via group: 0 off, 1 on
     */
    private Integer applyMemberFriend;
    /**
     * Announcement update time
     */
    private Long notificationUpdateTime;
    /**
     * User who updated the announcement
     */
    private String notificationUserID;

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

    public String getOwnerUserID() {
        return ownerUserID;
    }

    public void setOwnerUserID(String ownerUserID) {
        this.ownerUserID = ownerUserID;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreatorUserID() {
        return creatorUserID;
    }

    public void setCreatorUserID(String creatorUserID) {
        this.creatorUserID = creatorUserID;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(int groupType) {
        this.groupType = groupType;
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

    public void setNeedVerification(int needVerification) {
        this.needVerification = needVerification;
    }

    public Integer getLookMemberInfo() {
        return lookMemberInfo;
    }

    public void setLookMemberInfo(int lookMemberInfo) {
        this.lookMemberInfo = lookMemberInfo;
    }

    public Integer getApplyMemberFriend() {
        return applyMemberFriend;
    }

    public void setApplyMemberFriend(int applyMemberFriend) {
        this.applyMemberFriend = applyMemberFriend;
    }

    public Long getNotificationUpdateTime() {
        return notificationUpdateTime;
    }

    public void setNotificationUpdateTime(long notificationUpdateTime) {
        this.notificationUpdateTime = notificationUpdateTime;
    }

    public String getNotificationUserID() {
        return notificationUserID;
    }

    public void setNotificationUserID(String notificationUserID) {
        this.notificationUserID = notificationUserID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupInfo)) return false;
        GroupInfo groupInfo = (GroupInfo) o;
        return Objects.equals(groupID, groupInfo.groupID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupID);
    }
}
