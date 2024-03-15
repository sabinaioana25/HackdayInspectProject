package com.example.myapplication

import androidx.compose.material3.ExperimentalMaterial3Api

@OptIn(ExperimentalMaterial3Api::class)
data class ItemRow(val iconIdOne: Int,
                   val text: String,
                   val iconIdTwo: Int) {}
