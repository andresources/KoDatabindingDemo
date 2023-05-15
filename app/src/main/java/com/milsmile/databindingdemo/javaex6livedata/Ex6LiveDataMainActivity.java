package com.milsmile.databindingdemo.javaex6livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.milsmile.databindingdemo.R;
import com.milsmile.databindingdemo.databinding.ActivityEx6LiveDataMainBinding;

public class Ex6LiveDataMainActivity extends AppCompatActivity {
    ActivityEx6LiveDataMainBinding binding;
    MyViewModel myViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_ex6_live_data_main);
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.setMyViewModel(myViewModel);
        binding.setLifecycleOwner(this);
    }
}