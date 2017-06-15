package com.example.hub_dev_1.databindtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hub_dev_1.databindtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Friend friend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        friend = new Friend("firstName", "lastName");
        binding.setActivity(this);
        binding.setFriend(friend);
    }

    public void onButtonClick(View view) {
        friend.setFirstName("firstName");
        friend.setLastName("lastName");
    }



}
