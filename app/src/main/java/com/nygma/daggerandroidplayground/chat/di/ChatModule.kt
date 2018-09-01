package com.nygma.daggerandroidplayground.chat.di

import com.nygma.daggerandroidplayground.model.Chat
import com.nygma.daggerandroidplayground.scope.ChatScope
import dagger.Module
import dagger.Provides

@Module
object ChatModule {

    @JvmStatic
    @Provides
    @ChatScope
    fun getChat() = Chat("1813278")

}