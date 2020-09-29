package com.example.ensayodeexamennicols.model.RetrofitRemoto

import com.example.ensayodeexamennicols.model.entities.Fotos
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface  {

    @GET("realestate")
    fun getDataFromApi() : retrofit2.Call<List<Fotos>>

    @GET("realestate")
    suspend fun getDataFromApiCorutines(): Response<List<Fotos>>
}