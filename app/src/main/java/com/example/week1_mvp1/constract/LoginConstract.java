package com.example.week1_mvp1.constract;

public class LoginConstract {
    public interface ILoginModel {
        <T> void getLoginData();
    }

    public interface ILoginPresenter {
        void login(String username, String password);

        void loginResult(String result);
    }

    public interface ILoginView {
        String UserName();

        String PassWord();

        void getLoginData(String string);
    }
}
