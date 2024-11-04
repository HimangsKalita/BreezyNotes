package com.himangskalita.breezynotes.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "note_table")
data class Note(

    @PrimaryKey(true)
    val id: Int?,
    var title: String,
    var content: String,
    val date: Date
)
