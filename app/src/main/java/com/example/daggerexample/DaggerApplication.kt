package com.example.daggerexample

import android.app.Application

class DaggerApplication : Application() {

    private lateinit var component: AppComponent


    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
//            DaggerCarComponent.builder()
//            .horsePower(200)
//            .capacity(1000)
//            .build()
    }

    fun getComponent(): AppComponent {
        return component
    }


}