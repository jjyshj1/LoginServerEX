package com.example.loginserverex;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.loginserverex.databinding.ActivityLoginBinding;
import com.example.loginserverex.utils.ConnectServer;
import com.example.loginserverex.utils.ContextUtil;

import org.json.JSONObject;


public class LoginActivity extends BaseActivity {

    ActivityLoginBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public void setupEvents() {
        act.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputId = act.loginIdEdt.getText().toString();
                String  inputPw = act.loginPw.getText().toString();

                ContextUtil.setUserInputId(mContext,inputId);


                ConnectServer.postRequestSignIn(mContext, inputId, inputPw, new ConnectServer.JsonResponseHandler() {
                    @Override
                    public void onResponse(JSONObject json) {

                    }
                });
                //                test123 / test123
//                iu0001 / Test!123
//                testorder1 / testorder1
//                gggg1111 / gggg1111
            }
        });
    }

    @Override
    public void setValues() {

        String savedid = ContextUtil.getUserInputId(mContext);
        act.loginIdEdt.setText(savedid);

    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this,R.layout.activity_Login);
    }
}
