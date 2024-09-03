package com.example.fxapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fxapp.databinding.FragmentRatesBinding
import kotlin.random.Random


class RatesFragment : Fragment() {

    private lateinit var binding: FragmentRatesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRatesBinding.inflate(inflater, null, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding.recyclerRates) {
            layoutManager = LinearLayoutManager(context)
            adapter = RatesListAdapter().apply {
                updateList(generateMockRates())
            }
        }
    }

    private fun generateMockRates(): List<RatesItem> {
        return (0 until 100)
            .map {
                RatesItem(
                    symbolCode = mockSymbolCode(),
                    rateValue = String.format("%.4f", Random.nextInt(10000, 99999) / 10000f)
                )
            }
    }

    private fun mockSymbolCode(): String {
        return (0 until 3).map { Random.nextInt(65, 90).toChar() }.joinToString(separator = "")
    }
}



