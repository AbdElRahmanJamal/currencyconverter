package com.app.currencyconverter.presentation.main_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.core.domain.util.ResourceState
import com.app.currencyconverter.databinding.CurrencyConverterScreenFragmentBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CurrencyConverterScreen : Fragment() {


    private val viewModel: CurrencyConverterScreenViewModel by viewModels()
    private lateinit var binding: CurrencyConverterScreenFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            CurrencyConverterScreenFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launchWhenStarted {
            viewModel.uIState.observe(viewLifecycleOwner) {
                when (it) {
                    is ResourceState.LoadingState -> {
                        binding.loadingIndicator.visibility = View.VISIBLE
                    }
                    is ResourceState.ErrorState -> {
                        binding.loadingIndicator.visibility = View.GONE
                    }
                    is ResourceState.DataStat -> {
                        binding.loadingIndicator.visibility = View.GONE
                        val currencyItemAdapter = CurrencyItemAdapter(it.value) { uiModel ->
                            findNavController().navigate(
                                CurrencyConverterScreenDirections.actionCurrencyConverterScreenToConverterScreen(
                                    uiModel
                                )
                            )
                        }
                        binding.currencyList.apply {
                            setHasFixedSize(true)
                            layoutManager = LinearLayoutManager(context)
                            adapter = currencyItemAdapter
                            addItemDecoration(
                                DividerItemDecoration(
                                    context,
                                    DividerItemDecoration.VERTICAL
                                )
                            )
                        }
                    }
                }
            }
        }
    }

}