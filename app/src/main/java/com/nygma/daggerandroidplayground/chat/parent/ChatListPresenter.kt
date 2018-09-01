package com.nygma.daggerandroidplayground.chat.parent

import com.nygma.daggerandroidplayground.model.ChatRepository
import com.nygma.daggerandroidplayground.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class ChatListPresenter @Inject constructor(chatRepository: ChatRepository, view: ChatListView)