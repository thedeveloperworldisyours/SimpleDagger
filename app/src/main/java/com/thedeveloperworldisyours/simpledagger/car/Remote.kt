package com.thedeveloperworldisyours.simpledagger.car

import com.thedeveloperworldisyours.simpledagger.car.Car
import javax.inject.Inject

class Remote @Inject
internal constructor() {

    fun setListener(car: Car): String {
        return "Remote connected"
    }
}