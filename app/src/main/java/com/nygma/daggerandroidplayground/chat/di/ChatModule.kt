package com.nygma.daggerandroidplayground.chat.di

import com.nygma.daggerandroidplayground.model.ChatRepository
import com.nygma.daggerandroidplayground.scope.ChatScope
import dagger.Module
import dagger.Provides

@Module
object ChatModule {

    @JvmStatic
    @Provides
    @ChatScope
    fun getChat() = ChatRepository("1813278")

}