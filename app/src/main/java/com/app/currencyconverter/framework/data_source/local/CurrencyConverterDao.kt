package com.app.currencyconverter.framework.data_source.local

import androidx.room.*
import com.app.currencyconverter.framework.data_source.local.entity.CurrencyEntity

@Dao
interface CurrencyConverterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateInsert(RatesEntity: CurrencyEntity)

    @Query("select * from CurrencyEntity")
    fun getCurrencyRatesBasedOnEuro(): CurrencyEntity

    @Query("Delete FROM CurrencyEntity")
    fun removeAllDB()

}