package com.webmarke8.app.gencart.Session;

import android.app.Application;

/**
 * Created by u on 20-Dec-17.
 */

public class MyApplication extends Application {


    private static MyApplication mInstance;
    public void onCreate()
    {
        super.onCreate();
        mInstance=this;

    }

    public static synchronized MyApplication getInstance()
    {
        return mInstance;
    }


}