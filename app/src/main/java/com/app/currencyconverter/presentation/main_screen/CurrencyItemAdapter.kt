package com.app.currencyconverter.presentation.main_screen


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.app.core.domain.ui_model.CurrencyUIModel


class CurrencyItemAdapter(
    private val currencyList: List<CurrencyUIModel>,
    private val goToConverterScreen: (currencyUIModel:CurrencyUIModel) -> Unit
) :
    RecyclerView.Adapter<CurrencyItemAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameTextView: TextView =
            itemView.findViewById(com.app.currencyconverter.R.id.currency_name)
        val valueTextView: TextView =
            itemView.findViewById(com.app.currencyconverter.R.id.currency_value)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val contactView =
            inflater.inflate(com.app.currencyconverter.R.layout.currency_item, parent, false)

        return ViewHolder(contactView)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val uiModel = currencyList[position]
        viewHolder.itemView.setOnClickListener {
            goToConverterScreen.invoke(uiModel)
        }
        viewHolder.nameTextView.text = uiModel.name
        viewHolder.valueTextView.text = uiModel.value.toString()

    }

    override fun getItemCount() = currencyList.size

}