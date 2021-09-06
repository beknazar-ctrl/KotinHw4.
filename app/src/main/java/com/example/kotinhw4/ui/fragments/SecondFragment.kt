package com.example.kotinhw4.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotinhw4.databinding.FragmentSecondBinding
import com.example.kotinhw4.ui.models.MainViewModel

class SecondFragment : Fragment() {

    private lateinit var biding: FragmentSecondBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        biding = FragmentSecondBinding.inflate(inflater, container, false)
        return biding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        viewModel.counter.observe(viewLifecycleOwner, {
            biding.tvResultNumbersF2.text = it.toString()
        })
    }
}