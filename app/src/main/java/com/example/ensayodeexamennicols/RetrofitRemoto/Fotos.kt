package com.example.ensayodeexamennicols.RetrofitRemoto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fotos_table")
data class Fotos(@PrimaryKey var fotos:String)

