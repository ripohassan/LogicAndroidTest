package com.logic.androidtest.model.apicall;

import android.content.Context;

import com.logic.androidtest.network.RequestCompleteListener;

public interface LoginShow {
    void getLogin (Context context, String email, String password, RequestCompleteListener callback);

}
