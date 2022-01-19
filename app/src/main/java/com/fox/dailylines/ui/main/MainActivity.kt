package com.fox.dailylines.ui.main


import android.os.Bundle
import android.view.Menu
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.fox.dailylines.R
import com.fox.dailylines.databinding.ActivityMainBinding
import com.fox.dailylines.ui.base.BaseActivity
import com.fox.dailylines.ui.base.BaseViewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun getLayout() = R.layout.activity_main

    override val viewModel: MainActivityViewModel by viewModels()

    override fun onResume() {
        super.onResume()
        binding.bottomNavigation.setupWithNavController(findNavController(R.id.fragmentContainerView))
    }

}

