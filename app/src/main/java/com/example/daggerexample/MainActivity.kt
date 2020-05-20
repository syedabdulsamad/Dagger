package com.example.daggerexample

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component1: CarComponent = DaggerCarComponent.builder()
            .capacity(2000)
            .horsePower(500)
            .appComponent((application as DaggerApplication).getComponent())
            .build()


        component1.inject(this)
        car1.drive()
        car2.drive()
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("Changed", "Changed")
    }
}
