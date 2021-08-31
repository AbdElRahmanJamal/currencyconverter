package com.app.core.domain.util

sealed class ResourceState<out T : Any> {
    class DataStat<T : Any>(val value: T) : ResourceState<T>()
    class ErrorState(val throwable: Throwable) : ResourceState<Nothing>()
    object LoadingState : ResourceState<Nothing>()
}