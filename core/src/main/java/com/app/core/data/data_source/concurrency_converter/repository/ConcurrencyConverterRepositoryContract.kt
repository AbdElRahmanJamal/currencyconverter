package com.app.core.data.data_source.concurrency_converter.repository

import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import com.app.core.domain.util.ResourceState
import kotlinx.coroutines.flow.Flow

interface ConcurrencyConverterRepositoryContract {

    suspend fun getLatestConcurrencyRatesBasedOnEuro(): Flow<ResourceState<ConcurrencyRatesResponse>>
}