package com.myapp;

import android.app.Application;

import com.myapp.di.AppComponent;
import com.myapp.di.AppModule;
import com.myapp.di.DaggerAppComponent;

public class MyApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
