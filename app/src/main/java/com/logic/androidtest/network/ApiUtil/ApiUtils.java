package com.logic.androidtest.network.ApiUtil;

import android.util.Log;

import com.logic.androidtest.network.APIService;
import com.logic.androidtest.network.RetroClient;


public class ApiUtils {
    public static APIService getApiService(String baseURL){
        Log.d("responsedata", baseURL);
        return RetroClient.getClient(baseURL).create(APIService.class);
    }
}
