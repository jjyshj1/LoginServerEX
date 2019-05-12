package com.example.loginserverex;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.loginserverex.databinding.ActivityLoginBinding;



public class LoginActivity extends BaseActivity {

    ActivityLoginBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this,R.layout.activity_Login);
    }
}
