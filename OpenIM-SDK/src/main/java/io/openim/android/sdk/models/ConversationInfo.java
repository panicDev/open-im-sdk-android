package io.openim.android.sdk.models;

import java.util.Objects;

public class ConversationInfo {
    /**
     * Conversation ID
     */
    private String conversationID;
    /**
     * Conversation type: 1 one-on-one, 2 group
     */
    private int conversationType;
    /**
     * Peer user ID
     */
    private String userID;
    /**
     * Peer group ID
     */
    private String groupID;
    /**
     * Display name of peer (user or group)
     */
    private String showName;
    /**
     * Avatar URL
     */
    private String faceURL;
    /**
     * Message receiving option:<br/>
     * 0: receive and push offline<br/>
     * 1: do not receive<br/>
     * 2: receive without offline push
     */
    private int recvMsgOpt;
    /**
     * Unread message count
     */
    private int unreadCount;
    /**
     * Mention flag such as @ messages or announcements {@link io.openim.android.sdk.enums.GroupAtType}
     */
    private int groupAtType;
    /**
     * Last message as JSON string
     */
    private String latestMsg;
    /**
     * Timestamp of last message (ms)
     */
    private long latestMsgSendTime;
    /**
     * Draft text
     */
    private String draftText;
    /**
     * Draft timestamp
     */
    private long draftTextTime;
    /**
     * Pinned to top
     */
    private boolean isPinned;
    /**
     * Whether private chat is enabled
     */
    private boolean isPrivateChat;
    /**
     * Reserved field
     */
    private String ext;
    /**
     * Reserved field
     */
    private String ex;
    /**
     * Whether still in group
     */
    private boolean isNotInGroup;

    /**
     * Read duration in seconds; message deleted after burnDuration seconds
     */
    private int burnDuration;

    /**
     * Scheduled delete time
     */
    private long msgDestructTime;
    /**
     * Whether scheduled deletion is enabled
     */
    private boolean isMsgDestruct;

    public long getMsgDestructTime() {
        return msgDestructTime;
    }

    public void setMsgDestructTime(long msgDestructTime) {
        this.msgDestructTime = msgDestructTime;
    }

    public boolean isMsgDestruct() {
        return isMsgDestruct;
    }

    public void setMsgDestruct(boolean msgDestruct) {
        isMsgDestruct = msgDestruct;
    }

    public String getConversationID() {
        return conversationID;
    }

    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    public int getConversationType() {
        return conversationType;
    }

    public void setConversationType(int conversationType) {
        this.conversationType = conversationType;
    }

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

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getFaceURL() {
        return faceURL;
    }

    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public int getRecvMsgOpt() {
        return recvMsgOpt;
    }

    public void setRecvMsgOpt(int recvMsgOpt) {
        this.recvMsgOpt = recvMsgOpt;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(int unreadCount) {
        this.unreadCount = unreadCount;
    }

    public int getGroupAtType() {
        return groupAtType;
    }

    public void setGroupAtType(int groupAtType) {
        this.groupAtType = groupAtType;
    }

    public String getLatestMsg() {
        return latestMsg;
    }

    public void setLatestMsg(String latestMsg) {
        this.latestMsg = latestMsg;
    }

    public long getLatestMsgSendTime() {
        return latestMsgSendTime;
    }

    public void setLatestMsgSendTime(long latestMsgSendTime) {
        this.latestMsgSendTime = latestMsgSendTime;
    }

    public String getDraftText() {
        return draftText;
    }

    public void setDraftText(String draftText) {
        this.draftText = draftText;
    }

    public long getDraftTextTime() {
        return draftTextTime;
    }

    public void setDraftTextTime(long draftTextTime) {
        this.draftTextTime = draftTextTime;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public boolean isPrivateChat() {
        return isPrivateChat;
    }

    public void setPrivateChat(boolean privateChat) {
        isPrivateChat = privateChat;
    }

    public boolean isNotInGroup() {
        return isNotInGroup;
    }

    public void setNotInGroup(boolean notInGroup) {
        isNotInGroup = notInGroup;
    }

    public int getBurnDuration() {
        return burnDuration;
    }

    public void setBurnDuration(int burnDuration) {
        this.burnDuration = burnDuration;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConversationInfo)) return false;
        ConversationInfo that = (ConversationInfo) o;
        return Objects.equals(conversationID, that.conversationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversationID);
    }
}
