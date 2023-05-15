package com.milsmile.databindingdemo.javaex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.milsmile.databindingdemo.R;
import com.milsmile.databindingdemo.databinding.ActivityJavaEx1MainBinding;

public class JavaEx1MainActivity extends AppCompatActivity {
    ActivityJavaEx1MainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_java_ex1_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_java_ex1_main);
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvMessage.setText("Hello");
            }
        });
    }
}