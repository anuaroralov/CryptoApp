package com.anuar.cryptocurrencyapp.di

import android.app.Application
import com.anuar.cryptocurrencyapp.presentation.CoinDetailFragment
import com.anuar.cryptocurrencyapp.presentation.CoinPriceListFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DomainModule::class,DataModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(fragment1: CoinDetailFragment)

    fun inject(fragment1: CoinPriceListFragment)

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(@BindsInstance application: Application):ApplicationComponent
    }
}