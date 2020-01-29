package com.example.todoapplication.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.todoapplication.R
import com.example.todoapplication.databinding.FragmentTasksBinding

class TasksFragment : Fragment() {

    private lateinit var binding: FragmentTasksBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tasks, container, false)

        val addDialog = AddTaskDialog { name: String, content: String -> addTask(name, content) }
        binding.addTaskButton.setOnClickListener {
            addDialog.show(fragmentManager!!, "add")
        }

        return binding.root
    }

    private fun addTask(name: String, content: String) {
        binding.invalidateAll()
        binding.taskName.text = getString(R.string.task_name) + ": " + name
        binding.taskContent.text = getString(R.string.task_content) + ": " + content
        binding.taskName.visibility = View.VISIBLE
        binding.taskContent.visibility = View.VISIBLE
    }
}