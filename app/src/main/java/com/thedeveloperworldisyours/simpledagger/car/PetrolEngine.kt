package com.thedeveloperworldisyours.simpledagger.car

import com.thedeveloperworldisyours.simpledagger.car.Engine
import javax.inject.Inject

class PetrolEngine @Inject
internal constructor() : Engine {
    override fun start(): String {
        return "Petrol"
    }
}