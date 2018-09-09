package com.nygma.daggerandroidplayground.chat.parent

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.nygma.daggerandroidplayground.chat.detail.ChatDetailActivity
import com.nygma.daggerandroidplayground.chat.detail.ChatDetailPresenter
import com.nygma.daggerandroidplayground.model.ChatRepository
import dagger.android.DaggerActivity
import javax.inject.Inject

class ChatListActivity : DaggerActivity(), ChatListView {

    private val TAG = javaClass.simpleName
    @Inject
    internal lateinit var presenter: ChatListPresenter
    @Inject
    internal lateinit var otherPresenter: ChatDetailPresenter
    @Inject
    internal lateinit var repository: ChatRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, presenter.hashCode().toString())

        //strictly for demonstration
        Log.d(TAG, otherPresenter.hashCode().toString())
        Log.d(TAG, repository.hashCode().toString())
        //

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ChatDetailActivity::class.java))
            finish()
        }, 2000)
    }
}