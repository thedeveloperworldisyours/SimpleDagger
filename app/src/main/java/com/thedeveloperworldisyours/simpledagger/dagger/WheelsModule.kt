package com.thedeveloperworldisyours.simpledagger.dagger

import com.thedeveloperworldisyours.simpledagger.car.Rims
import com.thedeveloperworldisyours.simpledagger.car.Tires
import com.thedeveloperworldisyours.simpledagger.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {


    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires : Tires): Wheels {
        return Wheels(rims, tires)
    }
}