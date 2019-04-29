package com.thedeveloperworldisyours.simpledagger

import android.util.Log
import javax.inject.Inject



class Remote @Inject
internal constructor() {
    private val TAG = "Car"

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }
}