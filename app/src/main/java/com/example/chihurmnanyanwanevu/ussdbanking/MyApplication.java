package com.example.chihurmnanyanwanevu.ussdbanking;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Chihurmnanya
 */
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
