package com.myapp.presentation.main.viewmodel

import com.myapp.presentation.main.router.MainActivityRouter
import javax.inject.Inject

class MainActivityViewModel @Inject
constructor(){
    private lateinit var mRouter: MainActivityRouter

    fun onCreate(router: MainActivityRouter) {
        mRouter = router
    }

    fun onCountDownClick() {
        mRouter.goToCountDown()
    }
}