package com.example.daggerexample.engine

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named(value = "horse power") private val horsePower: Int,
    @Named(value = "capacity") private val capacity: Int
) : Engine {

    override fun start() {
        Log.d(
            "Car", "Petrol engine started... " +
                    "\nHorsepower : $horsePower " +
                    "\n Engine capacity : $capacity"
        )
    }
}