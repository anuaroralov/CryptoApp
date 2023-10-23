package com.anuar.cryptocurrencyapp.di

import android.app.Application
import com.example.cryptoapp.data.database.AppDatabase
import com.example.cryptoapp.data.database.CoinInfoDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    @Provides
    fun provideCoinInfoDao(application: Application): CoinInfoDao {
        return AppDatabase.getInstance(application).coinPriceInfoDao()
    }
}