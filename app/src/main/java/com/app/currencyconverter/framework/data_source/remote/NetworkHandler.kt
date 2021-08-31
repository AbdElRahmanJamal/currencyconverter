package com.app.currencyconverter.framework.data_source.remote

import android.util.Log
import com.app.core.domain.util.AppConstants
import com.app.core.domain.util.AppExceptions
import com.app.core.domain.util.ResourceState
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response
import javax.inject.Inject

class NetworkHandler<RESPONSE : Any> @Inject constructor(private val iODispatcher: CoroutineDispatcher) {

    private lateinit var state: ResourceState<RESPONSE>
    private lateinit var response: Response<RESPONSE>

    suspend fun callAPI(networkCall: suspend () -> Response<RESPONSE>) = flow {
        emit(ResourceState.LoadingState)
        val apiCall = CoroutineScope(iODispatcher)
            .launch(CoroutineExceptionHandler { _, exception ->
                Log.e(
                    "${AppConstants.LOGGER_KEY} :${NetworkHandler::class.java.simpleName}",
                    exception.toString()
                )
            }) {
                withTimeout(AppConstants.NETWORK_READ_TIME_OUT) {
                    response = networkCall()
                }
            }
        apiCall.join()
        apiCall.invokeOnCompletion {
            state = it?.let { error ->
                ResourceState.ErrorState(error)
            } ?: getDataOrThrowException(response)
        }
        emit(state)
    }.catch {
        emit(ResourceState.ErrorState(AppExceptions.GenericErrorException))
    }.flowOn(iODispatcher).distinctUntilChanged()

    private fun getDataOrThrowException(response: Response<RESPONSE>): ResourceState<RESPONSE> {
        return if (response.isSuccessful) {
            response.body()?.let {
                if (it.toString().isEmpty()) {
                    ResourceState.ErrorState(AppExceptions.GenericErrorException)
                } else {
                    ResourceState.DataStat(it)
                }
            } ?: ResourceState.ErrorState(AppExceptions.GenericErrorException)
        } else {
            ResourceState.ErrorState(AppExceptions.GenericErrorException)
        }
    }
}
