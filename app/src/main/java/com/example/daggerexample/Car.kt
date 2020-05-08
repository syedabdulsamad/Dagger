package com.example.daggerexample

import android.util.Log
import com.example.daggerexample.Wheels.Wheels
import javax.inject.Inject

class Car @Inject constructor(private val wheels: Wheels, private val engine: Engine) {

    fun drive() {
        Log.d("Car", "driving...")
    }
}