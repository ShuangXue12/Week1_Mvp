package com.example.week1_mvp1.model;

import com.example.week1_mvp1.constract.LoginConstract;

public class LoginModel implements LoginConstract.ILoginModel {
    private LoginConstract.ILoginPresenter presenter;

    public LoginModel(LoginConstract.ILoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData() {
        presenter.loginResult("登录成功");
    }
}
