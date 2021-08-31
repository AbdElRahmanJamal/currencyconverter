package com.app.core.data.data_source.concurrency_converter

import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import com.app.core.domain.util.ResourceState
import kotlinx.coroutines.flow.Flow

interface ConcurrencyConverterDataSource {

    suspend fun getLatestConcurrencyRatesBasedOnEuro(): Flow<ResourceState<ConcurrencyRatesResponse>>

    suspend fun saveConcurrencyRate(concurrencyRatesResponse: ConcurrencyRatesResponse) {

    }
}
