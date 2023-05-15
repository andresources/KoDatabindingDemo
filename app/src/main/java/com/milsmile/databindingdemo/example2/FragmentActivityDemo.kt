package com.milsmile.databindingdemo.example2

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.milsmile.databindingdemo.R

class FragmentActivityDemo : AppCompatActivity() {
    private lateinit var my_container:FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_demo)
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.my_container,Example2Fragment())
        ft.commit()
    }
}