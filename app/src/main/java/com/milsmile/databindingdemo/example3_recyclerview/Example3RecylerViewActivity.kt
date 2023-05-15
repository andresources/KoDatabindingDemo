package com.milsmile.databindingdemo.example3_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.milsmile.databindingdemo.R
import com.milsmile.databindingdemo.databinding.ActivityExample3RecylerViewBinding
import com.milsmile.databindingdemo.databinding.FragmentExample2Binding

class Example3RecylerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExample3RecylerViewBinding
    var mutableList:MutableList<DataModel> = mutableListOf();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityExample3RecylerViewBinding>(this,R.layout.activity_example3_recyler_view)
        populateData()
        //binding.rv.adapter = MyAdapter(mutableList,this)
        binding.myadpter = MyAdapter(mutableList,this)
    }
    fun populateData(){
        mutableList.add(DataModel("Version-1","Name-1"))
        mutableList.add(DataModel("Version-2","Name-2"))
        mutableList.add(DataModel("Version-3","Name-3"))
        mutableList.add(DataModel("Version-4","Name-4"))
        mutableList.add(DataModel("Version-5","Name-5"))
    }
}