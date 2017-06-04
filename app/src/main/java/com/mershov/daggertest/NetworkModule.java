package com.mershov.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by User on 04.06.2017.
 */

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
}
