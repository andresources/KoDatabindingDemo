package com.milsmile.databindingdemo.javaex4_image;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class EmployeeModel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public EmployeeModel(String name, String imgUrl) {
        this.name = name;
        this.imgUrl = imgUrl;
    }

    @BindingAdapter("android:background")
    public static void setImageViewResource(ImageView imageView,  String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }
    String name;
    String imgUrl;
}
