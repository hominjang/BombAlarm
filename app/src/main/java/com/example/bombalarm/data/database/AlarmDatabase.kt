package com.example.bombalarm.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.bombalarm.data.Alarm


@Database(entities = [Alarm::class], version = 1)
abstract class AlarmDatabase : RoomDatabase() {
    abstract fun alarmDao(): AlarmDao
}