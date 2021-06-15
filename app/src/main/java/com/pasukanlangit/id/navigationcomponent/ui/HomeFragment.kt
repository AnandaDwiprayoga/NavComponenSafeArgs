package com.pasukanlangit.id.navigationcomponent.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pasukanlangit.id.navigationcomponent.R
import com.pasukanlangit.id.navigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentHomeBinding.bind(view)
        binding.apply {
            btnLogin.setOnClickListener {
                //this homefragmentdirections generate when rebuild project. (safeargs)
                val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
                findNavController().navigate(action)
            }
        }
    }

}