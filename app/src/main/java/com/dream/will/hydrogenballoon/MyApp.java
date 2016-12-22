package com.dream.will.hydrogenballoon;

import android.app.Application;

/**
 * Author：Will on 2016/12/19 09:32
 * Mail：heheheqin.will@gmail.com
 */

public class MyApp extends Application {

    private static MyApp myApp;
    public double lng= 114.06667;
    public double lat= 22.61667;
    @Override
    public void onCreate() {
        super.onCreate();
        //
        myApp = this;
    }

    public static MyApp getInstance(){
        return  myApp;
    }
}
