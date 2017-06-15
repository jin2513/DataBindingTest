package com.example.hub_dev_1.databindingtest;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hub_dev_1.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
    }

    public void onButtonClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.bt_ob:
                intent = new Intent(this, ObservableActivity.class);
                break;

            case R.id.bt_field:
                intent = new Intent(this, ObservableFieldActivity.class);
                break;

            case R.id.bt_recyclerView:
                intent = new Intent(this, RecyclerViewActivity.class);
                break;
        }

        startActivity(intent);

    }

}