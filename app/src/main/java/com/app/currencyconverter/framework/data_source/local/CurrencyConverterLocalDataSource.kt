package com.app.currencyconverter.framework.data_source.local

import com.app.core.data.data_source.concurrency_converter.ConcurrencyConverterDataSource
import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import com.app.core.domain.util.AppExceptions
import com.app.core.domain.util.ResourceState
import com.app.currencyconverter.framework.data_source.local.converter.EntityDomainMapper
import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CurrencyConverterLocalDataSource @Inject constructor(
    private val currencyConverterDao: CurrencyConverterDao,
    private val entityDomainMapper: EntityDomainMapper,
    private val gson: Gson
) : ConcurrencyConverterDataSource {

    override suspend fun getLatestConcurrencyRatesBasedOnEuro():
            Flow<ResourceState<ConcurrencyRatesResponse>> {
        return flow {
            emit(ResourceState.LoadingState)
            runCatching {
                currencyConverterDao.getCurrencyRatesBasedOnEuro()
            }.onFailure {
                emit(ResourceState.ErrorState(AppExceptions.GenericErrorException))
            }.onSuccess { dataBaseModel ->
                dataBaseModel?.currencyRate?.let {
                    emit(
                        ResourceState.DataStat(
                            entityDomainMapper.convertLocalEntityToRemoteEntity(gson, it)
                        )
                    )
                } ?: emit(ResourceState.ErrorState(AppExceptions.GenericErrorException))
            }
        }
    }

    override suspend fun saveConcurrencyRate(concurrencyRatesResponse: ConcurrencyRatesResponse) {
        currencyConverterDao.removeAllDB()
        currencyConverterDao.updateInsert(
            entityDomainMapper.convertRemoteEntityToLocalEntity(
                gson, concurrencyRatesResponse
            )
        )

    }
}