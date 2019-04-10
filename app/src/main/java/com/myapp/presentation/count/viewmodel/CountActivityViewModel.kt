package com.myapp.presentation.count.viewmodel

import android.databinding.ObservableField
import com.myapp.domain.usecase.CountDownUseCase
import com.myapp.presentation.count.router.CountActivityRouter
import com.myapp.util.Constant
import javax.inject.Inject

class CountActivityViewModel @Inject
constructor(private val mCountDownUseCase: CountDownUseCase){

    var timer = ObservableField<String>()

    lateinit var mRouter: CountActivityRouter

    fun onCreate(router: CountActivityRouter){
        mRouter = router

        // カウントダウン開始
        startCountDown()
    }

    fun onCountDialogClick() {
        mRouter.goToCountDialog()
    }

    private fun startCountDown() {
        mCountDownUseCase.setCountDownTime(Constant.COUNT_DOWN_COUNT)
        timer.set(mCountDownUseCase.countDownTime.blockingFirst().toString())
    }
}