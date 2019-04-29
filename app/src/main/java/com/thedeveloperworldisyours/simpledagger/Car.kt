package com.thedeveloperworldisyours.simpledagger

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

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive():String {
        return "driving..."
    }
}