package io.openim.android.sdk.models;

public class GroupApplicationInfo {
    /**
     * Group ID
     */
    private String groupID;
    /**
     * Group name
     */
    private String groupName;
    /**
     * Group notification
     */
    private String notification;
    /**
     * Group introduction
     */
    private String introduction;
    /**
     * Group avatar URL
     */
    private String groupFaceURL;
    /**
     * Creation time
     */
    private long createTime;
    /**
     * Status
     */
    private int status;
    /**
     * Creator ID
     */
    private String creatorUserID;
    /**
     * Group type
     */
    private int groupType;
    /**
     * Owner ID
     */
    private String ownerUserID;
    /**
     * Member count
     */
    private int memberCount;
    /**
     * Applicant ID
     */
    private String userID;
    /**
     * Applicant nickname
     */
    private String nickname;
    /**
     * Applicant avatar URL
     */
    private String userFaceURL;
    /**
     * Applicant gender
     */
    private int gender;
    /**
     * REFUSE = -1, AGREE = 1
     * -1 rejected, 1 approved
     */
    private int handleResult;
    /**
     * Application reason
     */
    private String reqMsg;
    /**
     * Handle result description
     */
    private String handledMsg;
    /**
     * Application time
     */
    private long reqTime;
    /**
     * Handler ID
     */
    private String handleUserID;
    /**
     * Handle time
     */
    private long handledTime;
    /**
     * Extra field
     */
    private String ex;

    /**
     * 2 invited, 3 searched, 4 via QR code
     */
    private int joinSource;

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

    public String getGroupFaceURL() {
        return groupFaceURL;
    }

    public void setGroupFaceURL(String groupFaceURL) {
        this.groupFaceURL = groupFaceURL;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
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

    public int getGroupType() {
        return groupType;
    }

    public void setGroupType(int groupType) {
        this.groupType = groupType;
    }

    public String getOwnerUserID() {
        return ownerUserID;
    }

    public void setOwnerUserID(String ownerUserID) {
        this.ownerUserID = ownerUserID;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
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

    public String getUserFaceURL() {
        return userFaceURL;
    }

    public void setUserFaceURL(String userFaceURL) {
        this.userFaceURL = userFaceURL;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(int handleResult) {
        this.handleResult = handleResult;
    }

    public String getReqMsg() {
        return reqMsg;
    }

    public void setReqMsg(String reqMsg) {
        this.reqMsg = reqMsg;
    }

    public String getHandledMsg() {
        return handledMsg;
    }

    public void setHandledMsg(String handledMsg) {
        this.handledMsg = handledMsg;
    }

    public long getReqTime() {
        return reqTime;
    }

    public void setReqTime(long reqTime) {
        this.reqTime = reqTime;
    }

    public String getHandleUserID() {
        return handleUserID;
    }

    public void setHandleUserID(String handleUserID) {
        this.handleUserID = handleUserID;
    }

    public long getHandledTime() {
        return handledTime;
    }

    public void setHandledTime(long handledTime) {
        this.handledTime = handledTime;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public int getJoinSource() {
        return joinSource;
    }

    public void setJoinSource(int joinSource) {
        this.joinSource = joinSource;
    }

    public String getInviterUserID() {
        return inviterUserID;
    }

    public void setInviterUserID(String inviterUserID) {
        this.inviterUserID = inviterUserID;
    }
}
