package com.logic.androidtest.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileModel {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data_list")
    @Expose
    private DataList dataList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataList getDataList() {
        return dataList;
    }

    public void setDataList(DataList dataList) {
        this.dataList = dataList;
    }
}
