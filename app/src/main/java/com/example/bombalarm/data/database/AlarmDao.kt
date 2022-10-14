package com.example.bombalarm.data.database

import androidx.room.Dao
import androidx.room.Query
import com.example.bombalarm.data.Alarm

@Dao
interface AlarmDao {

    @Query("SELECT * FROM Alarm ORDER BY alarmId DESC")
    fun getAll(): List<Alarm>

}