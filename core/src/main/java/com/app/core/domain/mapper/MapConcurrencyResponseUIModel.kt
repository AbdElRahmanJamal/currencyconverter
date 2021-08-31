package com.app.core.domain.mapper

import com.app.core.data.data_source.concurrency_converter.entity.ConcurrencyRatesResponse
import com.app.core.domain.ui_model.CurrencyUIModel
import javax.inject.Inject


class MapConcurrencyResponseUIModel @Inject constructor() {

    fun mapConcurrencyRatesResponseToUiModel(concurrencyRatesResponse: ConcurrencyRatesResponse): MutableList<CurrencyUIModel> {

        val rates = concurrencyRatesResponse.rates
        val listOfCurrency = mutableListOf<CurrencyUIModel>()

        listOfCurrency.add(
            CurrencyUIModel(
                "EUR", rates?.EUR?.toDouble() ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "AED", rates?.AED ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "AFN", rates?.AFN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ALL", rates?.ALL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "AMD", rates?.AMD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ANG", rates?.ANG ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "AOA", rates?.AOA ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ARS", rates?.ARS ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "AUD", rates?.AUD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "AWG", rates?.AWG ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "AZN", rates?.AZN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BAM", rates?.BAM ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BBD", rates?.BBD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BDT", rates?.BDT ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BGN", rates?.BGN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BHD", rates?.BHD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BIF", rates?.BIF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BMD", rates?.BMD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BND", rates?.BND ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BOB", rates?.BOB ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BRL", rates?.BRL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BSD", rates?.BSD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BTC", rates?.BTC ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BTN", rates?.BTN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BWP", rates?.BWP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BYN", rates?.BYN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BYR", rates?.BYR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "BZD", rates?.BZD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CAD", rates?.CAD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CDF", rates?.CDF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CHF", rates?.CHF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CLF", rates?.CLF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CLP", rates?.CLP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CNY", rates?.CNY ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "COP", rates?.COP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CRC", rates?.CRC ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CUC", rates?.CUC ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CUP", rates?.CUP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CVE", rates?.CVE ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "CZK", rates?.CZK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "DJF", rates?.DJF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "DKK", rates?.DKK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "DOP", rates?.DOP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "DZD", rates?.DZD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "EGP", rates?.EGP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ERN", rates?.ERN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ETB", rates?.ETB ?: 0.0
            )
        )

        listOfCurrency.add(
            CurrencyUIModel(
                "FJD", rates?.FJD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "FKP", rates?.FKP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GBP", rates?.GBP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GEL", rates?.GEL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GGP", rates?.GGP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GHS", rates?.GHS ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GIP", rates?.GIP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GMD", rates?.GMD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GNF", rates?.GNF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GTQ", rates?.GTQ ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "GYD", rates?.GYD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "HKD", rates?.HKD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "HNL", rates?.HNL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "HRK", rates?.HRK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "HTG", rates?.HTG ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "HUF", rates?.HUF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "IDR", rates?.IDR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ILS", rates?.ILS ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "IMP", rates?.IMP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "INR", rates?.INR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "IQD", rates?.IQD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "IRR", rates?.IRR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ISK", rates?.ISK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "JEP", rates?.JEP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "JMD", rates?.JMD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "JOD", rates?.JOD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "JPY", rates?.JPY ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KES", rates?.KES ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KGS", rates?.KGS ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KHR", rates?.KHR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KMF", rates?.KMF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KPW", rates?.KPW ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KRW", rates?.KRW ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KWD", rates?.KWD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KYD", rates?.KYD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "KZT", rates?.KZT ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "LAK", rates?.LAK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "LBP", rates?.LBP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "LKR", rates?.LKR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "LRD", rates?.LRD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "LSL", rates?.LSL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "LTL", rates?.LTL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "LVL", rates?.LVL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "LYD", rates?.LYD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MAD", rates?.MAD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MDL", rates?.MDL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MGA", rates?.MGA ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MKD", rates?.MKD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MMK", rates?.MMK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MNT", rates?.MNT ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MOP", rates?.MOP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MRO", rates?.MRO ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MUR", rates?.MUR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MVR", rates?.MVR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MWK", rates?.MWK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MXN", rates?.MXN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MYR", rates?.MYR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "MZN", rates?.MZN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "NAD", rates?.NAD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "NGN", rates?.NGN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "NIO", rates?.NIO ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "NOK", rates?.NOK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "NPR", rates?.NPR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "NZD", rates?.NZD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "OMR", rates?.OMR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "PAB", rates?.PAB ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "PEN", rates?.PEN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "PGK", rates?.PGK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "PHP", rates?.PHP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "PKR", rates?.PKR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "PLN", rates?.PLN ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "PYG", rates?.PYG ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "QAR", rates?.QAR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "RON", rates?.QAR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "RSD", rates?.RSD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "RUB", rates?.RUB ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "RWF", rates?.RWF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SAR", rates?.SAR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SBD", rates?.SBD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SCR", rates?.SCR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SDG", rates?.SDG ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SEK", rates?.SEK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SGD", rates?.SGD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SHP", rates?.SHP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SLL", rates?.SLL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SOS", rates?.SOS ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SRD", rates?.SRD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "STD", rates?.STD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SVC", rates?.SVC ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SYP", rates?.SYP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "SZL", rates?.SZL ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "THB", rates?.THB ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "TJS", rates?.TJS ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "TMT", rates?.TMT ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "TND", rates?.TND ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "TOP", rates?.TOP ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "TRY", rates?.TRY ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "TTD", rates?.TTD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "TWD", rates?.TWD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "TZS", rates?.TZS ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "UAH", rates?.UAH ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "UGX", rates?.UGX ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "USD", rates?.USD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "UYU", rates?.UYU ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "UZS", rates?.UZS ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "VEF", rates?.VEF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "VND", rates?.VND ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "VUV", rates?.VUV ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "WST", rates?.WST ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "XAF", rates?.XAF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "XAG", rates?.XAG ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "XAU", rates?.XAU ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "XCD", rates?.XCD ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "XDR", rates?.XDR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "XOF", rates?.XOF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "XPF", rates?.XPF ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "YER", rates?.YER ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ZAR", rates?.ZAR ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ZMK", rates?.ZMK ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ZMW", rates?.ZMW ?: 0.0
            )
        )
        listOfCurrency.add(
            CurrencyUIModel(
                "ZWL", rates?.ZWL ?: 0.0
            )
        )
        return listOfCurrency

    }
}