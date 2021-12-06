package com.example.bottomnavi

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

object HomeFragment : Fragment() {

    const val TAG: String = "LOG"

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

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    // Fragment를 안고있는 액티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d(TAG, "HomeFragment - onAttach()")
    }
}