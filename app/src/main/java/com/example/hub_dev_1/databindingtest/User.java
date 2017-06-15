package com.example.hub_dev_1.databindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by hub_dev_1 on 2017-06-14.
 */

public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    private String displayName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    @Bindable
    public String getDisplayName() {
        return this.displayName;
    }

    @Bindable
    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.example.hub_dev_1.databindingtest.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.example.hub_dev_1.databindingtest.BR.lastName);
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
        notifyPropertyChanged(BR.displayName);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
