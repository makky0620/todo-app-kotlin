package com.example.todoapplication.tasks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todoapplication.data.TasksRepository

class TasksViewModel(
    private val tasksRepository: TasksRepository
) : ViewModel() {
    private val _items = MutableLiveData<List<String>>().apply { value = emptyList() }
    val items: LiveData<List<String>> = _items

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean> = _dataLoading
}