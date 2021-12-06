package com.example.bottomnavi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavi.databinding.FragmentProfileBinding
import com.example.bottomnavi.databinding.FragmentRankBinding

class ProfileFragment : Fragment() {

    val TAG: String = "로그"

    private var mBinding : FragmentProfileBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentProfileBinding.inflate(inflater, container, false)
        mBinding = binding
        return mBinding?.root

    }
}