package com.app.currencyconverter.framework.data_source.remote

import com.app.core.data.data_source.concurrency_converter.ConcurrencyConverterDataSource
import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import javax.inject.Inject

class CurrencyConverterRemoteDataSource @Inject constructor(
    private val networkHandler: NetworkHandler<ConcurrencyRatesResponse>,
    private val currencyConverterApis: CurrencyConverterApis
) : ConcurrencyConverterDataSource {

    override suspend fun getLatestConcurrencyRatesBasedOnEuro() =
        networkHandler.callAPI { currencyConverterApis.getCurrencyRateToEuro() }

}