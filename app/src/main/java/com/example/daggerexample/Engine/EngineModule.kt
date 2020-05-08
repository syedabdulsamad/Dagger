package com.example.daggerexample.Engine

import dagger.Binds
import dagger.Module

@Module
abstract class EngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}