package com.mershov.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by User on 04.06.2017.
 */

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }
}
