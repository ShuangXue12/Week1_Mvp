package com.example.week1_mvp1.utils;

import java.util.HashMap;

public interface INetWorkInterface {
    public <T> void get(String url, INetCallBack<T> callBack);

    public <T> void post(String url, INetCallBack<T> callBack);

    public <T> void postPart(String url, HashMap<String, String> map, INetCallBack<T> callBack);
}
