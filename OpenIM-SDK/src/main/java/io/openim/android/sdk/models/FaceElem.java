package io.openim.android.sdk.models;

/**
 * Emoji information
 */
public class FaceElem {
    /**
     * Built-in emoji set; use index to select the image
     */
    private int index;
    /**
     * Other emojis, such as by URL; load directly from the URL
     */
    private String data;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
