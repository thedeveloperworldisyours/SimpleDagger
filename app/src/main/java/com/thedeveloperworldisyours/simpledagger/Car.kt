package com.thedeveloperworldisyours.simpledagger

import android.util.Log
import javax.inject.Inject

class Car() {

    lateinit var engine: Engine
    lateinit var wheels: Wheels

    @Inject
    constructor(
        engine: Engine,
        wheels: Wheels
    ) : this() {
        this.engine = engine
        this.wheels = wheels

    }

    fun drive():String {
        return "driving..."
    }
}