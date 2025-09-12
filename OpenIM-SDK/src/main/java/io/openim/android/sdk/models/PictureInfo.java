package io.openim.android.sdk.models;

public class PictureInfo {
    /**
     * Unique ID
     */
    private String uuid;
    /**
     * Image type
     */
    private String type;
    /**
     * Image size
     */
    private long size;
    /**
     * Image width
     */
    private int width;
    /**
     * Image height
     */
    private int height;
    /**
     * Image URL
     */
    private String url;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
