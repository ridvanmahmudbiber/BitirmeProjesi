package com.rmb.bitirmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.rmb.bitirmeprojesi.adapter.StoreAdapter
import com.rmb.bitirmeprojesi.databinding.ActivityMainBinding
import com.rmb.bitirmeprojesi.model.StoreModel

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.fragmentContainerView)

        val noBottomNavigationIds =
            listOf(R.id.loginFragment, R.id.registerFragment)

        navController.addOnDestinationChangedListener { _ , destination, _ ->
            if (noBottomNavigationIds.contains(destination.id)) {
                binding.navView.visibility = View.GONE
            } else {
                binding.navView.visibility = View.VISIBLE
            }
        }

        setupWithNavController(binding.navView, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragmentContainerView)
        return navController.navigateUp()
    }
}