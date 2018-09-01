package com.nygma.daggerandroidplayground.dagger

import com.nygma.daggerandroidplayground.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [
    AndroidInjectionModule::class,
    ActivityBindingModule::class])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder {
        @BindsInstance
        internal abstract fun application(application: App): Builder

        internal abstract fun build(): AppComponent
    }
}