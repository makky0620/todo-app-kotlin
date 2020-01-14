package com.example.todoapplication.tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.todoapplication.R
import com.example.todoapplication.databinding.ActivityTasksBinding

class TasksActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTasksBinding
    private val myTask1: Task = Task("task1", "this is task1")
    private val myTask2: Task = Task("task2", "this is task2")
    private val myTask3: Task = Task("task3", "this is task3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tasks)
        binding.myTask1 = myTask1
        binding.myTask2 = myTask2
        binding.myTask3 = myTask3

        binding.addButton.setOnClickListener {
            binding.apply {
                myTask1?.name = "click"
                invalidateAll()
            }
        }
    }
}
