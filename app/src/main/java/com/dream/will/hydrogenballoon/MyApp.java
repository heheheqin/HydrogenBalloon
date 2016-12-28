package com.dream.will.hydrogenballoon;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;
import com.dream.will.hydrogenballoon.db.DBhelper;

/**
 * Author：Will on 2016/12/19 09:32
 * Mail：heheheqin.will@gmail.com
 */

public class MyApp extends Application {

    private static MyApp myApp;
    public double lng= 114.06667;
    public double lat= 22.61667;
    public  String USERNAME  = "Will";
    public DBhelper dBhelper;

    @Override
    public void onCreate() {
        super.onCreate();
        //
        myApp = this;
        SDKInitializer.initialize(this);
        dBhelper = new DBhelper(this, null, null, 1);
    }

    public static MyApp getInstance(){
        return  myApp;
    }
}
