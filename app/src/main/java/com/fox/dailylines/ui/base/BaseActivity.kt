package com.fox.dailylines.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.fox.dailylines.BR

abstract class BaseActivity<VDB : ViewDataBinding> : AppCompatActivity() {

    private lateinit var _binding: VDB
    protected val binding get() = _binding
    protected abstract fun getLayout(): Int

    protected abstract val viewModel : BaseViewModel
    protected open val viewModelBinding get() = BR.viewModel


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        _binding = DataBindingUtil.setContentView(this, getLayout())
        _binding.setVariable(viewModelBinding, viewModel)
        _binding.lifecycleOwner = this

    }
}