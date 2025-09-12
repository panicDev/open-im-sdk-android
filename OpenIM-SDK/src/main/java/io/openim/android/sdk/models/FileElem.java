package io.openim.android.sdk.models;

public class FileElem {
    /**
     * Local file path
     */
    private String filePath;
    /**
     * Unique ID
     */
    private String uuid;
    /**
     * OSS URL
     */
    private String sourceUrl;
    /**
     * File name
     */
    private String fileName;
    /**
     * File size
     */
    private long fileSize;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
}
