package com.example.todolist.db

import androidx.room.TypeConverter
import java.util.*

object DateConverter {
    @TypeConverter
    fun toDate(timestamp: Long?): Date? {
        return timestamp?.let { Date(it) }
    }
    @TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time
    }
}