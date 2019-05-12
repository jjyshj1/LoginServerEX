package com.example.loginserverex.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtil {

    private static final String prefName = "LoginServerEXPref";

    private static final String USER_INPUT_ID = "USER_INPUT_ID";

    private static final String USER_INPUT_PW = "USER_INPUT_PW";


    public static void setUserInputId(Context context, String inputid){
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putString(USER_INPUT_ID,inputid).apply();
    }

    public static String getUserInputId(Context context){
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        return pref.getString(USER_INPUT_ID, "");
    }
}
