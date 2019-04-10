package com.myapp.data.repository

import com.myapp.data.datastore.CountDownData
import io.reactivex.Observable
import javax.inject.Inject

/**
 * カウントダウンリポジトリ
 */
class CountDownRepository @Inject
constructor(private val mCountDownData : CountDownData){
    val countDownTime: Observable<Int> = mCountDownData.countDownObservable

    fun setCountDown(second: Int) {
        mCountDownData.setCountDownTime(second)
    }
}