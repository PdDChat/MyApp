package com.myapp.presentation.count.router

import android.app.Activity
import com.myapp.presentation.countDialog.view.CountDownDialogFragment

class CountActivityRouter
constructor(private val mActivity: Activity){

    fun goToCountDialog() {
        val countDownDialogFragment = CountDownDialogFragment()
        val dialog = countDownDialogFragment.newInstance()
        dialog.show(mActivity.fragmentManager,"TAG")
    }
}