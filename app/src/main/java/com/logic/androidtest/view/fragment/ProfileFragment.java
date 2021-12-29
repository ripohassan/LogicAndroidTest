package com.logic.androidtest.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.afollestad.materialdialogs.MaterialDialog;
import com.logic.androidtest.R;
import com.logic.androidtest.database.AppSessionManager;
import com.logic.androidtest.model.apicall.ProfileApiCall;
import com.logic.androidtest.model.data.DataList;
import com.logic.androidtest.viewmodel.LoginViewModel;
import com.logic.androidtest.viewmodel.ProfileViewModel;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {
    TextView  empName,id_card_no,religion_name,blood_group_name,company_name,
            category_name,custom_designation,department_name;
    ProfileApiCall profileApiCall;
    ProfileViewModel profileView;

    MaterialDialog dialog;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        initVariables();
        initView(rootView);
        initFunction();
        return  rootView;
    }

    private void initVariables() {
        profileApiCall = new ProfileApiCall();
        profileView = new ViewModelProvider(this).get(ProfileViewModel.class);

    }

    private void initView(View rootView) {
        empName = rootView.findViewById(R.id.emp_name);
        id_card_no = rootView.findViewById(R.id.id_card_no);
        religion_name = rootView.findViewById(R.id.religion_name);
        blood_group_name = rootView.findViewById(R.id.blood_group_name);
        company_name = rootView.findViewById(R.id.company_name);
        category_name = rootView.findViewById(R.id.category_name);
        custom_designation = rootView.findViewById(R.id.custom_designation);
        department_name = rootView.findViewById(R.id.department_name);


        dialog = new MaterialDialog.Builder(getActivity()).title("Loading")
                .content("Please Wait . . .")
                .progress(true, 0)
                .cancelable(false)
                .build();
    }

    private void initFunction() {
        profileView.getProfile(getActivity(), AppSessionManager.GetToken(getActivity()),"53",profileApiCall);



        profileView.progressLiveData.observe(getActivity(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                if (aBoolean){
                    dialog.show();
                }else {
                    dialog.dismiss();
                }
            }
        });

        profileView.savedListLiveData.observe(getActivity(), new Observer<DataList>() {
            @Override
            public void onChanged(DataList dataList) {
                setAllData(dataList);
            }
        });

    }

    private void setAllData(DataList dataList) {
        empName.setText(dataList.getEmployeeName());
        id_card_no.setText(dataList.getIdCardNo());
        religion_name.setText(dataList.getReligionName());
        blood_group_name.setText(dataList.getBloodGroupName());
        company_name.setText(dataList.getCompanyName());
        category_name.setText(dataList.getCategoryName());
        custom_designation.setText(dataList.getCustomDesignation());
        department_name.setText(dataList.getDepartmentName());
    }

}