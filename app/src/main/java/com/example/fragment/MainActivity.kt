package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        intent.extras?.getString("token")
        val bundle = Bundle()
        bundle.putString("token", "ewioghowhgiw")

        MainFragment.getNewInstance(args = bundle)


//        supportFragmentManager.beginTransaction().replace(android.R.id.content, MainFragment()).commit()

    }
}