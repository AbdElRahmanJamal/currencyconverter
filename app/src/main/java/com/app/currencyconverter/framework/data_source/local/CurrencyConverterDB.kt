package com.app.currencyconverter.framework.data_source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.currencyconverter.framework.data_source.local.entity.CurrencyEntity

@Database(entities = [CurrencyEntity::class], version = 1)

abstract class CurrencyConverterDB : RoomDatabase() {
    abstract fun getCurrencyConverterDao(): CurrencyConverterDao
}

