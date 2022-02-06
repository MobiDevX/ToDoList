package com.example.todolist.db

import androidx.room.*
import java.util.*

@Entity
data class Task(
    // Аннотация @PrimaryKey указывает ключ таблицы
    @PrimaryKey(autoGenerate = true) val id: Int,
    var description: String = "Nothing",
    var priority: Int = 3,
    var updatedAt: Date = Date(),
)
