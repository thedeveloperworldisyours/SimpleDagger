package com.thedeveloperworldisyours.simpledagger

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun provideEngine(engine: PetrolEngine): Engine {
        return engine
    }
}