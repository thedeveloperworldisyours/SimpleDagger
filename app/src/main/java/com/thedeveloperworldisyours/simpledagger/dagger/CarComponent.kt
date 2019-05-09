package com.thedeveloperworldisyours.simpledagger.dagger

import com.thedeveloperworldisyours.simpledagger.MainActivity
import com.thedeveloperworldisyours.simpledagger.car.Car
import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    val car: Car

    fun inject(mainActivity: MainActivity)
}