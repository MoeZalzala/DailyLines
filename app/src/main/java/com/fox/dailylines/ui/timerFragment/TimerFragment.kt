package com.fox.dailylines.ui.timerFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.fox.dailylines.R
import com.fox.dailylines.databinding.FragmentNotesBinding
import com.fox.dailylines.ui.base.BaseFragment
import com.fox.dailylines.ui.base.BaseViewModel


class TimerFragment : BaseFragment<FragmentNotesBinding>() {
    override fun getLayoutID()= R.layout.fragment_timer

    override val viewModel: TimerFragmentViewModel by viewModels()

}