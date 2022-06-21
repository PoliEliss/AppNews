package com.rorono.newsapp.screens.savednews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rorono.newsapp.R
import com.rorono.newsapp.databinding.FragmentDetailsBinding
import com.rorono.newsapp.databinding.FragmentSavedBinding


class SavedFragment : Fragment() {

    private var _binding: FragmentSavedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSavedBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}