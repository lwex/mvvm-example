package com.wong.mvvm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class UserBean extends BaseObservable {
    private String name; //姓名
    private int age; //年龄

    public UserBean(String name ,int age){
        this.name =name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR._all);//通知数据更新UI
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR._all);
    }

}
