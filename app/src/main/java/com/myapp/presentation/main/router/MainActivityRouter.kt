package com.myapp.presentation.main.router

import android.app.Activity
import android.content.Intent
import com.myapp.presentation.count.view.CountActivity

class MainActivityRouter
constructor(private val mActivity: Activity){

    fun goToCountDown() {
        val intent = Intent(mActivity, CountActivity::class.java)
        mActivity.startActivity(intent)
    }
}