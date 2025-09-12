package io.openim.android.sdk.models;

public class ConversationReq {
    /**
     * Conversation ID
     */
    private String conversationID;
    /**
     * Conversation type: 1 single, 2 group
     */
    private Integer conversationType;
    /**
     * Peer user ID
     */
    private String userID;
    /**
     * Peer group ID
     */
    private String groupID;
    /**
     * Message receiving option:<br/>
     * 0: receive and push offline<br/>
     * 1: do not receive<br/>
     * 2: receive without offline push
     */
    private Integer recvMsgOpt;
    /**
     * Pinned to top
     */
    private Boolean isPinned;
    /**
     * Private chat enabled
     */
    private Boolean isPrivateChat;
    /**
     * Reserved field
     */
    private String ex;
    /**
     * Read duration in seconds; delete after burnDuration seconds
     */
    private Integer burnDuration;
    /**
     * Mention flag like @ messages or announcements {@link io.openim.android.sdk.enums.GroupAtType}
     */
    private Integer groupAtType;

    public String getConversationID() {
        return conversationID;
    }

    protected void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    public String getUserID() {
        return userID;
    }

    protected void setUserID(String userID) {
        this.userID = userID;
    }

    public String getGroupID() {
        return groupID;
    }

    protected void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public Boolean getPrivateChat() {
        return isPrivateChat;
    }

    public void setPrivateChat(boolean privateChat) {
        isPrivateChat = privateChat;
    }

    public Boolean getPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public Integer getConversationType() {
        return conversationType;
    }

    protected void setConversationType(int conversationType) {
        this.conversationType = conversationType;
    }

    public Integer getRecvMsgOpt() {
        return recvMsgOpt;
    }

    public void setRecvMsgOpt(int recvMsgOpt) {
        this.recvMsgOpt = recvMsgOpt;
    }

    public Integer getBurnDuration() {
        return burnDuration;
    }

    public void setBurnDuration(int burnDuration) {
        this.burnDuration = burnDuration;
    }

    public Integer getGroupAtType() {
        return groupAtType;
    }

    public void setGroupAtType(int groupAtType) {
        this.groupAtType = groupAtType;
    }
}
