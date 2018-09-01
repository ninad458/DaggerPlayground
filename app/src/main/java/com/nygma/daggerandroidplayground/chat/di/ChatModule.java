package com.nygma.daggerandroidplayground.chat.di;

import com.nygma.daggerandroidplayground.model.Chat;
import com.nygma.daggerandroidplayground.scope.ChatScope;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ChatModule {

    @Provides
    @ChatScope
    static Chat getChat() {
        return new Chat("192401");
    }

}