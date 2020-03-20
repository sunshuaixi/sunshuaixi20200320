package com.bawei.sunshuaixi20200320.base;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * TIme:2020/3/20
 * Author:孙帅喜
 * Descriotion:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
