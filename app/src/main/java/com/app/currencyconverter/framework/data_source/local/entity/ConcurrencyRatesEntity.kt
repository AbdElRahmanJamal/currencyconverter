package com.app.currencyconverter.framework.data_source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrencyEntity(
    @PrimaryKey(autoGenerate = true)
    var ratesEntityId: Int = 0,
    var currencyRate: String? = null
)