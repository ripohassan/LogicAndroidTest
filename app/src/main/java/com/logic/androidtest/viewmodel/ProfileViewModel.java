package com.logic.androidtest.viewmodel;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.logic.androidtest.model.apicall.ProfileShow;
import com.logic.androidtest.model.data.DataList;
import com.logic.androidtest.model.data.ProfileModel;
import com.logic.androidtest.network.RequestCompleteListener;

import java.util.Collections;
import java.util.List;

public class ProfileViewModel extends ViewModel {
    public MutableLiveData<DataList> savedListLiveData = new MutableLiveData<>();
    public MutableLiveData<Boolean> progressLiveData = new MutableLiveData<>();


    public void getProfile(Context context, String token, String empCode, ProfileShow model) {
        progressLiveData.postValue(true);
        model.getProfile(context,"Bearer "+token, empCode, new RequestCompleteListener() {
            @Override
            public void onRequestSuccess(Object obj) {
                ProfileModel data = (ProfileModel) obj;

                Toast.makeText(context, ""+data.getMessage(), Toast.LENGTH_SHORT).show();
                if (data.getDataList() != null)
                    savedListLiveData.postValue(data.getDataList());

                progressLiveData.postValue(false);
            }

            @Override
            public void onRequestFailed(String errorMsg) {
                progressLiveData.postValue(false);
            }
        });


    }
}