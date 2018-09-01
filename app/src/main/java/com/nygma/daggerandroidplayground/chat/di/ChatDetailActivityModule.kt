package com.nygma.daggerandroidplayground.chat.di

import com.nygma.daggerandroidplayground.chat.detail.ChatDetailActivity
import com.nygma.daggerandroidplayground.chat.detail.ChatDetailView
import com.nygma.daggerandroidplayground.scope.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class ChatDetailActivityModule {

    @ActivityScope
    @Binds
    abstract fun getView(activity: ChatDetailActivity): ChatDetailView
}