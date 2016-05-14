package com.geniusvjr.retrofitdemo.common.utils;

import android.content.Context;
import android.util.Log;

/**
 * 全局Crash捕获异常
 * Created by dream on 16/5/14.
 */
public class CrashHandler implements Thread.UncaughtExceptionHandler{

    private static CrashHandler INSTANCE = new CrashHandler();
    private Thread.UncaughtExceptionHandler mDefaultUEH;
    private Context mContext;

    private CrashHandler() {
        mDefaultUEH = Thread.getDefaultUncaughtExceptionHandler();
    }

    public static CrashHandler getInstance(){
        return INSTANCE;
    }

    public void init(Context ctx){
        Thread.setDefaultUncaughtExceptionHandler(this);
        mContext = ctx;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        Log.e("CrashHandler", ex.getMessage(), ex);
        mDefaultUEH.uncaughtException(thread, ex);
    }
}
