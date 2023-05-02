package com.example.livedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun updateCount()
    {
        count.value = (count.value)?.plus(1)
    }

    fun resetCount()
    {
        count.value = 0
    }

}