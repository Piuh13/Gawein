package com.example.gawein.main.api

import com.example.gawein.main.data.remote.UploadResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface apiService {
    @Multipart
    @POST("/upload")
    suspend fun uploadImage(
        @Part image: MultipartBody.Part
    ): ResponseBody
 /*   @Multipart
    @POST("upload")
    fun uploadImage(
        @Part img_file: MultipartBody.Part,
        @Part("desc") desc: RequestBody
    ): Call<UploadResponse>

    companion object{
        operator fun invoke(): apiService{
            return Retrofit.Builder()
                .baseUrl("http://34.101.46.212/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(apiService::class.java)
        }
    }*/
}