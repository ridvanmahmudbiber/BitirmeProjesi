package com.rmb.bitirmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rmb.bitirmeprojesi.adapter.StoreAdapter
import com.rmb.bitirmeprojesi.databinding.ActivityMainBinding
import com.rmb.bitirmeprojesi.model.StoreModel

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}