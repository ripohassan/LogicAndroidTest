package com.logic.androidtest.model.apicall;

import android.content.Context;

import com.logic.androidtest.network.RequestCompleteListener;

public interface ProfileShow {
    void getProfile (Context context, String token, String empID, RequestCompleteListener callback);

}
