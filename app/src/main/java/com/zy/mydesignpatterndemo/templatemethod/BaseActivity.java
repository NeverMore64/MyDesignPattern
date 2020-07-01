package com.zy.mydesignpatterndemo.templatemethod;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * create by zy on 2020/7/1
 * </p>
 */
public abstract class BaseActivity extends AppCompatActivity {

    abstract int setLayoutId();

    abstract void initData();

    abstract void initTitle();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        initTitle();
        initData();
    }
}
