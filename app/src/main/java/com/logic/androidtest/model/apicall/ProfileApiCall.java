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

public class ProfileApiCall implements ProfileShow {


    @Override
    public void getProfile(Context context, String token, String empID, RequestCompleteListener callback) {
        APIService apiService= ApiUtils.getApiService(HttpParams.BASE_URL);
        apiService.getProfile("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIxIiwianRpIjoiMWU0YjVhODEyNmFlNThmMzY4ZTI1NzE5MGJlYzE4OWI2M2Q4YTE2Y2Q2YmE5Y2UzMmM3Mzc4MTRhZjFlZjFhODc0MTJiM2Q2NzllYzllN2IiLCJpYXQiOjE2MzAyOTkxMTguNzk5OTg4LCJuYmYiOjE2MzAyOTkxMTguNzk5OTk5LCJleHAiOjE2NjE4MzUxMTguNzc1NTg2LCJzdWIiOiIiLCJzY29wZXMiOltdfQ.FogD_5cQSXN74CY_jquD90lVjoPNJcWqzUx2tKsF0POd3ensysbjOU1eOgkwkwcf_F9bC0T_b8mSlsz9AUZFRYzShITg1pHl_C78LlD_-0lA5mwtGKVlvq7mn5kj1lYVzdUEbKX1xJNz8ELD8LyPuaFHZghVzCtSQyZh-XTb8bT9RBGwv7wDzYj5yn0RbHDzfB-U7NoScma_3MKNaK6gCBmV2uB71uFBO572iOz9GU1a0igKSXyOYWjlAig4XcRS3LB_yqTvkAgXfIK5O-PN8KjoIkHHUkE5EfHll5RkyySmYMorxud8XfLqIQ0RBY6WFasX5XYjPEb8XPGwkufzWSK7YUVhWR5AWrcIfTUH3X59jMFiGadpXtv0R92hwDtiEfCJ-yQVhLzwFeW3gnt7cr4iGFzZRmz1HF4sMtBolCrncyGEseoGWuO-gM9UCG7jvfoZ8z5F4vbZJzZ_anQGH5EpHc_H-xZty11b-IMFgJL0SdtVazPiA7MvQ1sVjJtj9lsmVgB8IFuWNVOvZlkjvf-pWwMUNwcCKp68rYoqo0iLdx-19LdQxtkMG-EXcDmluISL0WaWbfdvDHy_IGvaGItfEiefGATIpanwLbNwBIsChs54C3wY_v5u5FtUpxo6UzMZq-oPJbvQmAYKRN9AjsPVJoQDEapBZBEo1zI0Uvk",empID).enqueue(new Callback<ProfileModel>() {
            @Override
            public void onResponse(Call<ProfileModel> call, Response<ProfileModel> response) {
                if (response.isSuccessful()){
                    callback.onRequestSuccess(response.body());

                }else {
                    callback.onRequestFailed("xxLogin Failed!");
                }

            }

            @Override
            public void onFailure(Call<ProfileModel> call, Throwable t) {
                callback.onRequestFailed(t.getMessage());
                Log.e("LoginFailed", t.getLocalizedMessage());

            }
        });
    }
}