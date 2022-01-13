package com.fox.dailylines.data.noteDataBase.repository

import com.fox.dailylines.data.Note
import com.fox.dailylines.data.noteDataBase.DataBase

class NoteRepository {
    val dao = DataBase.getInstanceWithoutContext().NoteDao()

    suspend fun insertNewNote(note: Note) = dao.insertNewNote(note)

    suspend fun deleteNote(note: Note) = dao.deleteNote(note)

    fun getAllNotes() = dao.getAllNotes()
}