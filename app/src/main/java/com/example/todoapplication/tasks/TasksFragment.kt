package com.example.todoapplication.tasks

import android.content.ClipData
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapplication.R
import com.example.todoapplication.databinding.FragmentTasksBinding
import kotlinx.android.synthetic.main.fragment_taskitem_list.*
import kotlinx.android.synthetic.main.fragment_tasks.*

class TasksFragment : Fragment() {

    private lateinit var binding: FragmentTasksBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: MyTaskItemRecyclerViewAdapter
    private lateinit var viewManager: LinearLayoutManager

    private val items: MutableList<Task> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tasks, container, false)

//        createDataList()
        viewManager = LinearLayoutManager(context)
        viewAdapter = MyTaskItemRecyclerViewAdapter(items)

        val addDialog = AddTaskDialog { name: String, content: String ->
            viewAdapter.addItem(
                Task(name,content)
            )
        }
        binding.addTaskButton.setOnClickListener {
            addDialog.show(fragmentManager!!, "add")
        }

        recyclerView = binding.root.findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            setHasOptionsMenu(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

        return binding.root
    }

    private fun createDataList() {
        (1..10).forEach {
            items.add(Task(
                "task - $it",
                "memo memo memo memo memo"
            ))
        }
    }
}