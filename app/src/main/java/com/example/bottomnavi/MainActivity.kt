package com.example.bottomnavi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.databinding.DataBindingComponent
import com.example.bottomnavi.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(){

    val TAG: String = "LOG"

    private lateinit var homeFragment: HomeFragment
    private lateinit var rankFragment: RankFragment
    private lateinit var profileFragment: ProfileFragment

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "MainActivity - onCreate()")

        binding.bottomNav.setOnNavigationItemSelectedListener(onBottomNavigationItemSelectedListener)

    }

    private val onBottomNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener{
        when(it.itemId){
            R.id.menu_home -> {
                Log.d(TAG, "MainActivity - 홈버튼클릭")
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, homeFragment)
            }
            R.id.menu_rank -> {
                Log.d(TAG, "MainActivity - 랭킹클릭")
            }
            R.id.menu_profile -> {
                Log.d(TAG, "MainActivity - 프로필클릭")
            }
        }
        true
    }

}