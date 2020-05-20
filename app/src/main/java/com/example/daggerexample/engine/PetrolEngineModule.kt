package com.example.daggerexample.engine

import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}