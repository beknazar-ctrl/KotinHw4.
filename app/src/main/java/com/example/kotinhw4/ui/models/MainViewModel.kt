package com.example.kotinhw4.ui.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var counter = MutableLiveData<Int>()
    var commands = MutableLiveData<String>()

    private var mCounter = 0
    private var plus = "+"
    private var minus = "-"

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter

        commands.value = if (commands.value != null) {
            commands.value + plus
        } else plus
    }
        fun onItemDecrementClick() {
            mCounter--
            counter.value = mCounter

            commands.value = if (commands.value != null) {
                commands.value + minus
            } else minus
        }
    }