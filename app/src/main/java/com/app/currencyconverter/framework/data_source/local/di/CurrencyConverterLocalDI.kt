package com.app.currencyconverter.framework.data_source.local.di

import com.app.core.data.data_source.concurrency_converter.ConcurrencyConverterDataSource
import com.app.core.domain.util.DIQualifier
import com.app.currencyconverter.framework.data_source.local.CurrencyConverterDao
import com.app.currencyconverter.framework.data_source.local.CurrencyConverterLocalDataSource
import com.app.currencyconverter.framework.data_source.local.converter.EntityDomainMapper
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CurrencyConverterLocalDI {

    @Provides
    @Singleton
    fun providesEntityDomainMapper(): EntityDomainMapper = EntityDomainMapper()

    @DIQualifier.QualifierConcurrencyConverterLocalDataSource
    @Provides
    @Singleton
    fun providesCurrencyConverterLocalDataSource(
        currencyConverterDao: CurrencyConverterDao,
        entityDomainMapper: EntityDomainMapper,
        gson: Gson
    ): ConcurrencyConverterDataSource =
        CurrencyConverterLocalDataSource(currencyConverterDao, entityDomainMapper, gson)
}