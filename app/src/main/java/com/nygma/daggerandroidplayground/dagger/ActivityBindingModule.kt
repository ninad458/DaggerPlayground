package com.nygma.daggerandroidplayground.dagger

import com.nygma.daggerandroidplayground.chat.detail.ChatDetailActivity
import com.nygma.daggerandroidplayground.chat.di.ChatDetailActivityModule
import com.nygma.daggerandroidplayground.chat.di.ChatListActivityModule
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

    @ChatScope
    @ActivityScope
    @ContributesAndroidInjector(modules = [ChatModule::class, ChatListActivityModule::class])
    abstract fun chatListActivity(): ChatListActivity

    @ChatScope
    @ActivityScope
    @ContributesAndroidInjector(modules = [ChatModule::class, ChatDetailActivityModule::class])
    abstract fun chatDetailActivity(): ChatDetailActivity

}