package com.anuar.cryptocurrencyapp.presentation

import android.app.Application
import com.anuar.cryptocurrencyapp.di.DaggerApplicationComponent

class MyApplication:Application() {
    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}