package com.nygma.daggerandroidplayground.main

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.nygma.daggerandroidplayground.App
import com.nygma.daggerandroidplayground.chat.parent.ChatListActivity
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : DaggerActivity() {

    @Inject
    lateinit var app: App

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ChatListActivity::class.java))
            finish()
        }, 2000)
    }
}
