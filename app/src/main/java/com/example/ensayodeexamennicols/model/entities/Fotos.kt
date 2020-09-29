package com.example.ensayodeexamennicols.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="fotos_table")
data class Fotos(@PrimaryKey val fotos:String)
