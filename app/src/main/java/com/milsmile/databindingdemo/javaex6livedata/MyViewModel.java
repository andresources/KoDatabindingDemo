package com.milsmile.databindingdemo.javaex6livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public MutableLiveData<String> mutableLiveData=new MutableLiveData<>("Welcome to the App ");
    public void updateLiveData(){
        mutableLiveData.setValue("Update text...");
    }


}
