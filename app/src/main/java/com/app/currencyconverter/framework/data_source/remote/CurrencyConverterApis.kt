package com.app.currencyconverter.framework.data_source.remote

import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import com.app.core.domain.util.AppConstants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyConverterApis {

    @GET("latest")
    suspend fun getCurrencyRateToEuro(
        @Query("access_key")
        apiKey: String = AppConstants.API_KEY
    ): Response<ConcurrencyRatesResponse>
}