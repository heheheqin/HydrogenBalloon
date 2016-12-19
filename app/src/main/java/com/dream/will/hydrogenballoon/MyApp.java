package com.dream.will.hydrogenballoon;

import android.app.Application;

/**
 * Author：Will on 2016/12/19 09:32
 * Mail：heheheqin.will@gmail.com
 */

public class MyApp extends Application {

    private static MyApp myApp;
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
