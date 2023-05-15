package com.milsmile.databindingdemo.javaex52waybinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.milsmile.databindingdemo.R;
import com.milsmile.databindingdemo.databinding.ActivityEx5TwoBindingMainBinding;

public class Ex5TwoBindingMainActivity extends AppCompatActivity implements MyButtonClickListener{
    ActivityEx5TwoBindingMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_ex5_two_binding_main);
        UserData userData = new UserData(this);
        userData.setEmail("");
        userData.setPassword("");
        binding.setUserdata(userData);
        binding.setOnclicklistener(this);
    }

    @Override
    public void onButtonClick(UserData userData) {

    }
}