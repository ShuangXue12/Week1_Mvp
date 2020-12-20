package com.example.week1_mvp1.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class LoginBase<T> extends AppCompatActivity {
    private T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        if (presenter==null){
            presenter=getPresenter();
        }
        initView();
        initData();
    }

    protected abstract T getPresenter();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutId();

}
