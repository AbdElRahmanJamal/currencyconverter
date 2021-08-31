package com.app.core.domain.ui_model

import android.os.Parcel
import android.os.Parcelable

data class CurrencyUIModel(val name: String?, val value: Double) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeDouble(value)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CurrencyUIModel> {
        override fun createFromParcel(parcel: Parcel): CurrencyUIModel {
            return CurrencyUIModel(parcel)
        }

        override fun newArray(size: Int): Array<CurrencyUIModel?> {
            return arrayOfNulls(size)
        }
    }
}