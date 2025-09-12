package io.openim.android.sdk.models;

public class FriendApplicationInfo {
    /**
     * Applicant user ID
     */
    private String fromUserID;
    /**
     * Applicant nickname
     */
    private String fromNickname;
    /**
     * Applicant avatar URL
     */
    private String fromFaceURL;
    /**
     * Applicant gender
     */
    private int fromGender;
    /**
     * Receiver user ID
     */
    private String toUserID;
    /**
     * Receiver nickname
     */
    private String toNickname;
    /**
     * Receiver avatar URL
     */
    private String toFaceURL;
    /**
     * Receiver gender
     */
    private int toGender;
    /**
     * Handle result: 0 pending, 1 accepted, 2 rejected
     */
    private int handleResult;
    /**
     * Application message
     */
    private String reqMsg;
    /**
     * Creation time
     */
    private long createTime;
    /**
     * Handler user ID
     */
    private String handlerUserID;
    /**
     * Handler message
     */
    private String handleMsg;
    /**
     * Handle time
     */
    private long handleTime;
    /**
     * Extra field
     */
    private String ex;

    public String getFromUserID() {
        return fromUserID;
    }

    public void setFromUserID(String fromUserID) {
        this.fromUserID = fromUserID;
    }

    public String getFromNickname() {
        return fromNickname;
    }

    public void setFromNickname(String fromNickname) {
        this.fromNickname = fromNickname;
    }

    public String getFromFaceURL() {
        return fromFaceURL;
    }

    public void setFromFaceURL(String fromFaceURL) {
        this.fromFaceURL = fromFaceURL;
    }

    public int getFromGender() {
        return fromGender;
    }

    public void setFromGender(int fromGender) {
        this.fromGender = fromGender;
    }

    public String getToUserID() {
        return toUserID;
    }

    public void setToUserID(String toUserID) {
        this.toUserID = toUserID;
    }

    public String getToNickname() {
        return toNickname;
    }

    public void setToNickname(String toNickname) {
        this.toNickname = toNickname;
    }

    public String getToFaceURL() {
        return toFaceURL;
    }

    public void setToFaceURL(String toFaceURL) {
        this.toFaceURL = toFaceURL;
    }

    public int getToGender() {
        return toGender;
    }

    public void setToGender(int toGender) {
        this.toGender = toGender;
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

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getHandlerUserID() {
        return handlerUserID;
    }

    public void setHandlerUserID(String handlerUserID) {
        this.handlerUserID = handlerUserID;
    }

    public String getHandleMsg() {
        return handleMsg;
    }

    public void setHandleMsg(String handleMsg) {
        this.handleMsg = handleMsg;
    }

    public long getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(long handleTime) {
        this.handleTime = handleTime;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }
}
