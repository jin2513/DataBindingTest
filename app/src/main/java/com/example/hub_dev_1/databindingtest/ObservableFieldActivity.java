package com.example.hub_dev_1.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hub_dev_1.databindingtest.databinding.ActivityObservableClickBinding;

/**
 * Created by hub_dev_1 on 2017-06-15.
 */

public class ObservableClickActivity extends AppCompatActivity {

    ActivityObservableClickBinding binding;
    Friend friend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        friend = new Friend("firstName", "lastName");
        binding.setActivity(this);
        binding.setFriend(friend);
    }

    public void onButtonClick(View view) {
        friend.setFirstName("firstName Click");
        friend.setLastName("lastName Click");
    }

}