package com.myapp.presentation.countDialog.viewmodel

import android.databinding.ObservableField
import com.myapp.domain.usecase.CountDownUseCase
import com.myapp.util.Constant
import javax.inject.Inject

class CountDialogFragmentViewModel @Inject
constructor(private val mCountDownUseCase: CountDownUseCase){

    var timer = ObservableField<String>()

    fun onCreate() {
        mCountDownUseCase.setCountDownTime(Constant.COUNT_DOWN_COUNT)
        timer.set(mCountDownUseCase.countDownTime.blockingFirst().toString())
    }
}