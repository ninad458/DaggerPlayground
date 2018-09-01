package com.nygma.daggerandroidplayground.dagger

import com.nygma.daggerandroidplayground.chat.detail.ChatDetailActivity
import com.nygma.daggerandroidplayground.chat.di.ChatModule
import com.nygma.daggerandroidplayground.chat.parent.ChatListActivity
import com.nygma.daggerandroidplayground.main.MainActivity
import com.nygma.daggerandroidplayground.scope.ActivityScope
import com.nygma.daggerandroidplayground.scope.ChatScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    @ActivityScope
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [ChatModule::class])
    @ChatScope
    @ActivityScope
    abstract fun chatListActivity(): ChatListActivity

    @ContributesAndroidInjector(modules = [ChatModule::class])
    @ChatScope
    @ActivityScope
    abstract fun chatDetailActivity(): ChatDetailActivity

}