package com.nygma.daggerandroidplayground

import com.nygma.daggerandroidplayground.dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out App> {
        return DaggerAppComponent.builder().application(this).build()
    }
}