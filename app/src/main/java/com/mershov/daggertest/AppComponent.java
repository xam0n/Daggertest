package com.mershov.daggertest;

import dagger.Component;

/**
 * Created by User on 04.06.2017.
 */

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    void injectsMainActivity(MainActivity mainActivity);
}
