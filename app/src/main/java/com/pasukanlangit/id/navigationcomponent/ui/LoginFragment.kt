package com.pasukanlangit.id.navigationcomponent.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.pasukanlangit.id.navigationcomponent.R
import com.pasukanlangit.id.navigationcomponent.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login){

    private lateinit var binding: FragmentLoginBinding
    private val args: LoginFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val usernameDeepLink = args.username
        binding = FragmentLoginBinding.bind(view)

        with(binding){
            edtUsername.setText(usernameDeepLink)
            btnConfirm.setOnClickListener {
                val username = edtUsername.text.toString().trim()
                val password = edtPassword.text.toString().trim()

                val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
                findNavController().navigate(action)
            }
        }
    }
}