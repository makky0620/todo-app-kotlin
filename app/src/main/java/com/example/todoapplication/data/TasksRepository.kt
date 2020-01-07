package com.example.todoapplication.data

interface TasksRepository {
    suspend fun getTasks(forceUpdate: Boolean = false): List<String>

    suspend fun getTask(taskId: String, forceUpdate: Boolean = false): String

    suspend fun saveTask(task: String)

    suspend fun completeTask(task: String)

    suspend fun activateTask(task: String)

    suspend fun clearCompletedTasks()

    suspend fun deleteAllTasks()

    suspend fun deleteTask(taskId: String)
}