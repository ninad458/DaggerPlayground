package com.nygma.daggerandroidplayground.chat.detail

import com.nygma.daggerandroidplayground.model.ChatRepository
import com.nygma.daggerandroidplayground.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class ChatDetailPresenter @Inject constructor(chatRepository: ChatRepository, view: ChatDetailView)