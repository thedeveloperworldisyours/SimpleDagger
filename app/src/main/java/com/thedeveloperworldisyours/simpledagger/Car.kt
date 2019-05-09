package com.thedeveloperworldisyours.simpledagger

import javax.inject.Inject

class Car() {

    lateinit var engine: Engine
    lateinit var wheels: Wheels
    var remoteString = ""

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
        remoteString = remote.setListener(this)
    }

    fun drive(): String {

        return "driving...${remoteString}...${wheels.tires.inflate()}...${engine.start()}"
    }
}