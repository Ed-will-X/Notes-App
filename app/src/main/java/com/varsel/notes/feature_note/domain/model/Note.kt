package com.varsel.notes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.varsel.notes.ui.theme.*

@Entity
data class Note(
    val title: String,
    val body: String,
    val timestamp: Long,
    val color: Int,

    @PrimaryKey
    val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message) // 1. Custom Exception
