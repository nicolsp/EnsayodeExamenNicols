package com.example.ensayodeexamennicols.RetrofitRemoto

import android.telecom.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface  {

    @GET("realestate")
    fun getDataFromApi() : retrofit2.Call<List<Fotos>>

    @GET("realestate")
    suspend fun getDataFromApiCorutines(): Response<List<Fotos>>
}