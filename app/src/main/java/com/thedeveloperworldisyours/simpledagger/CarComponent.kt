package com.thedeveloperworldisyours.simpledagger

import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    val car: Car

    fun inject(mainActivity: MainActivity)
}