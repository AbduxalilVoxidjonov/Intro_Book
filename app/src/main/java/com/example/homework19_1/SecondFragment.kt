package com.example.homework19_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.homework19_1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private val binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.apply {
            binding.imageView.setImageResource(getInt("img"))
            binding.textView1.text = getString("title")
            binding.textView2.text = getString("description")
        }

    }
}