package io.openim.android.sdk.models;

import java.io.Serializable;

public class AttachedInfoElem implements Serializable {
    /**
     * Detailed group read info
     */
    private GroupHasReadInfo groupHasReadInfo;
    /**
     * Whether it's a private (self-destruct) message
     */
    private boolean isPrivateChat;
    /**
     * Message read time
     */
    private long hasReadTime;
    /**
     * Reading duration in seconds
     * Message is deleted burnDuration seconds after hasReadTime
     */
    private int burnDuration;

    private boolean notSenderNotificationPush;
    private boolean isEncryption;
    private boolean inEncryptStatus;

    public boolean isNotSenderNotificationPush() {
        return notSenderNotificationPush;
    }

    public void setNotSenderNotificationPush(boolean notSenderNotificationPush) {
        this.notSenderNotificationPush = notSenderNotificationPush;
    }

    public boolean isEncryption() {
        return isEncryption;
    }

    public void setEncryption(boolean encryption) {
        isEncryption = encryption;
    }

    public boolean isInEncryptStatus() {
        return inEncryptStatus;
    }

    public void setInEncryptStatus(boolean inEncryptStatus) {
        this.inEncryptStatus = inEncryptStatus;
    }

    public GroupHasReadInfo getGroupHasReadInfo() {
        return groupHasReadInfo;
    }

    public void setGroupHasReadInfo(GroupHasReadInfo groupHasReadInfo) {
        this.groupHasReadInfo = groupHasReadInfo;
    }

    public boolean isPrivateChat() {
        return isPrivateChat;
    }

    public void setPrivateChat(boolean privateChat) {
        isPrivateChat = privateChat;
    }

    public long getHasReadTime() {
        return hasReadTime;
    }

    public void setHasReadTime(long hasReadTime) {
        this.hasReadTime = hasReadTime;
    }

    public int getBurnDuration() {
        return burnDuration;
    }

    public void setBurnDuration(int burnDuration) {
        this.burnDuration = burnDuration;
    }
}
