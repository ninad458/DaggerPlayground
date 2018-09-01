package com.nygma.daggerandroidplayground.chat.parent

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.nygma.daggerandroidplayground.chat.detail.ChatDetailActivity
import com.nygma.daggerandroidplayground.chat.detail.ChatDetailPresenter
import com.nygma.daggerandroidplayground.model.Chat
import dagger.android.DaggerActivity
import javax.inject.Inject

class ChatListActivity : DaggerActivity() {

    private val tag = javaClass.simpleName

    @Inject
    lateinit var presenterChatList: ChatListPresenter
    //this is to check if we get different instances for different activities
    @Inject
    lateinit var presenterDetailPresenter: ChatDetailPresenter
    @Inject
    lateinit var chat: Chat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, chat.chatId)
        Log.d(tag, chat.hashCode().toString())
        Log.d(tag, presenterChatList.hashCode().toString())
        Log.d(tag, presenterDetailPresenter.hashCode().toString())
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ChatDetailActivity::class.java))
            finish()
        }, 2000)
    }
}