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


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTasksBinding>(
            inflater, R.layout.fragment_tasks,
            container, false
        )

        val addDialog = AddTaskDialog()
        binding.addTaskButton.setOnClickListener {
            addDialog.show(fragmentManager!!, "add")
        }

        return binding.root
    }
}