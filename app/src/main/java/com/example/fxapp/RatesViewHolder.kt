package com.example.fxapp

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.fxapp.databinding.RatesListItemBinding

class RatesViewHolder (
    private val binding: RatesListItemBinding

) : ViewHolder(binding.root){
    fun bind(item:RatesItem){
        with(binding){
            textRate.text = item.rateValue
            textSymbolCode.text = item.symbolCode}
    }

}