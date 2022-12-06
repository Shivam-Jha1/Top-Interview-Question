package com.coder178.topinterviewquestions.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.coder178.topinterviewquestions.R
import com.coder178.topinterviewquestions.databinding.FragmentHomeBinding


class Home : Fragment() {

    lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)

        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)

        binding.oops.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_home2_to_oops2)
        }

        binding.DBMS.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_home2_to_DBMSFragment)
        }

        binding.Hr.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_home2_to_hr)
        }

        binding.os.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_home2_to_operatingSystem)
        }
        binding.coding.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_home2_to_coding2)
        }
        return binding.root
    }
}