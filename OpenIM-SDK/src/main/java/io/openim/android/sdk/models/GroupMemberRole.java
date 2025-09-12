package io.openim.android.sdk.models;

public class GroupMemberRole {
    /**
     * Member ID
     */
    private String userID;
    /**
     * 1 member, 2 owner, 3 admin {@link io.openim.android.sdk.enums.GroupRole}
     */
    private int roleLevel;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }
}
