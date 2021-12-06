package com.example.bottomnavi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    val TAG: String = "LOG"

    private lateinit var homeFragment: HomeFragment
    private lateinit var rankFragment: RankFragment
    private lateinit var profileFragment: ProfileFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate()")

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.d(TAG, "MainActivity - onNavigationItemSelected()")

        when(item.itemId){
            R.id.menu_home -> {
                Log.d(TAG, "MainActivity - 홈버튼클릭")
            }
            R.id.menu_rank -> {
                Log.d(TAG, "MainActivity - 랭킹클릭")
            }
            R.id.menu_profile -> {
                Log.d(TAG, "MainActivity - 프로필클릭")
            }
        }

        return true
    }

}