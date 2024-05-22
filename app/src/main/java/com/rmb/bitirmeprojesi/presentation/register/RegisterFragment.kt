package com.rmb.bitirmeprojesi.presentation.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.rmb.bitirmeprojesi.R
import com.rmb.bitirmeprojesi.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
        val guncelKullanici = auth.currentUser
        if (guncelKullanici != null) {
            findNavController().navigate(R.id.action_registerFragment_to_storeListFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            if (binding.etEmail.text.toString().isEmpty()) {
                binding.etEmail.error = "E-posta gereklidir."
                return@setOnClickListener
            } else if (binding.etPassword.text.toString().isEmpty()) {
                binding.etPassword.error = "Parola gereklidir."
                return@setOnClickListener
            } else if (binding.confirmETPass.text.toString().isEmpty()) {
                binding.confirmETPass.error = "Parola onayı gereklidir."
                return@setOnClickListener
            } else if (binding.etPassword.text.toString().length < 6) {
                binding.etPassword.error = "Parola en az 6 karakterden oluşmalıdır."
                return@setOnClickListener
            } else {
                register()
            }
        }
    }

    private fun register() {
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        if (binding.etPassword.text.toString() == binding.confirmETPass.text.toString()) {
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    findNavController().navigate(R.id.action_registerFragment_to_storeListFragment)
                }
            }.addOnFailureListener { exception ->
                Toast.makeText(requireContext(), exception.localizedMessage, Toast.LENGTH_SHORT)
                    .show()
            }
        } else {
            Toast.makeText(
                requireContext(),
                "Lütfen Bilgilerinizi Doğru Giriniz.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
