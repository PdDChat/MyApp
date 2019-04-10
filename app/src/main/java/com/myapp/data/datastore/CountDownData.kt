package com.myapp.data.datastore

import javax.inject.Inject

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class CountDownData @Inject
constructor() {

    var countDownObservable: Observable<Int> = Observable.just(300)

    fun setCountDownTime(second: Int) {
        countDownObservable = Observable.just(second)

        // val counter = Observable.just(ArrayList<Int>(second).reverse())
        // val timer = Observable.interval(0, 1, TimeUnit.SECONDS)
        // countDownObservable = Observable.zip(timer, counter, { n, m -> m}).cache().publish().refCount
    }


/*
    private var mCountDownSubject: Subject<Int> = PublishSubject.create()

    fun setCountDownTime(second: Int) {
        val timer= Observable.interval(0, 1, TimeUnit.SECONDS)
        val counter = Observable.fromIterable((0..second).reversed().toList())
        // mCountDownSubject = Observable.zip(timer, counter, {m, n -> m})
    }
*/
}