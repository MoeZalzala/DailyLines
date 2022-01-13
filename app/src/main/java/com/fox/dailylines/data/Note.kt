package com.fox.dailylines.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Note_Table")
data class Note (
    @PrimaryKey(autoGenerate = true) val id:Long,
    @ColumnInfo(name = "Note Title") val description: String,
    @ColumnInfo(name = "Description") val content: String,
    @ColumnInfo(name = "Date") val date : String,
    @ColumnInfo(name = "Important") val important: Boolean
)