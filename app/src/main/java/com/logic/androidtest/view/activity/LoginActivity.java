package com.logic.androidtest.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.logic.androidtest.MainActivity;
import com.logic.androidtest.R;
import com.logic.androidtest.model.apicall.LoginApiCall;
import com.logic.androidtest.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {
    EditText userName,userPassword;
    MaterialDialog dialog;
    LoginApiCall loginApiCall;
    LoginViewModel loginView;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariables();
        initView();
        initFunction();
        initListener();
    }

    private void initVariables() {
        loginApiCall = new LoginApiCall();
        loginView = new ViewModelProvider(this).get(LoginViewModel.class);
    }

    private void initView() {
        setContentView(R.layout.activity_login);
        userName = findViewById(R.id.edt_username);
        userPassword = findViewById(R.id.edt_password);
        login = findViewById(R.id.login);

        dialog = new MaterialDialog.Builder(this).title("Loading")
                .content("Please Wait . . .")
                .progress(true, 0)
                .cancelable(false)
                .build();

    }

    private void initFunction() {
        loginView.progressLoginLiveData.observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                if (aBoolean){
                   dialog.show();
                }else {
                    dialog.dismiss();
                }
            }
        });

        loginView.loginIsSuccessLiveData.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                if (integer==1){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, "Login fail", Toast.LENGTH_SHORT).show();
                }
            }
        });

        loginView.loginResponseFailorLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(LoginActivity.this, ""+s, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initListener() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getLogin();
            }
        });
    }

    private void getLogin() {
        if (userName.getText().toString().equals("")) {
            userName.setError("Enter Your Email");
        } else if (userPassword.getText().toString().equals("")) {
            userPassword.setError("Enter Your Valid Password");

        } else {

            String uName = userName.getText().toString();
            String uPassword = userPassword.getText().toString();
            loginView.getLogin(this
                    , uName,
                    uPassword, loginApiCall
            );
        }

    }


}