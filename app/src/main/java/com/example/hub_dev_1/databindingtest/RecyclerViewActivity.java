package com.example.hub_dev_1.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.example.hub_dev_1.databindingtest.databinding.ActivityRecyclerviewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hub_dev_1 on 2017-06-15.
 */

public class RecyclerViewActivity extends AppCompatActivity {

    ActivityRecyclerviewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recyclerview);
        binding.setActivity(this);

        List<User> users = new ArrayList();

        users.add(new User("Ted", "http://cfile25.uf.tistory.com/image/251F6B4C558E627E26807B", 32));
        users.add(new User("Jane", "http://image.celebtide.com/celeb/new/ve/279_ve_1452259300.jpg", 11));
        users.add(new User("Paul", "http://res.heraldm.com/content/image/2013/12/01/20131201000224_0.jpg", 16));
        users.add(new User("Ailee", "http://cfile8.uf.tistory.com/image/194599374F7049A9010251", 22));

        binding.rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        binding.rv.addItemDecoration(new SimpleDividerItemDecoration(this));
        RecyclerAdapter adapter = new RecyclerAdapter(this);
        binding.rv.setAdapter(adapter);
        adapter.updateItems(users);
    }

}
