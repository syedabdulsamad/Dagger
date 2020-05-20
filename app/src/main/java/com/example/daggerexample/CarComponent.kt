package com.example.daggerexample

import com.example.daggerexample.engine.PetrolEngineModule
import com.example.daggerexample.wheels.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@PerActivity
@Component(
    dependencies = [AppComponent::class], modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        fun build(): CarComponent
        fun appComponent(component: AppComponent): Builder

        @BindsInstance
        fun horsePower(@Named(value = "horse power") horsePower: Int): Builder


        @BindsInstance
        fun capacity(@Named(value = "capacity") capacity: Int): Builder

    }
}