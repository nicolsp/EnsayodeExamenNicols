package com.example.ensayodeexamennicols.RetrofitRemoto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFotos {

    companion object {
        private const val URL_BASE = "https://source.unsplash.com/random/?"

    fun getRetrofitFotos(): ApiInterface {
        val mRetrofitFotos = Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return mRetrofitFotos.create(ApiInterface::class.java)
    }



    }




}