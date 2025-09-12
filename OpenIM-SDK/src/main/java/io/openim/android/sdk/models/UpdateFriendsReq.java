package io.openim.android.sdk.models;

public class UpdateFriendsReq {
    /**
     * Operator user ID
     */
    private String ownerUserID;
    /**
     * IDs of friends to update
     */
    private String[] friendUserIDs;
    /**
     * Whether pinned to top
     */
    private Boolean isPinned;
    /**
     * Remark/alias
     */
    private String remark;
    /**
     * Extra field
     */
    private String ex;


    public String getOwnerUserID() {
        return ownerUserID;
    }

    protected void setOwnerUserID(String ownerUserID) {
        this.ownerUserID = ownerUserID;
    }

    public String[] getFriendUserIDs() {
        return friendUserIDs;
    }

    public void setFriendUserIDs(String[] friendUserIDs) {
        this.friendUserIDs = friendUserIDs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public Boolean getPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }
}
