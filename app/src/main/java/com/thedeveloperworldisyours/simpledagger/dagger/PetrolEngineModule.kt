package com.thedeveloperworldisyours.simpledagger.dagger

import com.thedeveloperworldisyours.simpledagger.car.Engine
import com.thedeveloperworldisyours.simpledagger.car.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun provideEngine(engine: PetrolEngine): Engine {
        return engine
    }
}