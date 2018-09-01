package com.nygma.daggerandroidplayground.chat.di

import com.nygma.daggerandroidplayground.chat.parent.ChatListActivity
import com.nygma.daggerandroidplayground.chat.parent.ChatListView
import com.nygma.daggerandroidplayground.scope.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class ChatListActivityModule {

    @ActivityScope
    @Binds
    abstract fun getView(activity: ChatListActivity): ChatListView

}