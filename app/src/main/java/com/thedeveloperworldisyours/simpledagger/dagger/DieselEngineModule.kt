package com.thedeveloperworldisyours.simpledagger.dagger

import com.thedeveloperworldisyours.simpledagger.car.DieselEngine
import com.thedeveloperworldisyours.simpledagger.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}