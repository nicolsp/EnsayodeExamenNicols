package com.example.ensayodeexamennicols.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ensayodeexamennicols.model.Dao.FotosDao
import com.example.ensayodeexamennicols.model.entities.Fotos

private const val DATA_BASE_NAME = "fotos_db"

@Database(entities = [Fotos::class],version =1)
abstract class FotosBasedeDatos : RoomDatabase() {
    abstract fun getFotosinDao(): FotosDao

    companion object{
        @Volatile
        private var INSTANCE: FotosBasedeDatos? = null


    }

}

