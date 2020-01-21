package com.example.todoapplication.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.todoapplication.R
import com.example.todoapplication.databinding.FragmentTasksBinding

class TasksFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTasksBinding>(inflater, R.layout.fragment_tasks, container, false)

        binding.button.setOnClickListener {
            Toast.makeText(context, "ハズレーーー", Toast.LENGTH_SHORT).show()
        }
        binding.button2.setOnClickListener {
            Toast.makeText(context, "ハズレーーー", Toast.LENGTH_SHORT).show()
        }
        binding.button3.setOnClickListener {
            it.findNavController().navigate(TasksFragmentDirections.actionTasksFragment2ToEditTaskFragment())
        }
        return binding.root
    }
}