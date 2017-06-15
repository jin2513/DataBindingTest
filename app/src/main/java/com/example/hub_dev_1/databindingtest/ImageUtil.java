package com.example.hub_dev_1.databindingtest;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by hub_dev_1 on 2017-06-15.
 */

public class ImageUtil {
    public static void loadImage(ImageView imageView, String url, Drawable errorDrawable) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }
}
