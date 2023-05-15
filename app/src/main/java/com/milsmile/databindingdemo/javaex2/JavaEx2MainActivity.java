package com.milsmile.databindingdemo.javaex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.milsmile.databindingdemo.R;
import com.milsmile.databindingdemo.databinding.ActivityJavaEx2MainBinding;

public class JavaEx2MainActivity extends AppCompatActivity {
    ActivityJavaEx2MainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_java_ex2_main);
        EmployeeModel obj=new EmployeeModel("KSR","50000");
        binding.setEmpObj(obj);
    }
}