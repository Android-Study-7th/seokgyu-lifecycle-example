package com.example.lifecycle_example

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {
    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        Log.d("LifeCycle", "SecondFragment: onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCycle", "SecondFragment: onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LifeCycle", "SecondFragment: onCreateView()")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LifeCycle", "SecondFragment: onViewCreated()")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("LifeCycle", "SecondFragment: onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "SecondFragment: onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "SecondFragment: onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "SecondFragment: onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "SecondFragment: onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCycle", "SecondFragment: onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "SecondFragment: onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("LifeCycle", "SecondFragment: onDetach()")
    }
}
