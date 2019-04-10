package com.myapp.presentation.main.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.myapp.MyApp
import com.myapp.R
import com.myapp.databinding.ActivityMainBinding
import com.myapp.presentation.main.router.MainActivityRouter
import com.myapp.presentation.main.viewmodel.MainActivityViewModel
import javax.inject.Inject

class MainActivity: AppCompatActivity(){

    @Inject lateinit var mViewModel: MainActivityViewModel

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // DI
        val app = application as MyApp
        app.appComponent.inject(this)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.viewModel = mViewModel

        mViewModel.onCreate(MainActivityRouter(this))
    }
}
