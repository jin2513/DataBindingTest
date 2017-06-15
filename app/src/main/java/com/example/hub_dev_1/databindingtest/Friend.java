package com.example.hub_dev_1.databindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by hub_dev_1 on 2017-06-14.
 */

public class Friend extends BaseObservable {
    private String firstName;
    private String lastName;

    public Friend(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.example.hub_dev_1.databindingtest.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.example.hub_dev_1.databindingtest.BR.lastName);
    }
}
