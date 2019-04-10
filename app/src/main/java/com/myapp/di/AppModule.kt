package com.myapp.di

import android.app.Application

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

@Module
class AppModule(private val mApp: Application) {

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return mApp
    }
}
