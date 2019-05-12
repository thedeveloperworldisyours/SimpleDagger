package com.thedeveloperworldisyours.simpledagger.dagger

import com.thedeveloperworldisyours.simpledagger.car.Engine
import com.thedeveloperworldisyours.simpledagger.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule(val horsePower: String) {

    @Binds
    abstract fun bindsEngine(engine: PetrolEngine): Engine
}