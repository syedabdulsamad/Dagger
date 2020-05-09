package com.example.daggerexample.Engine

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun start() {
        Log.d("Car", "Diesel engine started... Horse power is : $horsePower")

    }
}