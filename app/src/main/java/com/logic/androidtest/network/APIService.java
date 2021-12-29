package com.logic.androidtest.network;
import com.logic.androidtest.model.data.LoginModel;
import com.logic.androidtest.model.data.ProfileModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface APIService {

    //For Login
    @POST(HttpParams.LoginUrl)
    @FormUrlEncoded
    Call<LoginModel> Login(@Field("user_name") String username,
                               @Field("password") String password);

    @POST(HttpParams.ProfileUrl)
    @FormUrlEncoded
    Call<ProfileModel> getProfile(
            @Header("Authorization") String userToken,
            @Field("emp_code") String emp_code);
}
