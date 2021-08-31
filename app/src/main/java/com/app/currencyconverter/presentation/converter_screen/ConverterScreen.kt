package com.app.currencyconverter.presentation.converter_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.app.currencyconverter.databinding.ConverterScreenFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConverterScreen : Fragment() {

    private lateinit var binding: ConverterScreenFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            ConverterScreenFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {

            val uiModel = ConverterScreenArgs.fromBundle(it).uiModel
            val currencyValue = uiModel.value.toString()
            binding.euroCurrency.setText("1")
            binding.euroCurrencyName.text = "EURO"
            binding.targetCurrencyName.text = uiModel?.name ?: ""
            binding.targetCurrency.setText(currencyValue)
            binding.targetCurrency.addTextChangedListener { mayNullEditable ->
                mayNullEditable?.let { editable ->

                    binding.euroCurrency.setText(
                        calculateCurrencyConverter(
                            currencyValue,
                            editable.toString()
                        ).toString()
                    )
                }
            }
        }
    }
}

fun calculateCurrencyConverter(serviceValue: String, userEnteredValue: String): Double {
    runCatching {
        val newValue: Double = userEnteredValue.toDouble()
        val oldValue: Double = serviceValue.toDouble()
        (newValue / oldValue)
    }.onSuccess {
        return it
    }.onFailure {
        return 0.0
    }
    return 0.0
}