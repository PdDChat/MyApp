package com.myapp.presentation.count.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.myapp.MyApp
import com.myapp.R
import com.myapp.databinding.ActivityCountBinding
import com.myapp.presentation.count.router.CountActivityRouter
import com.myapp.presentation.count.viewmodel.CountActivityViewModel
import javax.inject.Inject

class CountActivity: AppCompatActivity() {

    @Inject
    lateinit var mViewModel: CountActivityViewModel

    private lateinit var mBinding: ActivityCountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // DI
        val app = application as MyApp
        app.appComponent.inject(this)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_count)
        mBinding.viewModel = mViewModel

        mViewModel.onCreate(CountActivityRouter(this))
    }
}