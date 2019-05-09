package com.thedeveloperworldisyours.simpledagger

import javax.inject.Inject

class PetrolEngine @Inject
internal constructor() : Engine {
    override fun start(): String {
        return "Petrol"
    }
}