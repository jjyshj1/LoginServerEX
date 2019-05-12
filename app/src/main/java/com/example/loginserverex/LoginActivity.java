package com.example.loginserverex;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

        act.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //                test123 / test123
//                iu0001 / Test!123
//                testorder1 / testorder1
//                gggg1111 / gggg1111
            }
        });
    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this,R.layout.activity_Login);
    }
}
