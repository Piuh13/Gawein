package com.example.gawein.main.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.gawein.main.data.Status
import com.example.gawein.main.data.remote.emptyresponses


class AuthRepository {
    val loginResult = MutableLiveData<Status<emptyresponses>>()
    val registerResult = MutableLiveData<Status<emptyresponses>>()

    fun login(email : String, password: String) : LiveData<Status<emptyresponses>> {
        loginResult.value = Status.Loading
        // tempat untuk API Login
        return loginResult
    }
    fun register(email : String, password : String) : LiveData<Status<emptyresponses>> {
        registerResult.value = Status.Loading
        //Tempat Untuk API register
        return registerResult
    }

    companion object {
        @Volatile
        private var instance : AuthRepository? = null
        fun getInstance(
            //ADD API SERVICE
        ) = instance ?: synchronized(this) {
            instance ?: AuthRepository(
                //ADD API SERVICE
            )
        }.also { instance = it }
    }
}