package com.geniusvjr.retrofitdemo;

import android.app.Application;

import com.geniusvjr.retrofitdemo.common.utils.CrashHandler;

/**
 * Created by dream on 16/5/14.
 */
public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
    }
}
