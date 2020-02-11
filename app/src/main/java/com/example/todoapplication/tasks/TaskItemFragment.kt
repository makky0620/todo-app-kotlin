package com.example.todoapplication.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapplication.R

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [TaskItemFragment.OnListFragmentInteractionListener] interface.
 */
class TaskItemFragment : Fragment() {

    private val items: MutableList<String> = mutableListOf()

    // TODO: Customize parameters
    private var columnCount = 1


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_taskitem_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {


            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = MyTaskItemRecyclerViewAdapter(items)
            }
        }
        return view
    }
}
