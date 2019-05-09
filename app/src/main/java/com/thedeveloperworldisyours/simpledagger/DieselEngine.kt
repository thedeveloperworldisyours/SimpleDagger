package com.thedeveloperworldisyours.simpledagger

import javax.inject.Inject

class DieselEngine @Inject
internal constructor():Engine {
    override fun start(): String {
        return "Diesel"
    }
}