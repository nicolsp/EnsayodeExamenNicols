package com.example.ensayodeexamennicols.RoomLocal

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ensayodeexamennicols.RetrofitRemoto.Fotos

private const val DATA_BASE_NAME = "fotos_db"

@Database(entities = [Fotos::class],version =1)
abstract class FotosBasedeDatos : RoomDatabase() {
    abstract fun getFotosinDao(): FotosDao

    companion object{
        @Volatile
        private var INSTANCE: FotosBasedeDatos? = null


    }

}

