package com.app.core.domain.util

import javax.inject.Qualifier

object DIQualifier {

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class QualifierConcurrencyConverterRemoteDataSource

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class QualifierConcurrencyConverterLocalDataSource

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class QualifierEntityDomainMapper
}