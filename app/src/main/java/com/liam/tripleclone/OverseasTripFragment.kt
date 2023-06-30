package com.liam.tripleclone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.liam.tripleclone.databinding.FragmentOverseasTripBinding
import com.liam.tripleclone.databinding.FragmentTripStartBinding

class OverseasTripFragment: Fragment() {

    private var _binding: FragmentOverseasTripBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewpager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOverseasTripBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}