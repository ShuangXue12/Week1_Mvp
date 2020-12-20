package com.example.week1_mvp1;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.week1_mvp1.base.LoginBase;
import com.example.week1_mvp1.constract.LoginConstract;
import com.example.week1_mvp1.presenter.LoginPresenter;

public class MainActivity extends LoginBase<LoginPresenter> implements LoginConstract.ILoginView {

    private EditText mEditTextTextPersonName;
    private EditText mEditTextTextPassword;
    private Button mButton;
    private LoginPresenter loginPresenter;

    @Override
    protected LoginPresenter getPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected void initData() {
        loginPresenter.login(UserName(), PassWord());
    }

    protected void initView() {
        mEditTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        mEditTextTextPassword = (EditText) findViewById(R.id.editTextTextPassword);
        mButton = (Button) findViewById(R.id.button);
        loginPresenter = new LoginPresenter(this);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initVV();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    private void initVV() {
        if (!TextUtils.isEmpty(UserName()) && !TextUtils.isEmpty(PassWord())) {
            loginPresenter.login(UserName(), PassWord());
        }
    }

    @Override
    public String UserName() {
        return mEditTextTextPersonName.getText().toString();
    }

    @Override
    public String PassWord() {
        return mEditTextTextPassword.getText().toString();
    }

    @Override
    public void getLoginData(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}