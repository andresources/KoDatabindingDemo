package com.milsmile.databindingdemo.javaex3_button_click;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.milsmile.databindingdemo.R;
import com.milsmile.databindingdemo.databinding.ActivityJavaEx3MainBinding;

public class JavaEx3MainActivity extends AppCompatActivity {
    ActivityJavaEx3MainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_java_ex3_main);
        binding.setMyObj(this);
    }

    public void displayData(){
        Toast.makeText(this, "Helloo", Toast.LENGTH_SHORT).show();
    }
}