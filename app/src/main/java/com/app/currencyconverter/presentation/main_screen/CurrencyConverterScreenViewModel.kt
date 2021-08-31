package com.app.currencyconverter.presentation.main_screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.core.domain.interactors.concurrency_converter.GetLatestConcurrencyRatesBasedOnEuroUseCase
import com.app.core.domain.ui_model.CurrencyUIModel
import com.app.core.domain.util.ResourceState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrencyConverterScreenViewModel @Inject constructor(
    private val getLatestConcurrencyRatesBasedOnEuroUseCase: GetLatestConcurrencyRatesBasedOnEuroUseCase,
    private val iODispatcher: CoroutineDispatcher
) : ViewModel() {

    private val _uIState = MutableLiveData<ResourceState<List<CurrencyUIModel>>>()
    var uIState: LiveData<ResourceState<List<CurrencyUIModel>>> = _uIState

    init {
        getLatestConcurrencyRatesBasedOnEuro()
    }

    private fun getLatestConcurrencyRatesBasedOnEuro() {
        viewModelScope.launch(iODispatcher) {
            getLatestConcurrencyRatesBasedOnEuroUseCase.getLatestConcurrencyRatesBasedOnEuro()
                .collect {
                    _uIState.postValue(it)
                }
        }
    }

}