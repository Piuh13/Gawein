package com.example.gawein.main.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.gawein.main.data.Status
import com.example.gawein.main.data.local.model.Jobs
import com.example.gawein.main.data.local.model.SampleJobsList
import com.example.gawein.main.data.remote.emptyresponses
import java.io.File

class JobsRepository {
    val sendJobsResult = MutableLiveData<Status<emptyresponses>>()
    val getJobsResult = MutableLiveData<Status<emptyresponses>>()
    val jobsList = MutableLiveData<List<Jobs>>()
    fun getJobsList() : LiveData<List<Jobs>> {
        //Ini nantti diganti
        jobsList.value = SampleJobsList.sampleList
        return jobsList
    }

    fun sendJobs(pict : File, ) : LiveData<Status<emptyresponses>> {
        sendJobsResult.value = Status.Loading
        // ADD POST PLAN TO API
        return sendJobsResult
    }

    fun getJobs(position : String, company : String, isAccepted : Boolean, ) : LiveData<Status<emptyresponses>> {
        getJobsResult.value = Status.Loading
        // ADD GET PLAN FROM API
        return getJobsResult
    }

    companion object {
        @Volatile
        private var instance : JobsRepository? = null
        fun getInstance(
            //ADD API SERVICE
        ) = instance ?: synchronized(this) {
            instance ?: JobsRepository(
                //ADD API SERVICE
            )
        }.also { instance = it }
    }
}