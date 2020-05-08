package com.example.daggerexample

import com.example.daggerexample.Wheels.WheelsModule
import dagger.Component

@Component(modules = [WheelsModule::class])
public interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)
}