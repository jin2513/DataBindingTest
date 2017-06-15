package com.example.hub_dev_1.databindingtest;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by hub_dev_1 on 2017-06-15.
 */

public class UserField {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
