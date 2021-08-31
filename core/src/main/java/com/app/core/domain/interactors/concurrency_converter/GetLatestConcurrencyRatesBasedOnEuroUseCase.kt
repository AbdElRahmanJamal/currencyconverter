package com.app.core.domain.interactors.concurrency_converter

import com.app.core.domain.mapper.MapConcurrencyResponseUIModel
import com.app.core.data.data_source.concurrency_converter.repository.ConcurrencyConverterRepositoryContract
import com.app.core.domain.util.ResourceState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetLatestConcurrencyRatesBasedOnEuroUseCase
@Inject constructor(
    private val concurrencyConverterRepository: ConcurrencyConverterRepositoryContract,
    private val mapConcurrencyResponseUIModel: MapConcurrencyResponseUIModel
) {

    suspend fun getLatestConcurrencyRatesBasedOnEuro() = flow {
        concurrencyConverterRepository.getLatestConcurrencyRatesBasedOnEuro().collect {
            when (it) {
                is ResourceState.LoadingState -> {
                    emit(it)
                }
                is ResourceState.ErrorState -> {
                    emit(it)
                }
                is ResourceState.DataStat -> {
                    emit(
                        ResourceState.DataStat(
                            mapConcurrencyResponseUIModel.mapConcurrencyRatesResponseToUiModel(
                                it.value
                            )
                        )
                    )
                }
            }
        }
    }
}