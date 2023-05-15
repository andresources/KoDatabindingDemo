package com.milsmile.databindingdemo.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.milsmile.databindingdemo.R
import com.milsmile.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main) //Step :1
        binding.tv.text = "Hello" //Step 2: One method of accessing id without findByID
        var e : EmployeeModel = EmployeeModel("KSR",70000)
        binding.empDetails  = e //Step 3: set object to layout
    }
}