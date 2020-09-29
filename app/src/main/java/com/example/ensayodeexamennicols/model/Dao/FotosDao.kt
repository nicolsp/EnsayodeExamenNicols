package com.example.ensayodeexamennicols.model.Dao

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ensayodeexamennicols.model.entities.Fotos

interface FotosDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllFotosList(list: List<Fotos>)

    @Query("SELECT * FROM fotos_table")
    fun getAllFotosList(): LiveData<List<Fotos>>
}