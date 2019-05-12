package com.thedeveloperworldisyours.simpledagger.dagger

import com.thedeveloperworldisyours.simpledagger.MainActivity
import com.thedeveloperworldisyours.simpledagger.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    val car: Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named ("horsePower")horsePower: String):Builder

        @BindsInstance
        fun engineCapacity(@Named ("engineCapacity")engineCapacity: String):Builder

        fun build():CarComponent
    }
}