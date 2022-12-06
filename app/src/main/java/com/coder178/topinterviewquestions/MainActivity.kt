package com.coder178.topinterviewquestions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.coder178.topinterviewquestions.Fragments.Oops
import com.coder178.topinterviewquestions.databinding.ActivityMainBinding
import com.coder178.topinterviewquestions.databinding.FragmentOopsBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var bin: FragmentOopsBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding..setOnClickListener {
//          updateFragment(Oops(),"OOPS")

//            val frag = Oops()
//            val fragment: Fragment? =
//                supportFragmentManager.findFragmentByTag(frag::class.java.simpleName)
//            if (fragment !is Oops) {
//                supportFragmentManager.beginTransaction()
//                    .add(R.id.ll, frag, Oops::class.java.simpleName)
//                    .commit()
//            }
//        }
//    }
//
//    private fun updateFragment(fragment: Fragment, title: String) {
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.sv, fragment)
//        fragmentTransaction.commit()
//        setTitle(title)

//        navController = findNavController(R.id.fragmentContainerView)
//        setupActionBarWithNavController(navController)
//    }
//
//        override fun onNavigateUp(): Boolean {
//            return navController.navigateUp() || super.onNavigateUp()
        }

}