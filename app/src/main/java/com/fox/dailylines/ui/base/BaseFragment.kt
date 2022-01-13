package com.fox.dailylines.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.fox.dailylines.BR

abstract class BaseFragment<VDB : ViewDataBinding> : Fragment() {

    private lateinit var _binding: VDB
    protected val binding get() = _binding
    protected abstract fun getLayoutID(): Int

    protected abstract val viewModel: BaseViewModel
    protected open val viewModelBinding = BR.viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, getLayoutID(), container, false)
        _binding.lifecycleOwner = this
        _binding.setVariable(viewModelBinding, viewModel)
        return _binding.root
    }
}