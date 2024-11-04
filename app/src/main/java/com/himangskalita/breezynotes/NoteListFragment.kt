package com.himangskalita.breezynotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.himangskalita.breezynotes.adapter.NoteAdapter
import com.himangskalita.breezynotes.data.Note
import com.himangskalita.breezynotes.databinding.FragmentNoteListBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class NoteListFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentNoteListBinding.inflate(inflater, container, false)

        val dateFormat = SimpleDateFormat("dd/mm/yyyy")
        val date = dateFormat.format(Calendar.getInstance().time)

        val notes = listOf<Note>(
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
            Note(
                0,
                "Exercise",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet tellus in diam egestas aliquam. Morbi non tortor lobortis, congue diam at, viverra nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla facilisi. Fusce odio orci, lobortis non aliquam non, pulvinar quis metus. In fermentum metus semper nisi congue, nec lobortis libero posuere. Nulla efficitur fringilla sollicitudin. Aliquam efficitur viverra erat, non lacinia eros pulvinar vitae. ",
                Date()
            ),
        )

        binding.rvNoteList.adapter = NoteAdapter(notes) { bundle ->

            findNavController().navigate(R.id.fgListToDetails, bundle)

        }

        binding.fabAddNote.setOnClickListener {

            val bundle = Bundle().apply {

                putString("date", formatDate(Date()))
            }

            findNavController().navigate(R.id.fgListToAddNote, bundle)
        }

        binding.rvNoteList.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }

    private fun formatDate(date: Date) : String {

        val dateFormat = SimpleDateFormat("EEEE, dd MMMM, yyyy", Locale.getDefault())

        return dateFormat.format(date)
    }

}