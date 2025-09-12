package io.openim.android.sdk.models;

import java.util.List;

public class SignalingInvitationInfo {
    /**
     * Inviter user ID
     */
    private String inviterUserID;
    /**
     * List of invitee user IDs; only one for single chat
     */
    private List<String> inviteeUserIDList;
    /**
     * Empty string for one-on-one call
     */
    private String groupID;
    /**
     * Room ID, must be unique but optional
     */
    private String roomID;
    /**
     * Invitation timeout in seconds
     */
    private long timeout;
    /**
     * Start time in seconds
     */
    private long initiateTime;
    /**
     * "video" or "audio"
     */
    private String mediaType;
    /**
     * 1 for single chat, 2 for group chat
     */
    private int sessionType;
    /**
     * Same as previously defined
     */
    private int platformID;

    private String customData;

    public String getCustomData() {
        return customData;
    }

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    public String getInviterUserID() {
        return inviterUserID;
    }

    public void setInviterUserID(String inviterUserID) {
        this.inviterUserID = inviterUserID;
    }

    public List<String> getInviteeUserIDList() {
        return inviteeUserIDList;
    }

    public void setInviteeUserIDList(List<String> inviteeUserIDList) {
        this.inviteeUserIDList = inviteeUserIDList;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public long getInitiateTime() {
        return initiateTime;
    }

    public void setInitiateTime(long initiateTime) {
        this.initiateTime = initiateTime;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public int getSessionType() {
        return sessionType;
    }

    public void setSessionType(int sessionType) {
        this.sessionType = sessionType;
    }

    public int getPlatformID() {
        return platformID;
    }

    public void setPlatformID(int platformID) {
        this.platformID = platformID;
    }
}
