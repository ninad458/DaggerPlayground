package com.nygma.daggerandroidplayground.chat.detail

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.nygma.daggerandroidplayground.model.Chat
import dagger.android.DaggerActivity
import javax.inject.Inject

class ChatDetailActivity : DaggerActivity() {

    private val tag = javaClass.simpleName

    @Inject
    lateinit var chat: Chat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, chat.chatId)
        Log.d(tag, chat.hashCode().toString())
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 2000)
    }
}