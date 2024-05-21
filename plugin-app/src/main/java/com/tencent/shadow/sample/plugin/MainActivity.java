package com.tencent.shadow.sample.plugin;

import android.app.Activity;
import android.databinding.DataBinderMapperImpl;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;

import com.tencent.shadow.sample.plugin.databinding.ActivityMainBinding;

public class MainActivity extends Activity {
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.text.setText("666666666");
    }
}