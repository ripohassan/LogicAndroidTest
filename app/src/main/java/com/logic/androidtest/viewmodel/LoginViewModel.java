package com.logic.androidtest.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.logic.androidtest.database.AppSessionManager;
import com.logic.androidtest.model.data.LoginModel;
import com.logic.androidtest.model.apicall.LoginShow;
import com.logic.androidtest.network.RequestCompleteListener;

public class LoginViewModel extends ViewModel {
    public MutableLiveData<Integer> loginIsSuccessLiveData = new MutableLiveData<>();
    public MutableLiveData<Boolean> progressLoginLiveData = new MutableLiveData<>();
    public MutableLiveData<String> loginResponseFailorLiveData = new MutableLiveData<>();


    public void getLogin(Context context, String username, String password, LoginShow model) {
        progressLoginLiveData.postValue(true);
        model.getLogin(context,  username,  password, new RequestCompleteListener() {
            @Override
            public void onRequestSuccess(Object obj) {
                progressLoginLiveData.postValue(false);
                loginIsSuccessLiveData.postValue(1);
                LoginModel data = (LoginModel) obj;
                loginResponseFailorLiveData.postValue(data.getStatus());
                AppSessionManager.setToken(context,data.getAccessToken());
            }

            @Override
            public void onRequestFailed(String errorMsg) {
                loginIsSuccessLiveData.postValue(0);
                progressLoginLiveData.postValue(false);
                loginResponseFailorLiveData.postValue(errorMsg);
            }
        });
    }



}
