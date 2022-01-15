package com.fox.dailylines.ui.tasksFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.fox.dailylines.R
import com.fox.dailylines.databinding.FragmentTasksBinding
import com.fox.dailylines.ui.base.BaseFragment
import com.fox.dailylines.ui.base.BaseViewModel


class TasksFragment : BaseFragment<FragmentTasksBinding>() {
    override fun getLayoutID()= R.layout.fragment_tasks

    override val viewModel: TasksFragmentViewModel by viewModels()


}