package io.openim.android.sdk.models;

import java.util.List;

public class AtTextElem {
    /**
     * Text content that includes @ mentions
     */
    private String text;
    /**
     * List of mentioned user IDs
     */
    private List<String> atUserList;
    /**
     * Details of mentioned users
     */
    public List<AtUserInfo> atUsersInfo;
    /**
     * Whether the current user was mentioned
     */
    private boolean isAtSelf;
    /**
     * Quoted message
     */
    private Message quoteMessage;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getAtUserList() {
        return atUserList;
    }

    public void setAtUserList(List<String> atUserList) {
        this.atUserList = atUserList;
    }

    public boolean isAtSelf() {
        return isAtSelf;
    }

    public void setAtSelf(boolean atSelf) {
        isAtSelf = atSelf;
    }

    public Message getQuoteMessage() {
        return quoteMessage;
    }

    public void setQuoteMessage(Message quoteMessage) {
        this.quoteMessage = quoteMessage;
    }
}
