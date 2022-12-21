package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class MainFragment: Fragment() {

    companion object {

        fun getNewInstance(args: Bundle?): MainFragment {
            val mainFragment =MainFragment()
            mainFragment.arguments = args
            return mainFragment
        }
//        fun getNewInstance(exampleId: Int): MainFragment {
//            val mainFragment =MainFragment()
//            mainFragment.arguments?.putSerializable("exampleId", exampleId)
//            return mainFragment
//        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }
}