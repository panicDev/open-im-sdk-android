package io.openim.android.sdk.models;

import java.util.List;

public class C2CReadReceiptInfo {
    /**
     * User ID
     */
    private String userID;
    /**
     * Group ID
     */
    private String groupID;
    /**
     * IDs of messages marked read
     */
    private List<String> msgIDList;
    /**
     * Read timestamp
     */
    private long readTime;
    /**
     * Flag for user-level (100) or system-level (200) message
     */
    private int msgFrom;
    /**
     * {@link io.openim.android.sdk.enums.MessageType}
     * Message type:
     * 101: text
     * 102: image
     * 103: audio
     * 104: video
     * 105: file
     * 106: @ mention
     * 107: merged
     * 108: forwarded
     * 109: location
     * 110: custom
     * 111: revoke receipt
     * 112: C2C read receipt
     * 113: typing status
     */
    private int contentType;
    /**
     * {@link io.openim.android.sdk.enums.ConversationType}
     * Session type: 1 single chat, 2 group chat
     */
    private int sessionType;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public List<String> getMsgIDList() {
        return msgIDList;
    }

    public void setMsgIDList(List<String> msgIDList) {
        this.msgIDList = msgIDList;
    }

    public long getReadTime() {
        return readTime;
    }

    public void setReadTime(long readTime) {
        this.readTime = readTime;
    }

    public int getMsgFrom() {
        return msgFrom;
    }

    public void setMsgFrom(int msgFrom) {
        this.msgFrom = msgFrom;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public int getSessionType() {
        return sessionType;
    }

    public void setSessionType(int sessionType) {
        this.sessionType = sessionType;
    }
}
