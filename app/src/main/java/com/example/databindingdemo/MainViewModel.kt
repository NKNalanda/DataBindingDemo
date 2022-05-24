package com.example.databindingdemo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

/**
 * Created by Nishant Kumar on 25-May-2022.
 */

class MainViewModel(appln: Application): AndroidViewModel(appln) {
    val topicLiveData = MutableLiveData("Kuch v")
}