package com.app.core.domain.repository

import android.content.Context
import com.app.core.data.data_source.concurrency_converter.ConcurrencyConverterDataSource
import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import com.app.core.data.data_source.concurrency_converter.repository.ConcurrencyConverterRepositoryContract
import com.app.core.domain.util.DIQualifier
import com.app.core.domain.util.ResourceState
import com.app.core.domain.util.NetworkUtils
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class ConcurrencyConverterRepository @Inject constructor(
    @DIQualifier.QualifierConcurrencyConverterRemoteDataSource
    private val remote: ConcurrencyConverterDataSource,
    @DIQualifier.QualifierConcurrencyConverterLocalDataSource
    private val local: ConcurrencyConverterDataSource,
    @ApplicationContext private val context: Context
) : ConcurrencyConverterRepositoryContract {

    override suspend fun getLatestConcurrencyRatesBasedOnEuro(): Flow<ResourceState<ConcurrencyRatesResponse>> {
        return if (NetworkUtils.isInternetAvailable(context)) {
            remote.getLatestConcurrencyRatesBasedOnEuro().onEach {
                if (it is ResourceState.DataStat)
                    local.saveConcurrencyRate(it.value)
            }
        } else {
            local.getLatestConcurrencyRatesBasedOnEuro()
        }
    }
}