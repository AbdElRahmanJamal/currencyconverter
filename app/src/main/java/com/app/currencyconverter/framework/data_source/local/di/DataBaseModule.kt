package com.app.currencyconverter.framework.data_source.local.di

import android.content.Context
import androidx.room.Room
import com.app.core.domain.util.AppConstants
import com.app.currencyconverter.framework.data_source.local.CurrencyConverterDB
import com.app.currencyconverter.framework.data_source.local.CurrencyConverterDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun providesCurrencyConverterDaoDao(newsDatabase: CurrencyConverterDB): CurrencyConverterDao =
        newsDatabase.getCurrencyConverterDao()

    @Provides
    @Singleton
    fun providesCurrencyConverterDatabase(@ApplicationContext context: Context): CurrencyConverterDB =
        Room.databaseBuilder(context, CurrencyConverterDB::class.java, AppConstants.DATA_BASE_NAME)
            .build()

}