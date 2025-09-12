package io.openim.android.sdk.models;

/**
 * Department member
 */
public class DeptMemberInfo {
    /**
     * Member ID
     */
    private String userID;
    /**
     * Nickname
     */
    private String nickname;
    /**
     * English name
     */
    private String englishName;
    /**
     * Avatar URL
     */
    private String faceURL;
    /**
     * Gender
     */
    private int gender;
    /**
     * Mobile number
     */
    private String mobile;
    /**
     * Telephone
     */
    private String telephone;
    /**
     * Birth date
     */
    private long birth;
    /**
     * Email
     */
    private String email;
    /**
     * Department ID
     */
    private String departmentID;
    /**
     * Order
     */
    private int order;
    /**
     * Position
     */
    private String position;
    /**
     * Leader flag
     */
    private int leader;
    /**
     * Status
     */
    private int status;
    /**
     * Creation time
     */
    private long createTime;
    /**
     * Entry time
     */
    private long entryTime;
    /**
     * Termination time
     */
    private long terminationTime;
    /**
     * Extra field
     */
    private String ex;
    /**
     * Attached info
     */
    private String attachedInfo;

    /**
     * Department info
     */
    private DeptMemberInfo department;

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

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getLeader() {
        return leader;
    }

    public void setLeader(int leader) {
        this.leader = leader;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public String getAttachedInfo() {
        return attachedInfo;
    }

    public void setAttachedInfo(String attachedInfo) {
        this.attachedInfo = attachedInfo;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public long getTerminationTime() {
        return terminationTime;
    }

    public void setTerminationTime(long terminationTime) {
        this.terminationTime = terminationTime;
    }

    public DeptMemberInfo getDepartment() {
        return department;
    }

    public void setDepartment(DeptMemberInfo department) {
        this.department = department;
    }
}
