package io.openim.android.sdk.models;


public class NotDisturbInfo {
    /**
     * Conversation ID
     */
    private String conversationId;
    /**
     * Do-not-disturb status
     * 1 block messages; 2 receive without alert; 0 normal
     */
    private int result;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
