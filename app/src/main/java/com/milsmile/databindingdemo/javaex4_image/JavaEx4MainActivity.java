package com.milsmile.databindingdemo.javaex4_image;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.milsmile.databindingdemo.R;
import com.milsmile.databindingdemo.databinding.ActivityJavaEx4MainBinding;

public class JavaEx4MainActivity extends AppCompatActivity {
    ActivityJavaEx4MainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_java_ex4_main);
        EmployeeModel obj= new EmployeeModel("KSR","https://www.sakshi.com/sites/default/files/styles/cinema_main/public/article_images/2023/05/15/chiken.jpg");
        binding.setEmpDetails(obj);
    }
}