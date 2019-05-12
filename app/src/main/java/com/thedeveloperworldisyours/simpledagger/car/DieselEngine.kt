package com.thedeveloperworldisyours.simpledagger.car

import javax.inject.Inject

class DieselEngine @Inject
internal constructor(var horsePower: String) : Engine {

    override fun start(): String {
        return "Diesel...horsePower:$horsePower"
    }
}