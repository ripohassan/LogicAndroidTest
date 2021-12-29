package com.logic.androidtest.model.data;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginModel {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("token_type")
    @Expose
    private String tokenType;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("user_priviledge")
    @Expose
    private List<Object> userPriviledge = null;
    @SerializedName("expires_at")
    @Expose
    private String expiresAt;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Object> getUserPriviledge() {
        return userPriviledge;
    }

    public void setUserPriviledge(List<Object> userPriviledge) {
        this.userPriviledge = userPriviledge;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }
}
