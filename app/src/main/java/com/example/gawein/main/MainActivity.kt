package com.example.gawein.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.gawein.R
import com.example.gawein.databinding.ActivityMainBinding
import com.example.gawein.main.ui.account.AccountFragment
import com.example.gawein.main.ui.home.HomeFragment
import com.example.gawein.main.ui.scan.ScanActivity
import com.example.gawein.ui.saved.SavedJobsFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    replaceFragment(HomeFragment())
                }
                R.id.scan -> {
                    gotoScan()
                }
                R.id.saved -> {
                    replaceFragment(SavedJobsFragment())
                }
                R.id.account -> {
                    replaceFragment(AccountFragment())
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }
    }

    private fun gotoScan() {
        startActivity(Intent(this@MainActivity, ScanActivity::class.java))
    }
}