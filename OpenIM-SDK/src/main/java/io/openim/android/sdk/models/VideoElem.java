package io.openim.android.sdk.models;

public class VideoElem {
    /**
     * Local video file path
     */
    private String videoPath;
    /**
     * Unique video ID
     */
    private String videoUUID;
    /**
     * Video URL on OSS
     */
    private String videoUrl;
    /**
     * MIME type
     */
    private String videoType;
    /**
     * File size in bytes
     */
    private long videoSize;
    /**
     * Duration in seconds
     */
    private long duration;
    /**
     * Local snapshot file path
     */
    private String snapshotPath;
    /**
     * Unique snapshot ID
     */
    private String snapshotUUID;
    /**
     * Snapshot size in bytes
     */
    private long snapshotSize;
    /**
     * Snapshot URL on OSS
     */
    private String snapshotUrl;
    /**
     * Snapshot width in pixels
     */
    private int snapshotWidth;
    /**
     * Snapshot height in pixels
     */
    private int snapshotHeight;

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getVideoUUID() {
        return videoUUID;
    }

    public void setVideoUUID(String videoUUID) {
        this.videoUUID = videoUUID;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public long getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(long videoSize) {
        this.videoSize = videoSize;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getSnapshotPath() {
        return snapshotPath;
    }

    public void setSnapshotPath(String snapshotPath) {
        this.snapshotPath = snapshotPath;
    }

    public String getSnapshotUUID() {
        return snapshotUUID;
    }

    public void setSnapshotUUID(String snapshotUUID) {
        this.snapshotUUID = snapshotUUID;
    }

    public long getSnapshotSize() {
        return snapshotSize;
    }

    public void setSnapshotSize(long snapshotSize) {
        this.snapshotSize = snapshotSize;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public int getSnapshotWidth() {
        return snapshotWidth;
    }

    public void setSnapshotWidth(int snapshotWidth) {
        this.snapshotWidth = snapshotWidth;
    }

    public int getSnapshotHeight() {
        return snapshotHeight;
    }

    public void setSnapshotHeight(int snapshotHeight) {
        this.snapshotHeight = snapshotHeight;
    }
}
