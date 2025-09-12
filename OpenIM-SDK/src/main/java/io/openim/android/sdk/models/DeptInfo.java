package io.openim.android.sdk.models;

/**
 * Department info
 */
public class DeptInfo {
    /**
     * Department ID
     */
    private String departmentID;
    /**
     * Avatar URL
     */
    private String faceURL;
    /**
     * Name
     */
    private String name;
    /**
     * Parent ID
     */
    private String parentID;
    /**
     * Order
     */
    private int order;
    /**
     * Department type
     */
    private int departmentType;
    /**
     * Creation time
     */
    private long createTime;
    /**
     * Number of sub-departments
     */
    private int subDepartmentNum;
    /**
     * Member count
     */
    private int memberNum;
    /**
     * Extra field
     */
    private String ex;
    /**
     * Attached info
     */
    private String attachedInfo;

    private String relatedGroupID;

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getFaceURL() {
        return faceURL;
    }

    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(int departmentType) {
        this.departmentType = departmentType;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getSubDepartmentNum() {
        return subDepartmentNum;
    }

    public void setSubDepartmentNum(int subDepartmentNum) {
        this.subDepartmentNum = subDepartmentNum;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
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

    public String getRelatedGroupID() {
        return relatedGroupID;
    }

    public void setRelatedGroupID(String relatedGroupID) {
        this.relatedGroupID = relatedGroupID;
    }
}
