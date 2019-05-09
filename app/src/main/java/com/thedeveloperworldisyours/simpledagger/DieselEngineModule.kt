package com.thedeveloperworldisyours.simpledagger

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun provideEngine(engine:DieselEngine):Engine{
        return engine
    }
}