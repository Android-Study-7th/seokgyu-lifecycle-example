package com.example.lifecycle_example

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {
    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        Log.d("LifeCycle", "FirstFragment: onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCycle", "FirstFragment: onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LifeCycle", "FirstFragment: onCreateView()")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LifeCycle", "FirstFragment: onViewCreated()")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("LifeCycle", "FirstFragment: onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "FirstFragment: onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "FirstFragment: onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "Fragment: onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "Fragment: onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCycle", "Fragment: onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "FirstFragment: onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("LifeCycle", "FirstFragment: onDetach()")
    }
}
