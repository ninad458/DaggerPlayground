package com.nygma.daggerandroidplayground

import android.app.Activity
import android.os.Bundle
import dagger.android.AndroidInjection

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
