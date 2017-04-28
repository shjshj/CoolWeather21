package com.example.shj.coolweather2;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;
import org.litepal.util.Const;

/**
 * Created by shj on 2017/4/27.
 */

public class MyApplication extends Application{
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);

    }
    public static Context getContext(){
        return context;
    }
}
