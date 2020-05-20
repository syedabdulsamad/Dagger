package com.example.daggerexample.engine

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun bindsEngine(): Engine {
        return DieselEngine(horsePower)

    }

}