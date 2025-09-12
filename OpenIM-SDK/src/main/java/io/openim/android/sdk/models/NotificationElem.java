package io.openim.android.sdk.models;

public class NotificationElem {
    /**
     * Detailed notification content
     */
    private String detail;
    /**
     * Default notification text
     */
    private String defaultTips;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDefaultTips() {
        return defaultTips;
    }

    public void setDefaultTips(String defaultTips) {
        this.defaultTips = defaultTips;
    }
}
