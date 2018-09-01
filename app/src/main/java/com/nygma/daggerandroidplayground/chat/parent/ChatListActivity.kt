package com.nygma.daggerandroidplayground.chat.parent

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.nygma.daggerandroidplayground.chat.detail.ChatDetailActivity
import dagger.android.DaggerActivity
import javax.inject.Inject

class ChatListActivity : DaggerActivity(), ChatListView {

    @Inject
    lateinit var presenter: ChatListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ChatDetailActivity::class.java))
            finish()
        }, 2000)
    }
}