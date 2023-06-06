package com.example.gawein.main.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gawein.databinding.FragmentHomeBinding
import com.example.gawein.main.data.local.model.sampleArticleList


class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.apply {
            val adapter = HomeAdapter(sampleArticleList.sampleArticle)
            homeRV.adapter = adapter
            homeRV.layoutManager = LinearLayoutManager(context)
            adapter.notifyDataSetChanged()
        }
        return binding.root
    }
}