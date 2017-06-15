package com.example.hub_dev_1.databindingtest;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by hub_dev_1 on 2017-06-15.
 */

public class BindingAdapter {
    @android.databinding.BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView imageView, String url, Drawable errorDrawable) {
        ImageUtil.loadImage(imageView, url, errorDrawable);
    }
}
