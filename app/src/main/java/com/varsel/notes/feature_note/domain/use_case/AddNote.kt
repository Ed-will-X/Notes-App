package com.varsel.notes.feature_note.domain.use_case

import com.varsel.notes.feature_note.domain.model.InvalidNoteException
import com.varsel.notes.feature_note.domain.model.Note
import com.varsel.notes.feature_note.domain.repository.NoteRepository

class AddNote (
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class) // 2. Custom Exception
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("Title of the note can't be blank") // 3. Custom Exception
        }
        if(note.body.isBlank()) {
            throw InvalidNoteException("Body of the note can't be blank")
        }
        repository.insertNote(note)
    }
}