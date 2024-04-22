package com.rmb.bitirmeprojesi.presentation.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rmb.bitirmeprojesi.R
import com.rmb.bitirmeprojesi.databinding.FragmentLoginBinding
import com.rmb.bitirmeprojesi.databinding.FragmentStoreListBinding
import com.rmb.bitirmeprojesi.presentation.store.StoreListFragment

class LoginFragment : Fragment(){

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToStoreListFragment())
        }


    }
}