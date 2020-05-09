package com.example.daggerexample

import com.example.daggerexample.Engine.DieselEngineModule
import com.example.daggerexample.Engine.PetrolEngineModule
import com.example.daggerexample.Wheels.WheelsModule
import dagger.Component

@Component(
    modules = [
        WheelsModule::class,
        DieselEngineModule::class
    ]
)
public interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)
}