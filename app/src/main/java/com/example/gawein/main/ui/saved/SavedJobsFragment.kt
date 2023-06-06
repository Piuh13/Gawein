package com.example.gawein.ui.saved

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gawein.main.data.local.model.SampleJobsList
import com.example.gawein.databinding.FragmentSavedJobsBinding
import com.example.gawein.main.ui.saved.SavedJobsAdapter


class SavedJobsFragment : Fragment() {
    private var _binding: FragmentSavedJobsBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSavedJobsBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.apply {
            val adapter = SavedJobsAdapter(SampleJobsList.sampleList)
            rv.adapter = adapter
            rv.layoutManager = LinearLayoutManager(context)
            adapter.notifyDataSetChanged()

        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}

