package com.fox.dailylines.data.noteDataBase

import androidx.room.*
import com.fox.dailylines.data.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Insert
    suspend fun insertNewNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM Note_Table")
    fun getAllNotes(): Flow<List<Note>>
}