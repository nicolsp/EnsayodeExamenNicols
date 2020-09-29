package com.example.ensayodeexamennicols.model.RetrofitRemoto.WFotos
import com.google.gson.annotations.SerializedName
data class PluFotos (
    @SerializedName("message")
    val message: List<String>,
    @SerializedName("status")
    val status: String
)
