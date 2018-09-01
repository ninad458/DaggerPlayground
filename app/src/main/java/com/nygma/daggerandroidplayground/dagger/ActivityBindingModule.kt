package com.nygma.daggerandroidplayground.dagger

import com.nygma.daggerandroidplayground.chat.detail.ChatDetailActivity
import com.nygma.daggerandroidplayground.chat.di.ChatModule
import com.nygma.daggerandroidplayground.chat.parent.ChatListActivity
import com.nygma.daggerandroidplayground.main.MainActivity
import com.nygma.daggerandroidplayground.scope.ChatScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [ChatModule::class])
    @ChatScope
    abstract fun chatListActivity(): ChatListActivity

    @ContributesAndroidInjector(modules = [ChatModule::class])
    @ChatScope
    abstract fun chatDetailActivity(): ChatDetailActivity

}