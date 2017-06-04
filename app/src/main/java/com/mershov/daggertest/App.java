package com.mershov.daggertest;

import android.app.Application;

/**
 * Created by User on 04.06.2017.
 */

public class App extends Application {
    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
