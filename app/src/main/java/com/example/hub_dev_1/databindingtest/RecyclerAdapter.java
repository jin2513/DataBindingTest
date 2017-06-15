package com.example.hub_dev_1.databindingtest;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hub_dev_1.databindingtest.databinding.ItemRecyclerviewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hub_dev_1 on 2017-06-15.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.UserViewHolder> {

    Context mContext;
    List<User> mUserList;

    public RecyclerAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = getItem(position);
        holder.binding.setUser(user);
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        ItemRecyclerviewBinding binding;

        public UserViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

    public void updateItems(List<User> items) {

        if (this.mUserList == null) {
            mUserList = new ArrayList<>();
        }
        this.mUserList.clear();
        this.mUserList.addAll(items);

        notifyDataSetChanged();
    }

    public User getItem(int position) {
        if (mUserList == null)
            return null;


        return mUserList.get(position);
    }

}
