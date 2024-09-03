package com.example.fxapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.fxapp.databinding.RatesListItemBinding

class RatesListAdapter : Adapter<RatesViewHolder>() {
    private val ratesList = mutableListOf<RatesItem>()
    override fun onBindViewHolder(holder: RatesViewHolder, position: Int) {

        ratesList.getOrNull(position)?.let{holder.bind(it)}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RatesViewHolder {
        return RatesViewHolder(
            RatesListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,false

            )
        )
    }

    override fun getItemCount(): Int = ratesList.size
    fun updateList(data:List<RatesItem>){
        ratesList.clear()
        ratesList.addAll(data)
    }
}