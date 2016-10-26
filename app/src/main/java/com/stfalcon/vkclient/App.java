package com.stfalcon.vkclient;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by gbm19 on 10.10.2016.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
    }
}
