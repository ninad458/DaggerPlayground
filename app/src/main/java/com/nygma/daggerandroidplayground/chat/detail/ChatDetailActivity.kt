package com.nygma.daggerandroidplayground.chat.detail

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.nygma.daggerandroidplayground.model.ChatRepository
import dagger.android.DaggerActivity
import javax.inject.Inject

class ChatDetailActivity : DaggerActivity(), ChatDetailView {

    private val TAG = javaClass.simpleName
    @Inject
    internal lateinit var presenter: ChatDetailPresenter
    @Inject
    internal lateinit var repository: ChatRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, presenter.hashCode().toString())

        //strictly for demonstration
        Log.d(TAG, repository.hashCode().toString())
        //

        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 2000)
    }
}