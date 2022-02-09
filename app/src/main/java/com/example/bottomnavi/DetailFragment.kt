package com.example.bottomnavi

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.bottomnavi.databinding.FragmentDetailBinding
import com.example.bottomnavi.databinding.FragmentHomeBinding

class DetailFragment : Fragment() {

    val TAG: String = "로그"
    private var mBinding : FragmentDetailBinding? = null

    // fragment가 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "DetailFragment - onCreate()")
    }

    // 뷰가 생성되었을때
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "HomeFragment - onCreateView()")

        val binding = FragmentDetailBinding.inflate(inflater, container, false)
        mBinding = binding

        // arg로 받음
        val receivedStr by navArgs<DetailFragmentArgs>()
        binding.textView.text = receivedStr.itemId.toString()


        return mBinding?.root

    }


}