package com.logic.androidtest.network;

public interface RequestCompleteListener {
    void onRequestSuccess(Object obj);
    void onRequestFailed(String errorMsg);
}
