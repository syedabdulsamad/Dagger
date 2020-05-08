package com.example.daggerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        //car = component.getCar()
        component.inject(this)
        car.drive()
    }
}
