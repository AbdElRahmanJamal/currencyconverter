package com.app.currencyconverter.framework.data_source.local.converter

import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import com.app.currencyconverter.framework.data_source.local.entity.CurrencyEntity
import com.google.gson.Gson
import javax.inject.Inject

class EntityDomainMapper @Inject constructor() {


    fun convertRemoteEntityToLocalEntity(
        gson: Gson,
        concurrencyRatesResponse: ConcurrencyRatesResponse
    ): CurrencyEntity {
        return CurrencyEntity(currencyRate = gson.toJson(concurrencyRatesResponse))
    }

    fun convertLocalEntityToRemoteEntity(gson: Gson, json: String): ConcurrencyRatesResponse {
        return gson.fromJson(json, ConcurrencyRatesResponse::class.java)
    }
}