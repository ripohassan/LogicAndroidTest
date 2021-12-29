package com.logic.androidtest.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataList {
    @SerializedName("emp_code")
    @Expose
    private String empCode;
    @SerializedName("employee_name")
    @Expose
    private String employeeName;
    @SerializedName("id_card_no")
    @Expose
    private String idCardNo;
    @SerializedName("religion_name")
    @Expose
    private String religionName;
    @SerializedName("blood_group_name")
    @Expose
    private String bloodGroupName;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("category_name")
    @Expose
    private String categoryName;
    @SerializedName("custom_designation")
    @Expose
    private String customDesignation;
    @SerializedName("department_name")
    @Expose
    private String departmentName;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getReligionName() {
        return religionName;
    }

    public void setReligionName(String religionName) {
        this.religionName = religionName;
    }

    public String getBloodGroupName() {
        return bloodGroupName;
    }

    public void setBloodGroupName(String bloodGroupName) {
        this.bloodGroupName = bloodGroupName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCustomDesignation() {
        return customDesignation;
    }

    public void setCustomDesignation(String customDesignation) {
        this.customDesignation = customDesignation;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
