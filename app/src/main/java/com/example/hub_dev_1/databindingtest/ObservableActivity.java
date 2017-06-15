package com.example.hub_dev_1.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hub_dev_1.databindingtest.databinding.ActivityObservableBinding;

/**
 * Created by hub_dev_1 on 2017-06-15.
 */

public class ObservableActivity extends AppCompatActivity {

    ActivityObservableBinding binding;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        user = new User("firstName", "lastName", 0);
        binding.setActivity(this);
        binding.setUser(user);
    }

    public void onButtonClick(View view) {
        user.setDisplayName("displayName");
    }

}