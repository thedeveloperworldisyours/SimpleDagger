package com.thedeveloperworldisyours.simpledagger

import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {

    val car: Car

    fun inject(mainActivity: MainActivity)
}