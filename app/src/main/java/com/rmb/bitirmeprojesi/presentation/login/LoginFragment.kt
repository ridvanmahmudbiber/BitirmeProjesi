package com.rmb.bitirmeprojesi.presentation.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.rmb.bitirmeprojesi.R
import com.rmb.bitirmeprojesi.databinding.FragmentLoginBinding
import com.rmb.bitirmeprojesi.databinding.FragmentStoreListBinding
import com.rmb.bitirmeprojesi.presentation.register.RegisterFragment
import com.rmb.bitirmeprojesi.presentation.store.StoreListFragment

class LoginFragment : Fragment(){

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        auth = Firebase.auth
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            login()
        }
        binding.tvBeRegister.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegisterFragment())
        }

    }

    private fun login() {
        auth.signInWithEmailAndPassword(binding.etEmail.text.toString(), binding.etPassword.text.toString())
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val guncelKullanıcı = auth.currentUser?.email.toString()
                    Toast.makeText(
                        requireContext(),
                        "Hoşgeldin: $guncelKullanıcı",
                        Toast.LENGTH_SHORT
                    ).show()
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToStoreListFragment())
                }
            }.addOnFailureListener { exception ->
                Toast.makeText(requireContext(), exception.localizedMessage, Toast.LENGTH_SHORT).show()
            }
    }
}