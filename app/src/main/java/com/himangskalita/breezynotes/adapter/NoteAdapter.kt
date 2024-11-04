package com.himangskalita.breezynotes.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.himangskalita.breezynotes.data.Note
import com.himangskalita.breezynotes.databinding.LayoutNoteBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class NoteAdapter
    (
    val notes: List<Note>,
    val onNoteClick: (Bundle) -> Unit
            ) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    inner class NoteViewHolder(val binding: LayoutNoteBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = LayoutNoteBinding.inflate(layoutInflater, parent, false)

        return NoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {

        val note = notes[position]

        holder.binding.apply {

            noteTitle.text = note.title
            noteDate.text = formatDate(note.date)
            noteContent.text = note.content
        }

        holder.binding.clNoteItem.setOnClickListener {

            val bundle = Bundle().apply {

                putString("title", note.title)
                putString("content", note.content)
                putString("date", formatDate(note.date))
            }

            onNoteClick(bundle)
        }
    }

    override fun getItemCount(): Int {

        return notes.size
    }

    private fun formatDate(date: Date) : String {

        val dateFormat = SimpleDateFormat("EEEE, dd MMMM, yyyy", Locale.getDefault())

        return dateFormat.format(date)
    }
}