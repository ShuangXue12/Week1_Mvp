package com.example.week1_mvp1.presenter;

import com.example.week1_mvp1.constract.LoginConstract;
import com.example.week1_mvp1.model.LoginModel;

public class LoginPresenter implements LoginConstract.ILoginPresenter {
    private final LoginModel loginModel;
    private LoginConstract.ILoginView iLoginView;

    public LoginPresenter(LoginConstract.ILoginView iLoginView) {
        loginModel = new LoginModel(this);
        this.iLoginView = iLoginView;
    }

    @Override
    public void login(String username, String password) {
        loginModel.getLoginData();
    }

    @Override
    public void loginResult(String result) {
        loginResult(result);
    }
}
