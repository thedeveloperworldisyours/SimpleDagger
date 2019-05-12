package com.thedeveloperworldisyours.simpledagger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.thedeveloperworldisyours.simpledagger.car.Car
import com.thedeveloperworldisyours.simpledagger.dagger.CarComponent
import com.thedeveloperworldisyours.simpledagger.dagger.DaggerCarComponent
import com.thedeveloperworldisyours.simpledagger.dagger.DieselEngineModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.builder()
            .horsePower("122")
            .engineCapacity("1200")
            .build()

        carComponent.inject(this)

        text_view.text = car.drive()

    }
}
