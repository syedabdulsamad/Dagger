package com.example.daggerexample.driver

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {

    @Singleton
    @Provides
    fun getDriver(): Driver {
        return Driver()

    }
}