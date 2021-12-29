package com.logic.androidtest.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.logic.androidtest.R;

public class NotificationFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_notification, container, false);
        initVariables();
        initView(rootView);
        initFunction();
        initListener();
        return  rootView;
    }

    private void initVariables() {

    }

    private void initView(View rootView) {

    }

    private void initFunction() {

    }

    private void initListener() {

    }
}