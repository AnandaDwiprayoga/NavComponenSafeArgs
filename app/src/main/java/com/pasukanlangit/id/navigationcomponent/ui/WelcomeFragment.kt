package com.pasukanlangit.id.navigationcomponent.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.pasukanlangit.id.navigationcomponent.R
import com.pasukanlangit.id.navigationcomponent.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment(R.layout.fragment_welcome){

    //WelcomeFragmentArgs is auto generating when rebuild project. this is the features of navArgs
    private val args: WelcomeFragmentArgs by navArgs()
    private lateinit var binding: FragmentWelcomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentWelcomeBinding.bind(view)
        populateUI()

        binding.btnOk.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }

    private fun populateUI() {
        with(binding){
            tvUsername.text = args.username
            tvPassword.text = args.password
        }

    }
}