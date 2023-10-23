package com.anuar.cryptocurrencyapp.presentation

import androidx.lifecycle.ViewModel
import com.example.cryptoapp.domain.GetCoinInfoListUseCase
import com.example.cryptoapp.domain.GetCoinInfoUseCase
import com.example.cryptoapp.domain.LoadDataUseCase
import javax.inject.Inject

class MyViewModel @Inject constructor(private val getCoinInfoListUseCase:GetCoinInfoListUseCase,
                                      private val getCoinInfoUseCase:GetCoinInfoUseCase,
                                      private val loadDataUseCase:LoadDataUseCase) : ViewModel() {

    val coinInfoList = getCoinInfoListUseCase()

    fun getDetailInfo(fSym: String) = getCoinInfoUseCase(fSym)

    init {
            loadDataUseCase()
    }
}