package com.thedeveloperworldisyours.simpledagger.dagger

import com.thedeveloperworldisyours.simpledagger.car.DieselEngine
import com.thedeveloperworldisyours.simpledagger.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: String) {

    @Provides
    internal fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}