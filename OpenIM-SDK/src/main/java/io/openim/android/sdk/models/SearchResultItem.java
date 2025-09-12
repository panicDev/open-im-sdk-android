package io.openim.android.sdk.models;

import java.util.List;

public class SearchResultItem {

    /**
     * Conversation ID
     */
    private String conversationID;

    /**
     * Message count in this conversation
     */
    private int messageCount;

    /**
     * Display name
     */
    public String showName;

    /**
     * Avatar URL
     */
    public String faceURL;


    /**
     * List of messages
     */
    private List<Message> messageList;

    public String getConversationID() {
        return conversationID;
    }

    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
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
}
