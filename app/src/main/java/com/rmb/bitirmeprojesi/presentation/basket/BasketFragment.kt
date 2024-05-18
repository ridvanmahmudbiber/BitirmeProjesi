package com.rmb.bitirmeprojesi.presentation.basket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.rmb.bitirmeprojesi.R
import com.rmb.bitirmeprojesi.databinding.FragmentBasketBinding
import com.rmb.bitirmeprojesi.databinding.FragmentStoryDetailBinding
import com.rmb.bitirmeprojesi.presentation.SharedViewModel
import kotlinx.coroutines.flow.collectLatest


class BasketFragment : Fragment() {
    private var _binding: FragmentBasketBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModelShared: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBasketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelShared = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        lifecycleScope.launchWhenCreated {
            viewModelShared.sharedFlow.collectLatest {
                //Data or the word 'Hello' sent from Fragment A not being Received Here
                 it
            }
        }

    }
}