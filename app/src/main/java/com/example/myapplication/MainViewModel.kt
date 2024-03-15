package com.example.myapplication

import android.telecom.Call.Details
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {

    var countState = mutableIntStateOf(savedStateHandle.getOrDefault("count", 0))

    fun incrementCount() {
        countState.intValue += 1
        savedStateHandle["count"] = countState.intValue
    }

    private fun <T> SavedStateHandle.getOrDefault(key: String, default: T)  = get<T>(key) ?: default
}