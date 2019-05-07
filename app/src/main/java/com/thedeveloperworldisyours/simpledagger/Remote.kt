package com.thedeveloperworldisyours.simpledagger

import javax.inject.Inject

class Remote @Inject
internal constructor() {

    fun setListener(car: Car): String {
        return "Remote connected"
    }
}