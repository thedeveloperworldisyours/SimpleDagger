package com.thedeveloperworldisyours.simpledagger.car

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject
internal constructor(@Named("horsePower")var horsePetrol: String,
                     @Named ("engineCapacity")var engineCapacity: String) : Engine {

    override fun start(): String {
        return "Petrol..." +
                "\nhorsePower:$horsePetrol" +
                "\n engineCapacity:$engineCapacity"
    }
}