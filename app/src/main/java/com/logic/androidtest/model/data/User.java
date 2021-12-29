package com.logic.androidtest.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("emp_code")
    @Expose
    private String empCode;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("access_ip")
    @Expose
    private String accessIp;
    @SerializedName("access_proxy_ip")
    @Expose
    private String accessProxyIp;
    @SerializedName("expire_on")
    @Expose
    private String expireOn;
    @SerializedName("user_level")
    @Expose
    private String userLevel;
    @SerializedName("buyer_id")
    @Expose
    private String buyerId;
    @SerializedName("unit_id")
    @Expose
    private String unitId;
    @SerializedName("is_data_level_secured")
    @Expose
    private String isDataLevelSecured;
    @SerializedName("valid")
    @Expose
    private String valid;
    @SerializedName("self_service")
    @Expose
    private String selfService;
    @SerializedName("email_address")
    @Expose
    private String emailAddress;
    @SerializedName("company_id")
    @Expose
    private String companyId;
    @SerializedName("location_id")
    @Expose
    private String locationId;
    @SerializedName("division_id")
    @Expose
    private String divisionId;
    @SerializedName("department_id")
    @Expose
    private String departmentId;
    @SerializedName("section_id")
    @Expose
    private String sectionId;
    @SerializedName("subsection_id")
    @Expose
    private String subsectionId;
    @SerializedName("inserted_by")
    @Expose
    private String insertedBy;
    @SerializedName("insert_date")
    @Expose
    private String insertDate;
    @SerializedName("updated_by")
    @Expose
    private String updatedBy;
    @SerializedName("update_date")
    @Expose
    private String updateDate;
    @SerializedName("inserted_by_hr")
    @Expose
    private String insertedByHr;
    @SerializedName("updated_by_hr")
    @Expose
    private String updatedByHr;
    @SerializedName("user_full_name")
    @Expose
    private String userFullName;
    @SerializedName("security_code")
    @Expose
    private String securityCode;
    @SerializedName("designation_id")
    @Expose
    private String designationId;
    @SerializedName("api_token")
    @Expose
    private String apiToken;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public String getAccessProxyIp() {
        return accessProxyIp;
    }

    public void setAccessProxyIp(String accessProxyIp) {
        this.accessProxyIp = accessProxyIp;
    }

    public String getExpireOn() {
        return expireOn;
    }

    public void setExpireOn(String expireOn) {
        this.expireOn = expireOn;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getIsDataLevelSecured() {
        return isDataLevelSecured;
    }

    public void setIsDataLevelSecured(String isDataLevelSecured) {
        this.isDataLevelSecured = isDataLevelSecured;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getSelfService() {
        return selfService;
    }

    public void setSelfService(String selfService) {
        this.selfService = selfService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSubsectionId() {
        return subsectionId;
    }

    public void setSubsectionId(String subsectionId) {
        this.subsectionId = subsectionId;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

    public void setInsertedBy(String insertedBy) {
        this.insertedBy = insertedBy;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getInsertedByHr() {
        return insertedByHr;
    }

    public void setInsertedByHr(String insertedByHr) {
        this.insertedByHr = insertedByHr;
    }

    public String getUpdatedByHr() {
        return updatedByHr;
    }

    public void setUpdatedByHr(String updatedByHr) {
        this.updatedByHr = updatedByHr;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getDesignationId() {
        return designationId;
    }

    public void setDesignationId(String designationId) {
        this.designationId = designationId;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }
}
