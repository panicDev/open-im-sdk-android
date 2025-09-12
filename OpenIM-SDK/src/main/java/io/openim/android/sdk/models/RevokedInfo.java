package io.openim.android.sdk.models;

public class RevokedInfo {

    /**
     * ID of the user who recalled the message
     */
    private String revokerID;

    /**
     * Recaller's role in group {@link io.openim.android.sdk.enums.GroupRole}
     */
    private int revokerRole;

    /**
     * Recaller nickname
     */
    private String revokerNickname;
    /**
     * Message ID
     */
    private String clientMsgID;
    /**
     * Recall time
     */
    private long revokeTime;
    /**
     * Original send time
     */
    private long sourceMessageSendTime;
    /**
     * Original sender ID
     */
    private String sourceMessageSendID;
    /**
     * Original sender nickname
     */
    private String sourceMessageSenderNickname;
    /**
     * Conversation type {@link io.openim.android.sdk.enums.ConversationType}
     */
    private int sessionType;

    public String getRevokerID() {
        return revokerID;
    }

    public void setRevokerID(String revokerID) {
        this.revokerID = revokerID;
    }

    public int getRevokerRole() {
        return revokerRole;
    }

    public void setRevokerRole(int revokerRole) {
        this.revokerRole = revokerRole;
    }

    public String getRevokerNickname() {
        return revokerNickname;
    }

    public void setRevokerNickname(String revokerNickname) {
        this.revokerNickname = revokerNickname;
    }

    public String getClientMsgID() {
        return clientMsgID;
    }

    public void setClientMsgID(String clientMsgID) {
        this.clientMsgID = clientMsgID;
    }

    public long getRevokeTime() {
        return revokeTime;
    }

    public void setRevokeTime(long revokeTime) {
        this.revokeTime = revokeTime;
    }

    public long getSourceMessageSendTime() {
        return sourceMessageSendTime;
    }

    public void setSourceMessageSendTime(long sourceMessageSendTime) {
        this.sourceMessageSendTime = sourceMessageSendTime;
    }

    public String getSourceMessageSendID() {
        return sourceMessageSendID;
    }

    public void setSourceMessageSendID(String sourceMessageSendID) {
        this.sourceMessageSendID = sourceMessageSendID;
    }

    public String getSourceMessageSenderNickname() {
        return sourceMessageSenderNickname;
    }

    public void setSourceMessageSenderNickname(String sourceMessageSenderNickname) {
        this.sourceMessageSenderNickname = sourceMessageSenderNickname;
    }

    public int getSessionType() {
        return sessionType;
    }

    public void setSessionType(int sessionType) {
        this.sessionType = sessionType;
    }
}
