package com.example.databindingdemo

import android.widget.TextView
import androidx.databinding.BindingAdapter

/**
 * Created by Nishant Kumar on 25-May-2022.
 */

@BindingAdapter("title")
fun TextView.changeTitle(title: String) {
    apply {
        text = title
    }
}