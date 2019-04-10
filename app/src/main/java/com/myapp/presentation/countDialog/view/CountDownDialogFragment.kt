package com.myapp.presentation.countDialog.view

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import com.myapp.MyApp
import com.myapp.R
import com.myapp.databinding.FragmentCountDialogBinding
import com.myapp.presentation.countDialog.viewmodel.CountDialogFragmentViewModel
import javax.inject.Inject

class CountDownDialogFragment : DialogFragment() {
    @Inject lateinit var mViewModel: CountDialogFragmentViewModel

    private lateinit var mBinding: FragmentCountDialogBinding

    fun newInstance() : CountDownDialogFragment {
        return CountDownDialogFragment()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // DI
        val app = activity.application as MyApp
        app.appComponent.inject(this)

        val inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_count_dialog, null, false)
        mBinding.viewModel = mViewModel
        mViewModel.onCreate()

        val builder = AlertDialog.Builder(activity)
        builder.setView(mBinding.root)

        return builder.create()
    }
}