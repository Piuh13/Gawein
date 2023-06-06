package com.example.gawein.main.ui.saved

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gawein.R
import com.example.gawein.databinding.RvSavedJobsBinding
import com.example.gawein.main.data.local.model.Jobs


class SavedJobsAdapter(val listJobs: List<Jobs>) : RecyclerView.Adapter<SavedJobsAdapter.SavedJobsViewHolder>() {
    inner class SavedJobsViewHolder(val binding: RvSavedJobsBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedJobsViewHolder {
        val binding = RvSavedJobsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SavedJobsViewHolder(binding)
    }

    override fun getItemCount(): Int = listJobs.size

    override fun onBindViewHolder(holder: SavedJobsViewHolder, position: Int) {
        val jobs = listJobs[position]
        holder.apply {
            checkAccepted(binding, jobs.isAccepted, jobs)
        }
    }
    fun checkAccepted (binding: RvSavedJobsBinding, isAccepted : Boolean, jobs : Jobs) {
        binding.apply {
            if(isAccepted) {
                binding.acceptanceIcon.setImageResource(R.drawable.edible_icon_svg)
                jobsNameTextView.apply {
                    text = jobs.company
                    setTextColor(resources.getColor(R.color.blue))
                }
                positionNameTextView.apply {
                    text = jobs.position
                    setTextColor(resources.getColor(R.color.black))

                }
                acceptanceTextView.apply {
                    setTextColor(resources.getColor(R.color.textGreen))
                    text = "Anda Diterima "
                }
            } else {

                binding.acceptanceIcon.setImageResource(R.drawable.error_icon_svg)
                jobsNameTextView.apply {
                    text = jobs.company
                    setTextColor(resources.getColor(R.color.blue))
                }
                positionNameTextView.apply {
                    text = jobs.position
                    setTextColor(resources.getColor(R.color.black))
                }
                acceptanceTextView.apply {
                    setTextColor(resources.getColor(R.color.red))
                    text = "Anda Ditolak"
                }
            }
        }

    }
}