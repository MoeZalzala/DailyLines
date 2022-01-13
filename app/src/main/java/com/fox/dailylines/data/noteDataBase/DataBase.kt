package com.fox.dailylines.data.noteDataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fox.dailylines.data.Note

@Database(entities = [Note::class], version = 1)
abstract class DataBase : RoomDatabase() {

    abstract fun NoteDao(): NoteDao

    companion object {
        private const val Database_Name = "Notes Database"

        @Volatile private var instance: DataBase? = null

        fun getInstance(context : Context): DataBase{
            return instance?: synchronized(this){ buildDatabase(context).also { instance = it }}
        }

        fun getInstanceWithoutContext(): DataBase{
            return instance!!
        }

        private fun buildDatabase(context: Context): DataBase{
            return Room.databaseBuilder(context, DataBase::class.java, Database_Name).build()
        }
    }
}