package io.openim.android.sdk.models;

import java.util.Objects;

public class UserInfo {
    /**
     * User ID
     */
    private String userID;
    /**
     * User name
     */
    private String nickname;
    /**
     * Avatar URL
     */
    private String faceURL;
    /**
     * Gender: 1 male, 2 female
     */
    private Integer gender;
    /**
     * Phone number
     */
    private String phoneNumber;
    /**
     * Birthday
     */
    private Long birth;
    /**
     * Email
     */
    private String email;
    /**
     * Extra field
     */
    private String ex;
    /**
     * Remark
     */
    private String remark;
    /**
     * Public info
     */
    private PublicUserInfo publicInfo;
    /**
     * Friend-only info
     */
    private FriendInfo friendInfo;
    /**
     * Blacklist info
     */
    private BlacklistInfo blackInfo;

    /**
     * Global do-not-disturb
     */
    private Integer globalRecvMsgOpt;

    // Whether allowed to add as friend: 1 yes, 2 no
    private Integer allowAddFriend;

    // New message beep: 1 on, 2 off
    private Integer allowBeep;

    // New message vibration: 1 on, 2 off
    private Integer allowVibration;

    // Login forbidden
    private Integer forbidden;

    // Creation time
    private Long createTime;

    public String getUserID() {
        if (null == userID) {
            if ((isFriendship())) {
                return friendInfo.getUserID();
            } else if (isBlacklist()) {
                return blackInfo.getUserID();
            } else if (null != publicInfo) {
                return publicInfo.getUserID();
            }
        }
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getNickname() {
        if (null == nickname) {
            if ((isFriendship())) {
                return friendInfo.getNickname();
            } else if (isBlacklist()) {
                return blackInfo.getNickname();
            } else if (null != publicInfo) {
                return publicInfo.getNickname();
            }
        }
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFaceURL() {
        if (null == faceURL) {
            if ((isFriendship())) {
                return friendInfo.getFaceURL();
            } else if (isBlacklist()) {
                return blackInfo.getFaceURL();
            } else if (null != publicInfo) {
                return publicInfo.getFaceURL();
            }
        }
        return faceURL;
    }

    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public Integer getGender() {
        if ((isFriendship())) {
            return friendInfo.getGender();
        } else if (isBlacklist()) {
            return blackInfo.getGender();
        }
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        if (null == phoneNumber) {
            if ((isFriendship())) {
                return friendInfo.getPhoneNumber();
            }
        }
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getBirth() {
        if ((isFriendship())) {
            return friendInfo.getBirth();
        }
        return birth;
    }

    public void setBirth(long birth) {
        this.birth = birth;
    }

    public String getEmail() {
        if (null == email) {
            if ((isFriendship())) {
                return friendInfo.getEmail();
            }
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEx() {
        if (null == ex) {
            if ((isFriendship())) {
                return friendInfo.getEx();
            } else if (isBlacklist()) {
                return blackInfo.getEx();
            }
        }
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public String getRemark() {
        if (null == remark) {
            if ((isFriendship())) {
                return friendInfo.getRemark();
            }
        }
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PublicUserInfo getPublicInfo() {
        return publicInfo;
    }

    public void setPublicInfo(PublicUserInfo publicInfo) {
        this.publicInfo = publicInfo;
    }

    public FriendInfo getFriendInfo() {
        return friendInfo;
    }

    public void setFriendInfo(FriendInfo friendInfo) {
        this.friendInfo = friendInfo;
    }

    public BlacklistInfo getBlackInfo() {
        return blackInfo;
    }

    public void setBlackInfo(BlacklistInfo blackInfo) {
        this.blackInfo = blackInfo;
    }

    /**
     * true if in blacklist
     */
    public boolean isBlacklist() {
        return null != blackInfo;
    }

    /**
     * true if friend
     */
    public boolean isFriendship() {
        return null != friendInfo;
    }

    public Integer getGlobalRecvMsgOpt() {
        return globalRecvMsgOpt;
    }

    public void setGlobalRecvMsgOpt(int globalRecvMsgOpt) {
        this.globalRecvMsgOpt = globalRecvMsgOpt;
    }

    public Integer getAllowAddFriend() {
        return allowAddFriend;
    }

    public void setAllowAddFriend(int allowAddFriend) {
        this.allowAddFriend = allowAddFriend;
    }

    public Integer getAllowBeep() {
        return allowBeep;
    }

    public void setAllowBeep(int allowBeep) {
        this.allowBeep = allowBeep;
    }

    public Integer getAllowVibration() {
        return allowVibration;
    }

    public void setAllowVibration(int allowVibration) {
        this.allowVibration = allowVibration;
    }

    public Integer getForbidden() {
        return forbidden;
    }

    public void setForbidden(int forbidden) {
        this.forbidden = forbidden;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInfo)) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(userID, userInfo.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }
}
