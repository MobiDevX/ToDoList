package com.example.todolist.db

import androidx.room.*

@Dao
interface TaskDao {

    @Query("SELECT * FROM task ORDER BY priority")
    fun loadAllTasks(): List<Task>

    @Query("SELECT * FROM task WHERE id = :id")
    fun loadTaskById(id: Int): Task

    @Insert
    fun insertTask(task: Task)

    @Update()
    fun updateTask(task: Task)

    @Delete
    fun deleteTask(task: Task)

}