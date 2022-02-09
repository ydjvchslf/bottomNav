package com.example.bottomnavi

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bottomnavi.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    val TAG: String = "로그"

    private var mBinding : FragmentHomeBinding? = null

    // fragment가 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "HomeFragment - onCreate()")
    }

    // 뷰가 생성되었을때
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "HomeFragment - onCreateView()")

        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        mBinding = binding


        binding.button.setOnClickListener {
            // 화면전환 & args 인자 전달
            val str = "안녕하세유"
            Navigation.findNavController(binding.root).navigate(HomeFragmentDirections.actionHomeToDetail(str))
        }

        return mBinding?.root
    }

    // Fragment를 안고있는 액티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d(TAG, "HomeFragment - onAttach()")
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}