package com.fox.dailylines.ui.homeFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.fox.dailylines.R
import com.fox.dailylines.databinding.FragmentHomeBinding
import com.fox.dailylines.ui.base.BaseFragment
import com.fox.dailylines.ui.base.BaseViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getLayoutID(): Int = R.layout.fragment_home


    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addNote.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_addNotesFragment)
        }
    }
}