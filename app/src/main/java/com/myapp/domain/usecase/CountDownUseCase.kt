package com.myapp.domain.usecase

import com.myapp.data.repository.CountDownRepository
import io.reactivex.Observable
import javax.inject.Inject

class CountDownUseCase @Inject
constructor(private val mRepository : CountDownRepository){

    val countDownTime: Observable<Int> = mRepository.countDownTime

    fun setCountDownTime(second: Int) {
        mRepository.setCountDown(second)
    }
}