package com.example.todoapplication.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.todoapplication.databinding.FragmentTasksBinding

class TasksFragment : Fragment() {

    private val viewModel: TasksViewModel by viewModels()
    private lateinit var binding: FragmentTasksBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTasksBinding.inflate(inflater, container, false).apply {
            viewmodel = viewModel
        }

        return binding.root
    }
}