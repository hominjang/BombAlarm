package com.example.bombalarm

import android.content.Context
import androidx.room.Room
import com.example.bombalarm.data.database.AlarmDatabase

class ServiceLocator (applicationContext: Context){

    private val alarmDatabase = Room.databaseBuilder(
        applicationContext,
        AlarmDatabase::class.java,
        "alarm.db"
    ).build()

    val alarmDatabaseInstance = alarmDatabase.alarmDao()

}