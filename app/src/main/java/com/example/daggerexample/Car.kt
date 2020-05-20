package com.example.daggerexample

import android.util.Log
import com.example.daggerexample.driver.Driver
import com.example.daggerexample.engine.Engine
import com.example.daggerexample.wheels.Wheels
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(
    private val wheels: Wheels,
    private val engine: Engine,
    private val driver: Driver
) {
    fun drive() {
        engine.start()
        Log.d("Car", "Driver: $driver is driving $this")
    }
}