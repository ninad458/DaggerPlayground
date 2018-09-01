package com.nygma.daggerandroidplayground.chat.detail

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import dagger.android.DaggerActivity
import javax.inject.Inject

class ChatDetailActivity : DaggerActivity(), ChatDetailView {

    @Inject
    lateinit var presenter: ChatDetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 2000)
    }
}
