package com.example.administrator.mvpdemo.service.util;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


/**
 * Created by Administrator on 2018/1/30,0030.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
