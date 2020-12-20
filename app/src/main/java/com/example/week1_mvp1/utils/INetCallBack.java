package com.example.week1_mvp1.utils;

public interface INetCallBack<T> {
    void onSuccess(T t);

    void onFail(String error);
}
