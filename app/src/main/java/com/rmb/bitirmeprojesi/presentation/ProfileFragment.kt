package com.rmb.bitirmeprojesi.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.rmb.bitirmeprojesi.R
import com.rmb.bitirmeprojesi.databinding.FragmentProfileBinding
import java.util.Locale

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val guncelKullanici = auth.currentUser
        if (guncelKullanici != null) {
            binding.tvProfile.text = "Email: ${guncelKullanici.email}"
            db.collection("users").document(guncelKullanici.uid).get()
                .addOnSuccessListener { document ->
                    if (document != null) {
                        val name = ""
                        var middleName = ""
                        val fullName = document.getString("name")!!.lowercase().replaceFirstChar { it.uppercase() }
                        val surname = document.getString("surname")!!.lowercase().replaceFirstChar { it.uppercase() }
                        if (fullName.contains(" ")) {
                            var (name, middleName) = fullName.split(" ", limit = 2)
                            middleName = middleName.lowercase().replaceFirstChar { it.uppercase() }
                            binding.tvName.text = "Ad: $name $middleName"
                            binding.tvSurname.text = "Soyad: $surname"
                        } else {
                            binding.tvName.text = "Ad: $fullName"
                            binding.tvSurname.text = "Soyad: $surname"
                        }
                    } else {
                        Toast.makeText(requireContext(), "Kullanıcı bilgileri bulunamadı.", Toast.LENGTH_SHORT).show()
                    }
                }
                .addOnFailureListener { exception ->
                    Toast.makeText(requireContext(), exception.localizedMessage, Toast.LENGTH_SHORT).show()
                }
        }

        binding.btnProfile.setOnClickListener {
            auth.signOut()
            findNavController().navigate(R.id.action_profileFragment_to_loginFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
