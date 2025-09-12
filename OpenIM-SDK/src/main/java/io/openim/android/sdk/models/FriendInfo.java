package io.openim.android.sdk.models;

import java.util.Objects;

/**
 * Detailed friend information.
 */
public class FriendInfo {
    /** Friend user ID */
    private String userID;
    /** Friend nickname */
    private String nickname;
    /** Avatar URL */
    private String faceURL;
    /** Gender */
    private int gender;
    /** Phone number */
    private String phoneNumber;
    /** Birthday timestamp */
    private long birth;
    /** Email */
    private String email;
    /** Remark set by the user */
    private String remark;
    /** Extension field */
    private String ex;
    /** Creation time */
    private long createTime;
    /** Source of the friend addition */
    private int addSource;
    /** Operator user ID */
    private String operatorUserID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFaceURL() {
        return faceURL;
    }

    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getBirth() {
        return birth;
    }

    public void setBirth(long birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getAddSource() {
        return addSource;
    }

    public void setAddSource(int addSource) {
        this.addSource = addSource;
    }

    public String getOperatorUserID() {
        return operatorUserID;
    }

    public void setOperatorUserID(String operatorUserID) {
        this.operatorUserID = operatorUserID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FriendInfo)) return false;
        FriendInfo that = (FriendInfo) o;
        return Objects.equals(userID, that.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }
}
