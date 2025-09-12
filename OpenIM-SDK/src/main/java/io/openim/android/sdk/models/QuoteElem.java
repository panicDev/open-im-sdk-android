package io.openim.android.sdk.models;

public class QuoteElem {
    /**
     * Reply text
     */
    private String text;
    /**
     * Referenced message
     */
    private Message quoteMessage;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message getQuoteMessage() {
        return quoteMessage;
    }

    public void setQuoteMessage(Message quoteMessage) {
        this.quoteMessage = quoteMessage;
    }
}
