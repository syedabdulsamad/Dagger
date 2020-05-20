package com.example.daggerexample

import com.example.daggerexample.driver.Driver
import com.example.daggerexample.driver.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver


}