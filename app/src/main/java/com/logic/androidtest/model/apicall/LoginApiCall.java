package com.logic.androidtest.model.apicall;

import android.content.Context;
import android.util.Log;

import com.logic.androidtest.model.data.LoginModel;
import com.logic.androidtest.model.data.ProfileModel;
import com.logic.androidtest.network.APIService;
import com.logic.androidtest.network.ApiUtil.ApiUtils;
import com.logic.androidtest.network.HttpParams;
import com.logic.androidtest.network.RequestCompleteListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginApiCall implements LoginShow {
    @Override
    public void getLogin(Context context, String username, String password, RequestCompleteListener callback) {
        APIService apiService= ApiUtils.getApiService(HttpParams.BASE_URL);
        apiService.Login(username,password).enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                if (response.isSuccessful()){
                    callback.onRequestSuccess(response.body());

                }else {
                    callback.onRequestFailed("xxLogin Failed!");
                }

            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                callback.onRequestFailed(t.getMessage());
                Log.e("LoginFailed", t.getLocalizedMessage());

            }
        });
    }
}