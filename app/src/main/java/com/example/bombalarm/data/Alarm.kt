package com.example.bombalarm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Alarm")
data class Alarm(
    @PrimaryKey(autoGenerate = false)
    var alarmId: Int,
    var alarmDate: Int,
    var alarmTime: Int,
    var alarmRepeatable: Int
)