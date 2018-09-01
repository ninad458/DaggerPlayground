package com.nygma.daggerandroidplayground.dagger

import com.nygma.daggerandroidplayground.App
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [
    AndroidInjectionModule::class,
    ActivityBindingModule::class])
interface AppComponent : AndroidInjector<App>