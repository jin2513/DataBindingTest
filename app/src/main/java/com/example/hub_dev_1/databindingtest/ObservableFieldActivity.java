package com.example.hub_dev_1.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hub_dev_1.databindingtest.databinding.ActivityObservableFieldBinding;

/**
 * Created by hub_dev_1 on 2017-06-15.
 */

public class ObservableFieldActivity extends AppCompatActivity {

    ActivityObservableFieldBinding binding;
    UserField userField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_observable_field);
        userField = new UserField();
        binding.setActivity(this);
        binding.setUserField(userField);
    }

    public void onButtonClick(View view) {
        userField.firstName.set("firstName Ok");
        userField.lastName.set("lastName Ok");
        userField.age.set(11);
    }

}