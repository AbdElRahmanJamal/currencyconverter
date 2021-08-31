package com.app.currencyconverter.framework.data_source.remote.di

import android.content.Context
import com.app.core.data.data_source.concurrency_converter.ConcurrencyConverterDataSource
import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import com.app.core.data.data_source.concurrency_converter.repository.ConcurrencyConverterRepositoryContract
import com.app.core.domain.interactors.concurrency_converter.GetLatestConcurrencyRatesBasedOnEuroUseCase
import com.app.core.domain.repository.ConcurrencyConverterRepository
import com.app.core.domain.util.DIQualifier
import com.app.currencyconverter.framework.data_source.remote.CurrencyConverterApis
import com.app.currencyconverter.framework.data_source.remote.CurrencyConverterRemoteDataSource
import com.app.currencyconverter.framework.data_source.remote.NetworkHandler
import com.app.currencyconverter.presentation.main_screen.CurrencyConverterScreenViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainCoroutineDispatcher
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CurrencyConverterRemoteDI {


    @Provides
    @Singleton
    fun providesIODispatcher(): CoroutineDispatcher {
        return Dispatchers.IO
    }

    @Provides
    @Singleton
    fun providesMainDispatcher(): MainCoroutineDispatcher {
        return Dispatchers.Main
    }


    @Provides
    @Singleton
    fun providesNetworkHandler(ioDispatcher: CoroutineDispatcher)
            : NetworkHandler<ConcurrencyRatesResponse> = NetworkHandler(ioDispatcher)

    @Provides
    @Singleton
    fun providesCurrencyConverterApi(retrofit: Retrofit): CurrencyConverterApis =
        retrofit.create(CurrencyConverterApis::class.java)

    @DIQualifier.QualifierConcurrencyConverterRemoteDataSource
    @Provides
    @Singleton
    fun providesCurrencyConverterRemoteDataSource(
        networkHandler: NetworkHandler<ConcurrencyRatesResponse>,
        currencyConverterApis: CurrencyConverterApis,
    ): ConcurrencyConverterDataSource =
        CurrencyConverterRemoteDataSource(networkHandler, currencyConverterApis)

    @Provides
    @Singleton
    fun providesConcurrencyConverterRepositoryContract(
        @DIQualifier.QualifierConcurrencyConverterRemoteDataSource
        remote: ConcurrencyConverterDataSource,
        @DIQualifier.QualifierConcurrencyConverterLocalDataSource
        local: ConcurrencyConverterDataSource,
        @ApplicationContext context: Context
    ): ConcurrencyConverterRepositoryContract =
        ConcurrencyConverterRepository(remote, local, context)

    @Provides
    @Singleton
    fun providesCurrencyConverterScreenViewModel(
        getLatestConcurrencyRatesBasedOnEuroUseCase:
        GetLatestConcurrencyRatesBasedOnEuroUseCase,
        iODispatcher: CoroutineDispatcher
    ): CurrencyConverterScreenViewModel =
        CurrencyConverterScreenViewModel(getLatestConcurrencyRatesBasedOnEuroUseCase, iODispatcher)


}