package io.openim.android.sdk.models;

public class SoundElem {
    /**
     * Unique ID
     */
    private String uuid;
    /**
     * Local file path
     */
    private String soundPath;
    /**
     * OSS URL
     */
    private String sourceUrl;
    /**
     * Audio size
     */
    private long dataSize;
    /**
     * Audio duration in seconds
     */
    private long duration;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSoundPath() {
        return soundPath;
    }

    public void setSoundPath(String soundPath) {
        this.soundPath = soundPath;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public long getDataSize() {
        return dataSize;
    }

    public void setDataSize(long dataSize) {
        this.dataSize = dataSize;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
