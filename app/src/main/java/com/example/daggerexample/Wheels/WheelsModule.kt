package com.example.daggerexample.Wheels

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTyres(): Tyres {
        val tyres = Tyres()
        tyres.inflate()
        return tyres
    }

    @Provides
    fun provideWheels(rims: Rims, tyres: Tyres): Wheels {
        return Wheels(rims, tyres)
    }
}