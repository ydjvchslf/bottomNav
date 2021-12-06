package com.example.bottomnavi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.bottomnavi.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(){

    val TAG: String = "로그"

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

        //binding.bottomNav.setOnNavigationItemSelectedListener(onBottomNavigationItemSelectedListener)

        //네비게이션 담는 호스트
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragments_frame) as NavHostFragment

        //네비게이션 컨트롤러
        val navController = navHostFragment.navController

        //바텀 네비게이션 뷰와 네비게이션을 묶어준다
        NavigationUI.setupWithNavController(binding.bottomNav, navController)


    }

    private val onBottomNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener{
        when(it.itemId){
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
        true
    }

}